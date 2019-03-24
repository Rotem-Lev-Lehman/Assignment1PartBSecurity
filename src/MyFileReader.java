public abstract class MyFileReader {
    protected String path;
    public MyFileReader(String path) {
        this.path = path;
    }

    /**
     * @return the content of the file (in byte array)
     */
    public abstract byte[] readFile();
}
