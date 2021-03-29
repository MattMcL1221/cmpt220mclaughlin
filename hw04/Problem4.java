//package hw04;
import java.util.*;
public class Problem4 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Enter a positive integer to obtain it's square root in simplest form.");
        System.out.println("Enter a positive integer: ");
        int positiveVal = userInput.nextInt();
        System.out.println("Square root of " + positiveVal + " is: ");
        //double squareRoot = Math.sqrt((double)positiveVal);
        //System.out.println(squareRoot);
        double tempVar = positiveVal;
        double tempMultiplier = 2;
        tempMultiplier = 2;
        tempVar = NextGreatestPerfSquare(tempVar);
        if (tempVar != positiveVal) {
            while (tempVar * tempMultiplier != positiveVal) {
                tempMultiplier++;
                if (tempMultiplier > 1000) { //Need to find multipliers while finding next perfect square until we reach a val of 1000+ if this happens
                    tempMultiplier = 2; //multiplier gets reset and it attempts to find the next perfect square
                    tempVar--; 
                    tempVar = NextGreatestPerfSquare(tempVar);
                }
            } 
        }
        else {
            tempMultiplier = 0;
        }
            System.out.println(Math.sqrt(tempVar) + " * Sqrt (" + tempMultiplier + ")");
    }
    public static double NextGreatestPerfSquare(double sqr) {
        while (Math.sqrt(sqr) % 1 != 0) { //
            sqr--;
        }
        return sqr;
    }
}
