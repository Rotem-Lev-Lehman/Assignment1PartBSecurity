import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class AES3 implements IDecrypter, IEncrypter{
    private Key k1;
    private Key k2;
    private Key k3;

    public AES3(Key k1, Key k2, Key k3) {
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
