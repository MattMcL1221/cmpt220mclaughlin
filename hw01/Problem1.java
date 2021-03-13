package hw01;
import java.util.*; //required for scanner

public class Problem1 {
    private static Scanner quadinput; //Scanner is used for user input

    public static void main(String[] args) {

    quadinput = new Scanner(System.in); //system.in is used to enter into the program
        System.out.println("Enter the A value: ");
        int aval= quadinput.nextInt();
        System.out.println("Enter the B value: ");
        int bval= quadinput.nextInt();
        System.out.println("Enter the C value: ");
        int cval= quadinput.nextInt();
        int discriminant = (int)Math.pow(bval,2) - (4*aval*cval); //math.pow is used for exponents

        System.out.println("The Quadratic Equation answer is: " + discriminant);
    }
}
