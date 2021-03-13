package hw02;
import java.util.*;
public class Problem1 {
    private static Scanner Shapesize; //used for user input
    public static void main(String[] args) {
        Shapesize = new Scanner(System.in); //used to enter into program
        System.out.println("Enter the width of a rectangle: ");
        double recwidth= Shapesize.nextFloat();
        System.out.println("Enter the height of a rectangle: ");
        double recheight= Shapesize.nextFloat();
        double perimeter;
        perimeter = (recwidth*2) + (recheight*2);
        System.out.println("The perimeter of your rectangle is " + perimeter);

        double area;
        area = recwidth * recheight;
        System.out.println("The area of your rectangle is " + area);

        double diagln;
        diagln = Math.sqrt(Math.pow(recwidth,2) + Math.pow(recheight,2));
        System.out.println("The diagonal length of your rectangle is " + diagln);
    }

}
