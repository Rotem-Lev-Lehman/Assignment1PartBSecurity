public class AES1 implements IDecrypter, IEncrypter {
    private Key k;

    public AES1(Key k) {
        this.k = k;
    }

    @Override
    public PlainText Decrypt(CipherText cypherText) {
        PlainText plainText = new PlainText();

        for(Block128 block128 : cypherText.getBlocks())
            plainText.addBlock(RowsShifter.shiftRowsBackwards(XORcerer.XOR(block128, k.getBytes())));

        return plainText;
    }

    @Override
    public CipherText Encrypt(PlainText message) {
        CipherText cipherText = new CipherText();

        for (Block128 block : message.getBlocks())
            cipherText.addBlock(XORcerer.XOR(RowsShifter.shiftRows(block), k.getBytes()));

        return cipherText;
    }
}
