package hw09;
import java.util.*;
public class Problem2 {
    private static Scanner userInput;

    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.print("Enter an Integer Value to be turned into Binary: ");
        String inputString = userInput.nextLine();
        try {
            System.out.println("The Binary value is: " + bin2Dec(inputString));
        } 
        catch (NumberFormatException ex) {
            System.out.println("Error: Value entered is NOT a binary number.");
        }
    }
//decimial/integer to binary works by taking the remainders of your initial integer and using them as the binary form
// if you have a val of 12, divide 12 by 2 to get 6; Remainder 0, then divide 6 by 2 to get 3; remainder of 0,
// Then 3 divided by 2 gives 1; remainder of 1, then 1 divided by 2 gives 0 with a remainder of 1
// Therefore the binary value is 1100
//now reverse this
    public static int bin2Dec(String s) throws NumberFormatException {
        int decimal = 0;
        int stringLength = s.length();
        for (int i = 0; i < stringLength; i++) {
            if (s.charAt(i) < '0' || s.charAt(i) > '1') { //If character in the entered string is not within 1 or 0, its not a binary val
                throw new NumberFormatException("Error: NumberFormatException");
            }

            decimal += (s.charAt(i) - '0') * Math.pow(2, stringLength - 1 - i);
        }
        return decimal;
    }
}
