public class XORcerer {
    public static byte[][] XOR(byte[][] first,byte[][] second){
        if(first.length!=second.length || first[0].length!=second[0].length)
            return null;
        byte[][] ans=new byte[first.length][first[0].length];
        for(int row=0;row<ans.length;row++){
            for(int col=0;col<ans[0].length;col++){
                ans[row][col]=(byte)(first[row][col]^second[row][col]);
            }
        }
        return ans;
    }
}
