import java.io.BufferedWriter;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try{
            if(args.length!=7)
                System.out.println("Not enough arguments");
            else if(!(args[0].equals("-e") || args[0].equals("-d") || args[0].equals("-b")))
                System.out.println("Wrong arguments");
            else if(args[0].equals("-e") || args[0].equals("-d")){
                BlocksFileReader keys=new BlocksFileReader(args[2]);
                ArrayList<Block128> keysBlocks=keys.readFile();
                Key key1=new Key(keysBlocks.get(0));
                Key key2=new Key(keysBlocks.get(1));
                Key key3=new Key(keysBlocks.get(2));
                BlocksFileReader input=new BlocksFileReader(args[4]);
                AES3 aes3=new AES3(key1,key2,key3);
                ArrayList<Block128> ans;
                if(args[0].equals("-e")){
                    PlainText pt=new PlainText(input.readFile());
                    CipherText ct=aes3.Encrypt(pt);
                    ans=ct.getBlocks();
                }
                else{
                    CipherText ct=new CipherText(input.readFile());
                    PlainText pt=aes3.Decrypt(ct);
                    ans=pt.getBlocks();
                }
                BlocksFileWriter output=new BlocksFileWriter(args[6]);
                output.writeToFile(ans);
                System.out.println("Operation Completed successfully!");
            }
            else if(args[0].equals("-b")){
                BlocksFileReader ptBytes=new BlocksFileReader(args[2]);
                BlocksFileReader ctBytes=new BlocksFileReader(args[4]);
                PlainText pt=new PlainText(ptBytes.readFile());
                CipherText ct=new CipherText(ctBytes.readFile());
                ArrayList<Key> keys=AES3Breaker.getKeys(pt,ct);
                ArrayList<Block128> ans=new ArrayList<>();
                for (Key key:keys) {
                    ans.add(key.getBytes());
                }
                BlocksFileWriter output=new BlocksFileWriter(args[6]);
                output.writeToFile(ans);
                System.out.println("Operation Completed successfully!");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

}
