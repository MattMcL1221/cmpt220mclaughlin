package hw07;
import java.util.*;
public class Problem3 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Enter 3 sets of points to find the area of a triangle");
        System.out.println("Enter X1, Y1, X2, Y2, X3, Y3");
        double[][] triAreaArray = new double[3][2];
        for (int i = 0; i < triAreaArray.length; i++) {
            for (int j = 0; j < triAreaArray[i].length; j++) {
                triAreaArray[i][j] = userInput.nextDouble();
            }
            System.out.print("(" + triAreaArray[i][0] + ",");
            System.out.print(" " + triAreaArray[i][1] + ")");
            System.out.println("");
        }
        System.out.println("The points entered are: ");
        System.out.println("(" + triAreaArray[0][0] + "," + triAreaArray[0][1] + ")");
        System.out.println("(" + triAreaArray[1][0] + "," + triAreaArray[1][1] + ")");
        System.out.println("(" + triAreaArray[2][0] + "," + triAreaArray[2][1] + ")");
        Point triPoint1 = new Point(triAreaArray[0][0],triAreaArray[0][1]);
        Point triPoint2 = new Point(triAreaArray[1][0],triAreaArray[1][1]);
        Point triPoint3 = new Point(triAreaArray[2][0],triAreaArray[2][1]);
        double triAreaFound = Point.getTriangleArea(triPoint1, triPoint2, triPoint3);
        if (triAreaFound == 0) {
            System.out.println("The three points are on the same line");
        }
        else {
            System.out.println("The area of the triangle is: " + triAreaFound);
        }
    }
}
