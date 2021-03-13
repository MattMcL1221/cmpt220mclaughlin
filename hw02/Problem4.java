package hw02;
import java.util.*;
public class Problem4 {
    private static Scanner SlopeCoords;
    public static void main(String[] args) {
        SlopeCoords = new Scanner(System.in);
        System.out.println("Enter the Coordinates for X1: ");
        float X1 = SlopeCoords.nextFloat();
        System.out.println("Enter the Coordinates for Y1: ");
        float Y1 = SlopeCoords.nextFloat();
        System.out.println("Enter the Coordinates for X2: ");
        float X2 = SlopeCoords.nextFloat();
        System.out.println("Enter the Coordinates for Y2: ");
        float Y2 = SlopeCoords.nextFloat();
        float SlopeVal = (Y2 - Y1) / (X2 - X1);
        System.out.println("The slope for the line that connects the two points: (" + X1 + " + " + Y1 + ") and (" + X2 + " + " + Y2 + ") is" + SlopeVal);
    }
}
