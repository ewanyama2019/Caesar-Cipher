//import java.io.Console;
import java.util.*;

class CaesarCipher {

    private String messageInput;
    private int shiftValue;




    private void getMessage() {
        System.out.println("Please Input the text that you wish to encrypt");
        Scanner sc = new Scanner(System.in);
//        Console myConsole = System.console();
        messageInput = sc.nextLine();
    }

    public String getMessageInput(){
        getMessage();
        return messageInput;
    }

    private void getShift() {
        System.out.println("Please enter a Numeric Step value ...(1 to 26) ");
        Scanner sc = new Scanner(System.in);
////        Console myConsole = System.console();
        shiftValue = sc.nextInt();
////        shiftValue =Integer.parseInt(shiftValueStr);
    }
//
    public int getShiftValue(){
        getShift();
        return shiftValue;
    }

//    private String encryptMessage( String messageInput, int shiftValue ){
//        shiftValue = shiftValue % 26 + 26;
//        StringBuilder encryptedMessage = new StringBuilder();
//        for (char i : messageInput.toCharArray()) {
//            if (Character.isLetter(i)) {
//                if (Character.isUpperCase(i)){
//                    encryptedMessage.append((char) ('A' + (i - 'A' + shiftValue) % 26 ));
//            } else {
//                encryptedMessage.append((char) ('a' + (i - 'a' + shiftValue) % 26));
//            }
//            } else {
//                encryptedMessage.append(i);
//            }
//
//        }
//
//        return encryptedInput = encryptedMessage.toString();
//
//    }
//
//    public String encrypt(){
//        encryptMessage(messageInput, shiftValue);
//        return encryptedInput;
//
//    }

}
