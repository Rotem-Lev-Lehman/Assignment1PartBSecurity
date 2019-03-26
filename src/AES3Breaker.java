import java.util.ArrayList;

public class AES3Breaker {

    public static ArrayList<Key> getKeys(PlainText pt,CipherText ct){
        ArrayList<Key> keys=new ArrayList<>();
        Key key1,key2,key3;
        do {
            key1=getRandomKey();
            keys.add(key1);
            key2=getRandomKey();
            keys.add(key2);
            ArrayList<Block128> afterFirst,afterSecond,afterThird;
            afterFirst=shiftNxor(pt.getBlocks(),key1);
            afterSecond=shiftNxor(afterFirst,key2);
            afterThird=new ArrayList<>();
            for (Block128 block:afterSecond) {
                afterThird.add(RowsShifter.shiftRows(block));
            }
            key3=new Key(XORcerer.XOR(afterThird.get(0),ct.getBlocks().get(0)));
            keys.add(key3);
        }
        while (keysNotDifferent(key1,key2,key3));
        return keys;
    }

    private static boolean keysNotDifferent(Key key1, Key key2, Key key3) {
        if(key1.equals(key2) || key1.equals(key3) || key2.equals(key3))
            return true;
        return false;
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

    private static ArrayList<Block128> shiftNxor(ArrayList<Block128> blocks,Key key){
        ArrayList<Block128> ans=new ArrayList<>();
        for (Block128 block:blocks) {
            Block128 newOne=RowsShifter.shiftRows(block);
            newOne= XORcerer.XOR(newOne,key.getBytes());
            ans.add(newOne);
        }
        return ans;
    }
}
