package hw03;
import java.util.*;

public class Problem1 {
    private static Scanner FractionInput;
    public static void main(String[] args) {
        
        FractionInput = new Scanner(System.in);
        System.out.println("Enter the fraction numerator: ");
        double numerator = FractionInput.nextDouble();
        System.out.println("Enter the fraction denominator: ");
        double denominator= FractionInput.nextDouble();
        if (numerator == denominator) {
            System.out.println("Fraction " + numerator + "/ " + denominator + " is a whole number");
        }
        if (numerator < denominator){
                System.out.println(numerator + " / " + denominator + " is a proper fraction.");
            }
        if (numerator > denominator) {
                System.out.println(numerator + "/" + denominator + " is an improper fraction.");
                double mixedFracQuotient = (numerator) / (denominator);
                double mixedFracRemainder = (numerator) % (denominator);
                double newQuotient = (mixedFracQuotient) - (mixedFracRemainder / denominator);
                if (mixedFracRemainder == 0){ //When Numerator > than denom, and the FracRemainder is equal to zero print New Quotient rather than fraction
                    System.out.println(numerator + "/" + denominator + " can be reduced to: " + newQuotient); 
                }
                else //When Numerator > Denominator and MixedFracRemainder is not equal to Zero, Print the mixed number
                System.out.println("The mixed number is " + newQuotient + " " + mixedFracRemainder + "/" + denominator);
            }
    }
}
