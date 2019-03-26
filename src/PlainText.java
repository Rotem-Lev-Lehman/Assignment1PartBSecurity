import java.util.ArrayList;

public class PlainText extends Text {

    public PlainText(ArrayList<Block128> blocks) {
        super(blocks);
    }

    public PlainText(CipherText cipherText) {
        super(cipherText.getBlocks());
    }

    public PlainText() {
        super();
    }
}
