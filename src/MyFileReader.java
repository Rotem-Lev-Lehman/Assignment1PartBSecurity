import java.util.ArrayList;

public abstract class MyFileReader {
    protected String path;
    public MyFileReader(String path) {
        this.path = path;
    }

    /**
     * @return the content of the file (in byte array)
     */
    public abstract ArrayList<Block128> readFile();
}
