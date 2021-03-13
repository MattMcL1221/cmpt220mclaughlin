package hw02;
import java.util.*;
public class Problem2 {
    private static Scanner Mathinputs;
    public static void main(String[] args) {
        Mathinputs = new Scanner(System.in);
        System.out.println("Enter the ball travel time: ");
        double travelTime = Mathinputs.nextDouble();
        int initialvel = 0;
        float gravity = 9.8f; //gravity equals the acceleration or a in the equation
        double finalVelocity = (initialvel + gravity * travelTime); 
        System.out.println("Final Velocity is " + finalVelocity);
        double averageSpeed = (initialvel + finalVelocity) / 2;
        System.out.println("The Average Speed is " + averageSpeed);
        double distTrav2 = (initialvel * travelTime + gravity) * (Math.pow(travelTime,2) / 2);
        System.out.println("The height of the building is " + distTrav2);
    }

}
