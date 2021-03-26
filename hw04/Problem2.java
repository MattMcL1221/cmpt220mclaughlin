package hw04;
import java.util.*;
public class Problem2 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Generate a polygon and display its coordinates.");
        System.out.println("Enter the number of sides on the polygon: ");
        int polygonSides = userInput.nextInt();
        System.out.println("Enter the radius of the bounding circle: ");
        double boundRadius = userInput.nextDouble();
        System.out.println("The coordinates of the points on the polygon are: ");
        PrintCoords(boundRadius, polygonSides);
    }
    public static void PrintCoords(double rad, double polySide) {
        for (int i = 0; i < polySide; i++) { // for every iteration less than the # of polygonSides, execute code in {},&Increase iteration +1
        double xVal = rad * Math.cos(2.0 * Math.PI / polySide * i); //uses almost same code as Problem3 HW03, which gens points on a circle
        double yVal = rad * Math.sin(2.0 * Math.PI / polySide * i);
        System.out.println("( " + xVal + " , " + yVal + " )");
    } //end of for loop
    }
}
