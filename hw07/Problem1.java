package hw07;
import java.util.*;
public class Problem1 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Enter Coords to find the intersection point between two lines.");
        System.out.println("Enter X1, Y1, X2, Y2, X3, Y3, X4, Y4:");
        double[][] points = new double[4][2]; //4 rows, 2 columns.
        int i; int j;
        for (i = 0; i < points.length; i++) {
            for (j = 0; j < points[i].length; j++) {
                points[i][j] = userInput.nextDouble();
            }
            System.out.print("(" + points[i][0] + ",");
            System.out.print(" " + points[i][1] + ")");
            System.out.println("");
        }
        System.out.println("The points entered are: ");
        System.out.println("(" + points[0][0] + "," + points[0][1] + ")");
        System.out.println("(" + points[1][0] + "," + points[1][1] + ")");
        System.out.println("(" + points[2][0] + "," + points[2][1] + ")");
        System.out.println("(" + points[3][0] + "," + points[3][1] + ")");

        //Point point = new Point(1f,3f);
        //System.out.println(point.getY());
        //System.out.println(point.getX());
        Point point1 = new Point(points[0][0], points[0][1]);
        Point point2 = new Point(points[1][0], points[1][1]);
        Point point3 = new Point(points[2][0], points[2][1]);
        Point point4 = new Point(points[3][0], points[3][1]);
        Point intersection = new Point(0,0);
        intersection = Point.getIntersectingPoint(point1, point2, point3, point4);
        if (Double.isNaN(intersection.getX()) || Double.isNaN(intersection.getY())) { //If the following double is Not a number(NAN)
            System.out.println("The two lines are parallel");
        }
        else {
            System.out.println("The intersecting point is (" + intersection.getX() + ", " + intersection.getY() + ")");
        }
    }
}


