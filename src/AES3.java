public class AES3 implements IDecrypter, IEncrypter{
    private AES1 aes1;

    public AES3(Key k1, Key k2, Key k3) {
        this.aes1 = new AES1(k1,k2,k3);
    }

    @Override
    public PlainText Decrypt(CipherText cypherText) {
        CipherText curr = cypherText;
        for(int i = 0; i < 3; i++)
            curr = new CipherText(aes1.Decrypt(curr));

        return new PlainText(curr);
    }

    @Override
    public CipherText Encrypt(PlainText message) {
        PlainText curr = message;
        for(int i = 0; i < 3; i++)
            curr = new PlainText(aes1.Encrypt(curr));

        return new CipherText(curr);
    }
}
