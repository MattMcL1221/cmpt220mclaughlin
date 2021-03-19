package hw03;
import java.util.*;
public class Problem2 {
    private static Scanner SlopeInput;
    public static void main(String[] args) {
        SlopeInput = new Scanner(System.in);
        System.out.println("Solve A Slope Intercept Using The Formula y = mx + b:");
        System.out.println("Enter the value for X1: ");
        double slopeX1 = SlopeInput.nextDouble();
        System.out.println("Enter the value for Y1: ");
        double slopeY1 = SlopeInput.nextDouble();
        System.out.println("(X1,Y1 = (" + slopeX1 + " , " + slopeY1 + ")");
        System.out.println("Enter the value for X2: ");
        double slopeX2 = SlopeInput.nextDouble();
        System.out.println("Enter the value for Y2: ");
        double slopeY2 = SlopeInput.nextDouble();
        //Display info back to user before solving equation
        System.out.println("X2,Y2 = (" + slopeX2 + " , " + slopeY2 + ")");
        System.out.println("Coordinates are: " + "(" + slopeX1 + " , " + slopeY1 + ")" + " & " + "(" + slopeX2 + " , " + slopeY2 + ")");
        System.out.println("Solve for m: (Y2-Y1)/(X2-X1)");
        double slopeMval = (slopeY2 - slopeY1) / (slopeX2 - slopeX1);
        System.out.println("M = " + slopeMval);
        double slopeBval = (slopeY1 - (slopeMval * slopeX1));
        System.out.println("B = " + slopeBval);
        if (slopeBval == 0) {
            if (slopeMval == 1) { // If Bval equals zero and Mval equals one, print y=x
                System.out.println("The line equation for the two points (" + slopeX1 + " , " + slopeY1 + ")" + " & " + 
                "(" + slopeX2 + " , " + slopeY2 + ") is: y = x" );
            }
        }
        else { //If Bval does not equal to zero
            if (slopeMval == 1) { //still test if Mval is equal to one
                System.out.println("The line quation for the two points (" + slopeX1 + " , " + slopeY1 + ")" + " & " +
                "(" + slopeX2 + " , " + slopeY2 + ") is: y = " + "x + " + slopeBval);
            }
            else { //if Mval is not equal to one when Bval is not equal to zero, print full equation
                System.out.println("The line quation for the two points (" + slopeX1 + " , " + slopeY1 + ")" + " & " +
                "(" + slopeX2 + " , " + slopeY2 + ") is: y = " + slopeMval + "x + " + slopeBval); 
            }
        }
    }
}
