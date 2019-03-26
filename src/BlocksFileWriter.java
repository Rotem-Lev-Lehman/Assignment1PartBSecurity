import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BlocksFileWriter extends MyFileWriter {
    public BlocksFileWriter(String path) {
        super(path);
    }

    @Override
    public void writeToFile(ArrayList<Block128> blocks) {
        byte[] bytes = Block128.toByteArray(blocks);
        try {
            Files.write(Paths.get(path), bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
