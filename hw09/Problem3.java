package hw09;
import java.util.*;
public class Problem3 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.print("Enter an Integer Value to be turned into Binary: ");
        String inputString = userInput.nextLine();
        try {
            System.out.println("The Binary value is: " + bin2Dec(inputString));
        } 
        catch (BinaryFormatException ex) {
            ex.printStackTrace();
            System.out.println("Error: Value entered is NOT a binary number.");
        }
    }
    public static int bin2Dec(String s) throws BinaryFormatException {
        int decimal = 0;
        int stringLength = s.length();
        for (int i = 0; i < stringLength; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '1') { //If character in the entered string is not within 1 or 0, its not a binary val
                throw new BinaryFormatException("Error: NumberFormatException");
            }

            decimal += (s.charAt(i) - '0') * Math.pow(2, stringLength - 1 - i);
        }
        return decimal;
    }
}

class BinaryFormatException extends IllegalArgumentException {
    BinaryFormatException(String s) {
        super(s);
    }
}
