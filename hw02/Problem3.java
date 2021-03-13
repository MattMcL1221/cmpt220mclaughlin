package hw02;
import java.util.*;
public class Problem3 {
    private static Scanner FrictionInput;
    public static void main(String[] args) {
        FrictionInput = new Scanner(System.in);
        System.out.println("Enter the friction force in Newtons: ");
        double FrictionForce = FrictionInput.nextDouble();
        System.out.println("Enter the object's mass in kg: ");
        double ObjMass = FrictionInput.nextDouble();
        System.out.println("Enter the object's acceleration in meters per square second: ");
        double ObjAccel = FrictionInput.nextDouble();
        double gravity = 9.8f;
        double u = (FrictionForce - ObjMass * ObjAccel) / (ObjMass * gravity);
        System.out.println("The Friction Coefficient is " + u );
    }
}
