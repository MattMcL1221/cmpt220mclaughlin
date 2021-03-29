//package hw04;
import java.util.*;
public class Problem1 {
    private static Scanner calculatorMenu;
    public static void main(String[] args) { 
        //In the future, declare variables before if statements so they become global and not limited to a single {}
        //In this I created separate vars for each correct var, I could have declared vars before while statement 2 make a single var usable in each
        calculatorMenu = new Scanner(System.in);
        int ranNum1;
        int ranNum2;
        int enteredOperation = 0;
        while (enteredOperation != 5) { //While the userinput does not equal, repeat program steps
            //ranNum1 = (int)(Math.random() * 51); //Starts count from 0 so val needs to be 1 higher
            //ranNum2 = (int)(Math.random() * 51); //than max val needed to gen values of zero through 50
            Calcmenu(); //Calls to external method listed at bottom of code
            enteredOperation = calculatorMenu.nextInt();
            ranNum1 = (int)(Math.random() * 10); //Starts count from 0 so val needs to be 1 higher. 
            ranNum2 = (int)(Math.random() * 10); //than max val needed to gen values of zero through 9

            if (enteredOperation < 1 || enteredOperation > 5) { //If userinput is less than 1 or greater than 5, make user re-enter info
                System.out.println("The value entered does not match those within the menu. Please enter a number 1 through 5: ");
            }
            if (enteredOperation == 1) { //Addition Test
                System.out.println("You have selected Addition.");
                int correctAddition = (ranNum1 + ranNum2);
                System.out.print("What is " + ranNum1 + " + " + ranNum2 + " ?: ");
                int userAnswer = calculatorMenu.nextInt();
                if (userAnswer == correctAddition) {
                    System.out.println("You are correct!");
                }
                else {
                    System.out.println("Your answer is incorrect. The correct answer is " + correctAddition);
                } 
            } //end if equal to 1
            if (enteredOperation == 2) { //subtraction portion
                System.out.println("You have selected Subtraction.");
                if (ranNum1 < ranNum2) {
                    int tempNum = ranNum1;
                    ranNum1 = ranNum2;
                    ranNum2 = tempNum;
                }
                int correctSubtract = (ranNum1 - ranNum2);
                System.out.println("What is " + ranNum1 + " - " + ranNum2 + " ?: ");
                int userAnswer = calculatorMenu.nextInt();
                if (userAnswer == correctSubtract) {
                    System.out.println("You are correct!");
                }
                else {
                    System.out.println("Your answer is incorrect. The correct answer is " + correctSubtract);
                }
            } // end of Subtraction if
            if (enteredOperation == 3) {
                System.out.println("You have selected Multiplication.");
                int correctMultiply = (ranNum1 * ranNum2);
                System.out.println("What is " + ranNum1 + " * " + ranNum2 + " ?: ");
                int userAnswer = calculatorMenu.nextInt();
                if (userAnswer == correctMultiply) {
                    System.out.println("You are correct!");
                }
                else {
                    System.out.println("Your answer is incorrect. The correct answer is " + correctMultiply);
                }
            }
            if (enteredOperation == 4) {
                System.out.println("You have selected Division.");
                while (ranNum2 == 0) { //While randomNumber2 is 0, get new ranNum2
                    ranNum2 = (int)(Math.random() * 10);
                }

                double correctDivision = ((double)ranNum1 / (double)ranNum2); //previously declared int vars need to be converted to doubles to function correctly
                System.out.println("What is " + ranNum1 + " / " + ranNum2 + " ?: ");
                System.out.println("The answer must be rounded to the 3rd decimal place");
                double userAnswer = calculatorMenu.nextDouble();
                correctDivision = correctDivision * (double)1000; //without type casting 1000, it assumes # is an int, causing issues when using doubles
                correctDivision = Math.round(correctDivision) / (double)1000; //Rounds answer 3 decimal places
                if (userAnswer == correctDivision) {
                    System.out.println("You are correct!");
                }
                else {
                    System.out.println("Your answer is incorrect. The correct answer is " + correctDivision);
                }
            } //end of division if
        } //end of main while loop
        if (enteredOperation == 5) {
            System.out.println("Thank you for using this program! Goodbye. ");
        }
    } //main end

    private static void Calcmenu() { //External method that is hidden(private) from objects outside of this .java file, 
        //used to quickly return menu/print options from Main
        System.out.println("---------"); //Simple section divider
        System.out.println("Calculator Main Menu - Type # 1-5 to get started");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Exit");
        System.out.print("Enter your operation into the Calculator: ");
    }
    
}
