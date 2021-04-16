package hw06;
import java.util.*;
public class Problem4 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Determine the Inverse of a 2 dimensional square matrix by entering a,b,c, and d.");
        double[][] inverseValInput = new double[4][4]; //4 is the size of inputs needed for a 2 dimensional array
        for (int i = 0; i < 2; i++) { 
            for (int j = 0; j < 2; j++) {
                inverseValInput[i][j] = userInput.nextDouble();
            }
        }
        double determinant = ((inverseValInput[0][0] * inverseValInput[1][1]) - inverseValInput[0][1] * inverseValInput[1][0]);
        System.out.println("The Determinant is: " + determinant);
        double returnVar[][] = inverse(inverseValInput);

        System.out.println("The Inverse of the Matrix is: ");
        for(int i=0; i<2 ; ++i){ //preincrement
            System.out.print("[");
            for(int j = 0; j < 2; ++j) {
                System.out.print(" ");
                System.out.print((returnVar[i][j]/determinant) + "  "); //for loop gens twice, placing two decimals/vals on one line before the
            }                                                           //print statement below causes the code to create a new line
            System.out.println("] ");
        }


    }
    public static double[][] inverse(double[][] A) {  
        double tempVar;            //                                                    [a b]       [d -b]
        tempVar = A[0][0];        //Invoke swap, all this method mainly does is replaces [c d] with  [-c a]
        A[0][0] = A[1][1];       // then you divide by the determinant which is (ad-bc)
        A[1][1] = tempVar;      // https://www.mathsisfun.com/algebra/matrix-inverse.html

        A[0][1] = - A[0][1];
        A[1][0] = - A[1][0];
        return A;
    }
}
