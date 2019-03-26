import java.util.ArrayList;

public abstract class MyFileWriter {
    protected String path;
    public MyFileWriter(String path) {
        this.path = path;
    }

    /**
     * @return the content of the file (in byte array)
     */
    public abstract void writeToFile(ArrayList<Block128> blocks);
}
