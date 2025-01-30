/**
 * This class contains functions that implement the Caesar substitution cipher. These functions
 * can be used to encrypt or decrypt provided text.
 * 
 * @author Sitara Singh
 */
public class CaesarCipher {
    
    /**
     * The main method
     * 
     * @param args command-line arguments
     */
    public static void main(String[] args) {
        // TODO: check if enough command-line arguments were provided
        // TODO: check if the first command-line argument is "encrypt" or "decrypt" 
        // TODO: check if the second command-line argument is a valid number

        // TODO: convert the second command-line argument into an integer and save
        //  it in the shiftN variable
        int shiftN;
        if (args[0].equals("encrypt")) {
            // TODO: get the text from the standard input stream and save it in the
            // plainText variable
            String plainText = null;
            String encrypted = encryptText(plainText, shiftN);
        } else {
            // decrypt
            // TODO: get the text from the standard input stream and save it in the
            // encryptedText variable
            String encryptedText = null;
            String decrypted = decryptText(encryptedText, shiftN);
        }
    }

    /**
     * Uses the Caesar substitution cipher to encrypt the given text.
     * 
     * @param input the plaintext provided by the user for encryption
     * @param shiftN the number of positions to shift each letter
     * @return
     */
    private static String encryptText(String input, int shiftN) {
        // TODO: complete this function
        // Resource: https://hackerbytes.hackthedegree.com/2/core-concept/standard/what-is-ascii
        return null;
    }

    /**
     * Decrypts text encrypted using the Caesar substitution cipher.
     * 
     * @param input the encrypted text provided by the user for decryption
     * @param shiftN the number of positions each letter was shifted
     * @return
     */
    private static String decryptText(String input, int shiftN) {
        // TODO: complete this function
        // Resource: https://hackerbytes.hackthedegree.com/2/core-concept/standard/what-is-ascii
        return null;
    }
}
