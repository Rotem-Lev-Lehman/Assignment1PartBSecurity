import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class BlocksFileReader extends MyFileReader {
    public BlocksFileReader(String path) {
        super(path);
    }

    @Override
    public ArrayList<Block128> readFile() {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(path));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
