public interface IEncrypter {
    /**
     * @param message - the message to encrypt
     * @return cypher text of message using the encryption algorithm
     */
    CipherText Encrypt(PlainText message);
}

