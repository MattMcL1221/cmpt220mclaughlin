package hw03;

import java.util.*;

public class Problem4 {
  private static Scanner UserInput;
  public static void main(String[] args) {
    final int NUMBER_OF_QUESTIONS = 5; // Number of questions
    int correctCount = 0; // Count the number of correct answers
    int count = 0; // Count the number of questions
    long startTime = System.currentTimeMillis();
    String output = ""; // output string is initially empty
    UserInput = new Scanner(System.in);
/*
              // Generates an array
    String[] correctArray = new String[] {
        "Correct", "Excellent", "Good Job"
    };
    String[] wrongArray = new String[] {
        "Incorrect", "Wrong", "Not right"
    };
  

                 //This unused block can be used to generate a single random string from an array listed above
      Random randC;
      randC = new Random();
      System.out.println(correctArray[randC.nextInt(correctArray.length - 1)]);
      Random randW; //declare as a random
      randW = new Random(); //makes randW a new object of type random
      System.out.println(wrongArray[randW.nextInt(wrongArray.length - 1)]);
      */
//

    while (count < NUMBER_OF_QUESTIONS) {
      // 1. Generate two random single-digit integers
      int number1 = (int)(Math.random() * 10);
      int number2 = (int)(Math.random() * 10);

      // 2. If number1 < number2, swap number1 with number2
      if (number1 < number2) {
        int temp = number1;
        number1 = number2;
        number2 = temp;
      }



      // 3. Prompt the student to answer "What is number1 – number2?"
      System.out.print(
        "What is " + number1 + " - " + number2 + "? ");
      int answer = UserInput.nextInt();

      int randomAnswer = (int)(Math.random() * 3); // generates 1 less than value from 0 - 0,1,2
      int randomAnswer2 = (int)(Math.random() * 3);
      // 4. Grade the answer and display the result
      if (number1 - number2 == answer) {
        if (randomAnswer == 0) {
            System.out.println("Excellent!\n");
        }
        else if (randomAnswer == 1) {
            System.out.println("Correct!\n");
        }
        else {
            System.out.println("Good Job!\n");
        }
        //System.out.println(correctArray[randC.nextInt(correctArray.length - 1)] + "\n"); //Generates a random string from array listed above
        correctCount++;
        
      }
      else {
        if (randomAnswer2 == 0) {
            System.out.println("Incorrect... " + number1 + " - " + number2 + " should be " + (number1 - number2) + "\n");
        }
        else if (randomAnswer2 == 1) {
            System.out.println("Wrong... " + number1 + " - " + number2 + " should be " + (number1 - number2) + "\n");
        }
        else {
            System.out.println("Not right... " + number1 + " - " + number2 + " should be " + (number1 - number2) + "\n");
        }
      }

      // Increase the count
      count++;

      output += "\n" + number1 + "-" + number2 + "=" + answer + 
        ((number1 - number2 == answer) ? " correct" : " wrong");
    }

    long endTime = System.currentTimeMillis();
    long testTime = endTime - startTime;

    System.out.println("Correct count is " + correctCount + 
      "\nTest time is " + testTime / 1000 + " seconds\n" + output);
  }
}
