package hw05;
import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter an Integer Value to be turned into Binary: ");
        int inputVal = userInput.nextInt();

        System.out.println("The Binary value is: " + decimal2Binary(inputVal));
        userInput.close();
    }

//decimial/integer to binary works by taking the remainders of your initial integer and using them as the binary form
// if you have a val of 12, divide 12 by 2 to get 6; Remainder 0, then divide 6 by 2 to get 3; remainder of 0,
// Then 3 divided by 2 gives 1; remainder of 1, then 1 divided by 2 gives 0 with a remainder of 1
// Therefore the binary value is 1100

//Predefined method given by homework
    public static String decimal2Binary(int methodVar) { // Because this method is a string class, using soley integers values wont work properly
        //Need an additional method to allow this method to return "a result of type string" as there is no string argument in ()
        String result = "";
        return decimalBinaryTrans(methodVar, result);
    }

    public static String decimalBinaryTrans(int methodVar, String binary) { // This is where all the math occurs
        if (methodVar / 2 == 0) { //If the integer used, reaches 0 when dividing, only grab the remainder of the value
            return (methodVar % 2) + binary;
        }
        else {
            return decimalBinaryTrans(methodVar / 2, (methodVar % 2) + binary); //Entered integer passes through this statement multiple times
        } //Each time integer passes through this return, it divides # by 2 and grabs the remainder
    } 
}
