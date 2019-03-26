public class AES1 implements IDecrypter, IEncrypter {
    private Key k1;
    private Key k2;
    private Key k3;

    public AES1(Key k1, Key k2, Key k3) {
        this.k1 = k1;
        this.k2 = k2;
        this.k3 = k3;
    }

    @Override
    public PlainText Decrypt(CipherText cypherText) {
        return null;
    }

    @Override
    public CipherText Encrypt(PlainText message) {
        return null;
    }
}
