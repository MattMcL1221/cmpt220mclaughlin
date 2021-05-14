package hw10;
import java.util.*;
public class Problem3 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        Rational rational1 = new Rational();
        System.out.println("Enter a numerator and denominator to simplify");
        System.out.println("For Example: 3/15 or 2/6");
        String rationalStringInput = userInput.nextLine();
        rational1 = Rational.parseRationalNumber(rationalStringInput);
        System.out.println(rational1);
        System.out.println("Enter a second numerator and denominator to add to the first");
        String rationalStringInput2 = userInput.nextLine();
        Rational rational2 = new Rational();
        rational2 = Rational.parseRationalNumber(rationalStringInput2);
        System.out.print("(" + rational1 + ") + (" + rational2 + ") = " + rational1.add(rational2));
    }
}
