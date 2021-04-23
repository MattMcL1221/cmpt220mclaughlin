package hw07;
import java.util.*;
public class Problem2 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Enter 3 sets of points to get the center point of a triangle");
        System.out.println("Enter X1, Y1, X2, Y2, X3, Y3: ");
        double[][] triPoints = new double[3][2];
        for (int i = 0; i < triPoints.length ; i++) {
            for (int j = 0; j < triPoints[i].length ; j++) {
                triPoints[i][j] = userInput.nextDouble();
            }
            System.out.print("(" + triPoints[i][0] + ",");
            System.out.print(" " + triPoints[i][1] + ")");
            System.out.println("");
        }
        System.out.println("The points entered are: ");
        System.out.println("(" + triPoints[0][0] + "," + triPoints[0][1] + ")");
        System.out.println("(" + triPoints[1][0] + "," + triPoints[1][1] + ")");
        System.out.println("(" + triPoints[2][0] + "," + triPoints[2][1] + ")");
        Point triPoint1 = new Point(triPoints[0][0],triPoints[0][1]);
        Point triPoint2 = new Point(triPoints[1][0],triPoints[1][1]);
        Point triPoint3 = new Point(triPoints[2][0],triPoints[2][1]);
        Point centerTriangle = new Point (Point.getCenterPoint(triPoint1, triPoint2, triPoint3));
        System.out.println("The center point is: " + centerTriangle);
    }
}
