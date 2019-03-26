public class Key {
    private Block128 bytes;

    public Key(Block128 bytes) {
        this.bytes = bytes;
    }

    public Block128 getBytes() {
        return bytes;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Key))
            return false;
        Key key=(Key)obj;
        return bytes.equals(key.getBytes());
    }
}
