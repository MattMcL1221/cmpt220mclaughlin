/*
Since the program must gather the # of digits AND how many times they are used
You could probably use two for loops as there are two columns of numbers
*/

//package hw06;

import java.util.*;

public class Problem2 {
    private static Scanner userInput;

    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.print("Enter a string to count the number of digits within the string: ");
        String stringInput = userInput.nextLine();
        System.out.println(count(stringInput));
        int[] counter = count(stringInput);
        for (int i = 0; i < 10; i++) {
            System.out.println("Digit " + i + " occurs " + counter[i]);
        }
    }

    public static int[] count(String s) { //See page 266 in intro to java textbook for example of how to do this with LETTERS not digits
        int[] numCounter = new int[10]; //make a int array 
        for(int i = 0; i <s.length(); i++) { //increase i as long as it is less than length, this will make searching for specific chars easier
           for (int j = 0; j < 10; j++) {
               if (s.charAt(i) == (char)j + '0') { //Integer.parseInt(s.charAt(i))
                   numCounter[j]++;
               } 
           }
        }//i for loop
        return numCounter;
    }
}
