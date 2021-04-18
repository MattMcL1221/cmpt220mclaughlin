//package hw06;
import java.util.*;
public class Problem1 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.print("How many sides are in the polygon?: ");
        int polySides = userInput.nextInt();
        System.out.println("Enter the following coordinate point values for the convex polygon individually/one at a time, in this order: ");
        System.out.println("X1; Y1;, X2; Y2;, X3; Y3;, ETC.");
        //how would you make this user input repeat and put each value entered into an array - First the array must be defined
        double[] coordXList = new double[polySides]; 
        double[] coordYList = new double[polySides]; 
        for (int i = 0; i < polySides; i++) {
            System.out.print("Enter the coordinate point for the X" + (i+1) + " value: "); //I use (i+1) to show users that zero is actually 
            coordXList[i] = userInput.nextDouble();                                       //the FIRST value to reduce confusion.
            System.out.print("Enter the coordinate point for the Y" + (i+1) + " value: ");
            coordYList[i] = userInput.nextDouble();                                     //arrays start at zero so first coordList will be [0]
            System.out.println("(" + coordXList[i] + " , " +coordYList[i] + ")");
        }
        System.out.println("The area of the " + polySides + "-sided polygon is: " + convexCalc(coordXList, coordYList, polySides));
    }

    public static double convexCalc(double x[], double y[], int s) {
        double area = 0;
        int j = s - 1;
        for (int i = 0; i < s; i++) {
            area += (x[j] + x[i]) * (y[j] - y[i]);   //+= uses adds the right side to the left and updates the left
            j = i;                                  //j is previous vertex to i
        }                                          //Math.abs gets the absolute value of a value
        return Math.abs(area / 2.0); 
    }
}

/*
        if (x.length > 3) {
            triangles = x.length-2;
        }
        else {
            triangles = 1;
        }
        double[] triangleSum = new double[triangles];
        for (int i = 0; i < triangles; i++) {
            double point1 = x[0]*(y[i+1] - y[i+2]);
            double point2 = x[i+1]*(y[i+2] - y[0]);
            double point3 = x[i+2]*(y[0] - y[i+1]);
            triangleSum[i] = Math.abs((point1 + point2 + point3)/2);  //Math.abs takes the absolute val of the number
        }
        double polySum = 0;
        for (int j = 0; j < triangles; j++) {
            polySum += (triangleSum[j]); 
        }
        System.out.println("The total area of the polygon is: " + polySum);
------------------------------------------------------------------------------
for (int i= 0; i < x.length; i++) {
    int index1 = i + 1, index2 = i + 2;
    if (i+1 > x.length -1) {
        index1 = 0;
    }
    if (i+2 > x.length -1) {
        index2 = 1;
    }
    triangleSum[i] = Math.abs(x[i]*(y[index1]-y[index2]));
    //triangleSum[i] = x[i]*(y[(i+1)>x.length?0:i+1]-y[(i+2)>x.length?1:i+2]); 
                                                    //ternery operator if than i+1 > x.length, use 0, otherwise use i+1 normally
}

///////////
double polySumABS = Math.abs((triangleSum[0] + triangleSum[1] + triangleSum[2] + triangleSum[3])/2); //Math.abs takes the absolute val of the number
System.out.println(polySumABS);
//System.out.println("The total area of the " + polySides + " polygon, is: " + polygonSum);
*/