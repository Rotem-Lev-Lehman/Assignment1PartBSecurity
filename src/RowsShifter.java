public class RowsShifter {

    public static byte[][] shiftRows(byte[][] arr){
        return shift(arr,true);
    }

    public static byte[][] shiftRowsBackwards(byte[][] arr){
        return shift(arr,false);
    }

    public static Block128 shiftRows(Block128 block128) {
        return new Block128(shiftRows(block128.getBytes()));
    }

    public static Block128 shiftRowsBackwards(Block128 block128) {
        return new Block128(shiftRowsBackwards(block128.getBytes()));
    }

    private static byte[][] shift(byte[][] arr,boolean forward){
        byte[][] ans=new byte[arr.length][arr[0].length];
        for(int rowNum=0;rowNum<ans.length;rowNum++){
            for (int colNum=0;colNum<ans[0].length;colNum++){
                int takeFrom;
                if(forward){
                    takeFrom=colNum+rowNum;
                    if(takeFrom>=ans[0].length)
                        takeFrom=takeFrom-ans[0].length;
                }
                else{
                    takeFrom=colNum-rowNum;
                    if(takeFrom<0)
                        takeFrom=ans[0].length+takeFrom;
                }
                ans[rowNum][colNum]=arr[rowNum][takeFrom];
            }
        }
        return ans;
    }

    public static void test(){
        byte[][] test=new byte[4][4];
        int counter=0;
        System.out.println("Before shift:");
        System.out.println("----------");
        for(int rowNum=0;rowNum<test.length;rowNum++){
            String print="";
            for (int colNum=0;colNum<test[0].length;colNum++){
                test[rowNum][colNum]=(byte)counter;
                counter++;
                print+=test[rowNum][colNum]+"-";
            }
            System.out.println(print.substring(0,print.length()-1));
        }
        System.out.println("----------");
        System.out.println("After shift:");
        System.out.println("----------");
        test=shiftRows(test);
        for(int rowNum=0;rowNum<test.length;rowNum++){
            String print="";
            for (int colNum=0;colNum<test[0].length;colNum++){
                print+=test[rowNum][colNum]+"-";
            }
            System.out.println(print.substring(0,print.length()-1));
        }
        System.out.println("----------");
    }
}


