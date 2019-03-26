public class Key {
    private Block128 bytes;

    public Key(Block128 bytes) {
        this.bytes = bytes;
    }

    public Block128 getBytes() {
        return bytes;
    }
}
