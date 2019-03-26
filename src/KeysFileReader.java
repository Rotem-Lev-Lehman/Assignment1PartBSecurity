import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class KeysFileReader extends MyFileReader {
    public KeysFileReader(String path) {
        super(path);
    }

    @Override
    public byte[] readFile() {
        try {
            FileReader reader = new FileReader(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new NotImplementedException();

    }
}
