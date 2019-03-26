import java.util.ArrayList;

public  abstract class Text {
    ArrayList<Block128> blocks;

    public Text() {
        this.blocks = new ArrayList<>();
    }

    public Text(ArrayList<Block128> blocks) {
        this.blocks = blocks;
    }

    public void addBlock(Block128 block){
        blocks.add(block);
    }
    public ArrayList<Block128> getBlocks(){
        return blocks;
    }

    public int getSize(){
        return (128*blocks.size());
    }
}
