import java.util.ArrayList;

public class Block128 {
    byte[][] bytes;

    public Block128(byte[][] bytes) {
        this.bytes = bytes;
    }

    public byte[][] getBytes() {
        return bytes;
    }

    public static ArrayList<Block128> generateBlocks(byte[] text){

    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Block128))
            return false;
        Block128 block=(Block128)o;
        byte[][] secondBytes=block.getBytes();
        if(bytes.length!=secondBytes.length || bytes[0].length!=secondBytes[0].length)
            return false;
        for(int i=0;i<bytes.length;i++){
            for(int j=0;j<bytes[0].length;j++){
                if(bytes[i][j]!=secondBytes[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void testEquels(){
        byte[][] bytes1={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,1}};
        byte[][] bytes2={{1,1,1,1},{1,1,1,1},{1,1,1,1},{1,1,1,2}};
        Block128 one=new Block128(bytes1);
        Block128 two=new Block128(bytes1);
        Block128 three=new Block128(bytes2);
        System.out.println(one.equals(two));
        System.out.println(one.equals(three));
        System.out.println(three.equals(two));
    }
}
