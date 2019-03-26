import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class AES3 implements IDecrypter, IEncrypter{
    private byte[] k1;
    private byte[] k2;
    private byte[] k3;

    public AES3(byte[] k1, byte[] k2, byte[] k3) {
        this.k1 = k1;
        this.k2 = k2;
        this.k3 = k3;
    }

    @Override
    public PlainText Decrypt(CipherText cypherText) {
        throw new NotImplementedException();
    }

    @Override
    public CipherText Encrypt(PlainText message) {

        throw new NotImplementedException();
    }
}
