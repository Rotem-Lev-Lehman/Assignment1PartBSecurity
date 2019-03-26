import java.util.ArrayList;

public class AES3Breaker {

    public static ArrayList<Key> getKeys(PlainText pt,CipherText ct){
        ArrayList<Key> keys=new ArrayList<>();
        Key key1,key2,key3;
        key1=getRandomKey();
        keys.add(key1);
        key2=getRandomKey();
        keys.add(key2);

        return keys;
    }

    private static Key getRandomKey(){
        byte[][] bytes=new byte[4][4];
        for(int i=0;i<bytes.length;i++){
            for(int j=0;j<bytes[0].length;j++){
                bytes[i][j]=(byte)((int)(Math.random()*2));
            }
        }
        return new Key(new Block128(bytes));
    }
}
