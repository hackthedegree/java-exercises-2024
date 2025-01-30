# Caesar Cipher

**BACKGROUND**: Suetonius (c. 69–122 ce) writes the following in his Life of Julius Caesar:

> Si qua occultius perferenda erant, per notas scripsit, id est sic structo litterarum ordine, ut nullum verbum effici posset: quae si qui investigare et persequi velit, quartam elementorum litteram, id est D pro A et perinde reliquas commutet. http://thelatinlibrary.com/suetonius/suet.caesar.html#56

This is to say: "If he had anything confidential to say, he wrote it in cipher, that is, by so changing the order of the letters, that not a word could be made out: If anyone wishes to decipher these, and get at their meaning, he must substitute the fourth letter of the alphabet, namely
D, for A, and so with the others."

This describes a type of substitution cipher, in which each letter in the plaintext (the input) is replaced by letter some fixed number of positions down the alphabet.
In the so-called Caesar cipher, for example, we decode any uppercase letter by shifting it right by 3 positions, so that A is decoded as D, B as E, C as F, and so on, "wrapping around", so that X is decoded as A, Y as B, and Z as C. Encoding is equally simple, shifting any uppercase letter 3 positions to the left. Using Figure 1, we decode "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD" as "THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG".

*Figure 1: The alignment of plaintext and ciphertext in the Caesar cipher.*

Plaintext      A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
Ciphertext     X Y Z A B C D E F G H I J K L M N O P Q R S T U V W

Mathematically speaking, we can express encoding and decoding using modular arithmetic. To keep things simple, we only shift right for both encoding and decoding. If we think of A as position 0, B as position 1, and so on, for a shift of n positions of the letter x, we define decoding D_n(x) and encoding E_n(x) for 0 <= n, x < 26 as:

(1)    D_n(x) = (x + n) mod 26
(2)    E_n(x) = (x − n) mod 26 = (x + 26 − n) mod 26

since 26 mod 26 = 0. Note that Equations (2) and (3) have the same form, and E_n(x) = D_26-n(x): : Modularly speaking, shifting n positions le is the same as shifting 26 - n positions right. Hence, since we decode the Caesar cipher with D_3(x), we can also encode the Caesar cipher with E_3(x) = D_26-3(x) = D_23(x).

**Note:** Spaces (" ") are encrypted as spaces (" ") i.e. they remain the same.

## The Program
You are going to complete the code to implement the Caesar Cipher in the program named `CaesarCipher.java`. The `encryptText` function must encrypt the provided plaintext using the substitution cipher described above while the `decryptText` function implements the decryption protocol to convert encrypted text back to it's plaintext form.

### Using the Program
Once the program has been compiled it is used as follows to encrypt plaintext:
```shell
java CaesarCipher encrypt 3 < plaintext.txt
```
where 3 is the number we want to shift each letter and the `plaintext.txt` is the text file containing the text we want to encrypt. An example of a `plaintext.txt`:
```text
THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
```
The encrypted text is displayed via the standard output stream.

To decrypt text the program is run as follows:
```shell
java CaesarCipher decrypt 3 < encrypted.txt
```
where 3 is the number the letter of the text were shifted by and the `encrypted.txt` is the text file containing the text to decrypt, for example:
```text
QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
```
The decrypted text is displayed via the standard output stream.

Hence the first command-line argument determines whether the program should be run in the encryption or decryption mode. The second command-line argument is the **n** value for the encryption/decryption process. The text to encrypt or decrypt is provided via the standard input stream.

## Checking the command-line arguments
If an invalid number of command-line arguments is provided then display this error:
```
Error: Invalid number of arguments provided
```

If the first argument is not "encrypt" or "decrypt" then display the following error:
```
Error: Invalid encryption/decryption mode provided
```

If the second argument is not a valid number then display the following error:
```
Error: Invalid shift parameter provided
```
