import java.util.ArrayList;

public class AES3 implements IDecrypter, IEncrypter{
    private ArrayList<AES1> aes;

    public AES3(Key k1, Key k2, Key k3) {
        this.aes=new ArrayList<>();
        aes.add(new AES1(k1));
        aes.add(new AES1(k2));
        aes.add(new AES1(k3));
    }

    @Override
    public PlainText Decrypt(CipherText cypherText) {
        CipherText curr = cypherText;
        for(int i = 0; i < 3; i++)
            curr = new CipherText(aes.get(aes.size()- i - 1).Decrypt(curr));

        return new PlainText(curr);
    }

    @Override
    public CipherText Encrypt(PlainText message) {
        PlainText curr = message;
        for(int i = 0; i < 3; i++)
            curr = new PlainText(aes.get(i).Encrypt(curr));

        return new CipherText(curr);
    }
}
