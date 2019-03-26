public class AES1 implements IDecrypter, IEncrypter {
    private Key k;

    public AES1(Key k) {
        this.k = k;
    }

    @Override
    public PlainText Decrypt(CipherText cypherText) {
        return null;
    }

    @Override
    public CipherText Encrypt(PlainText message) {
        CipherText cipherText = new CipherText();

        for (Block128 block : message.getBlocks()) {
            cipherText.addBlock(XORcerer.XOR(RowsShifter.shiftRows(block),k.getBytes()));
        }
    }
}
