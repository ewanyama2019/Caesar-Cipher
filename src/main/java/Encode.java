//import java.util.*;

public class Encode {

//    private String messageInput;
//    private int shiftValue;
    private String encryptedInput;

    CaesarCipher cCipherIn2 = new CaesarCipher();



    private String encryptMessage( String messageInput, int shiftValue ){
        shiftValue = shiftValue % 26 + 26;
        StringBuilder encryptedMessage = new StringBuilder();
        for (char i : messageInput.toCharArray())
            if (Character.isLetter(i)) {
                if (Character.isUpperCase(i)) {
                    encryptedMessage.append((char) ('A' + (i - 'A' + shiftValue) % 26));
                } else {
                    encryptedMessage.append((char) ('a' + (i - 'a' + shiftValue) % 26));
                }
            } else {
                encryptedMessage.append(i);
            }

        return encryptedInput = encryptedMessage.toString();

    }

    public String encrypt(){
        encryptMessage(cCipherIn2.getMessageInput(), cCipherIn2.getShiftValue());
        return encryptedInput;

    }
}
