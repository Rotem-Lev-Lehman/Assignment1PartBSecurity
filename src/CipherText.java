import java.util.ArrayList;

public class CipherText extends Text{
    public CipherText(ArrayList<Block128> blocks) {
        super(blocks);
    }

    public CipherText(PlainText plainText) {
        super(plainText.getBlocks());
    }
}
