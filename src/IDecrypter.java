public interface IDecrypter {
    /**
     * @param cypherText - the cypher text to decrypt
     * @return the original message decrypted by the decryption algorithm
     */
    byte[] Decrypt(byte[] cypherText);
}

