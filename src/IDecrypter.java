public interface IDecrypter {
    /**
     * @param cypherText - the cypher text to decrypt
     * @return the original message decrypted by the decryption algorithm
     */
    PlainText Decrypt(CipherText cypherText);
}

