package hw09;
import java.util.*;

//need to make an array with 100 random int vals
//for every current space/val in the array, place random val inside array
//if the user enters a val over 100, return the catch function to catch arraybounds error
//Rather than using an if statement, you could place the user input in try, this way if they TRY to enter a val over 100
//the program will CATCH the error and display the exception response. If it is TRIED and works, nothing happens.

public class Problem1 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        int[] randArray = randArrayMethod();
        try {
            System.out.print("Enter a value in the array's index to return the corresponding integer: ");
            int indexInput = userInput.nextInt();
            System.out.println(randArray[indexInput]);
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Error: Indexed Number is out of bounds.");
        }
    }
    public static int[] randArrayMethod(){
        int[] intArray = new int[100];
        for (int i =0; i < intArray.length; i++) {
            intArray[i] = (int)(Math.random() * 101); //need +1 cause (math.random * 100) gets nums 0-99, use 101 for 0-100
        }
        return intArray;
    }
    
}
