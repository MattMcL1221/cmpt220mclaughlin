/*
the Point.java class has

methods for problem 1, 2, & 3
Problem 1:
public static Point getIntersectingPoint(Point p1, Point p2, Point p3, Point p4)

Problem 2:
public static Point getCenterPoint(Point p1, Point p2, Point p3)

Problem 3:


*/

//package hw07;

public class Point {
    private double x;
    private double y;

    public Point(double xVal, double yVal) {
        x = xVal;
        y = yVal;
    }
    public Point(Point point) {
        x = point.getX();
        y = point.getY();
    }
    //@override used for center point triangle method, I could use this for problem 1 but I used both ways
    @Override //center point normally prints as "hw07.Point@1d81eb93" using @override allows us to force change the innate method
    public String toString() {
        return "(" + x + "," + y + ")";
    }
    public double getX() {
        return x;
    }
    public void setX(double xVal) {
        this.x = xVal;
    }
    public double getY() {
        return y;
    }
    public void setY(double yVal) {
        this.y = yVal;
    }
    //Get Line Interception Point methods
    //solve for m
    public static double findSlope(Point p1, Point p2) {
        return (p2.getY() - p1.getY())/(p2.getX() - p1.getX());
    }
    //solve for b
    public static double findYIntercept(Point p1, double slope) {
        return (p1.getY() - (slope * p1.getX()));
    }
    //y=mx+b
    public static Point getIntersectingPoint(Point p1, Point p2, Point p3, Point p4) {
        Point intersect = new Point(0,0);
        double line1Slope = findSlope(p1,p2);
        double line2Slope = findSlope(p3,p4);
        double line1Intercept = findYIntercept(p1, line1Slope);
        double line2Intercept = findYIntercept(p3, line2Slope);
        intersect.setX((line2Intercept - line1Intercept) / (line2Slope - line1Slope) * -1);
        intersect.setY(((line1Slope * line2Intercept) - (line2Slope * line1Intercept)) / (line2Slope - line1Slope) * -1);
        return intersect;
    }
    ///Get Center Triangle point methods
    public static Point getCenterPoint(Point p1, Point p2, Point p3) {
        Point centerPoint = new Point(0,0);
        centerPoint.setX((p1.getX() + p2.getX() + p3.getX())/3);
        centerPoint.setY((p1.getY() + p2.getY() + p3.getY())/3);
        return centerPoint;
    }
     //Problem 3
    // Get Area of a triangle Ax(By - Cy) + Bx(Cy - Ay) + Cx(Ay - By) divided by 2
    public static double getTriangleArea(Point p1, Point p2, Point p3) {
        double triArea =  (p1.getX()*(p2.getY() - p3.getY())) + (p2.getX()*(p3.getY() - p1.getY())) + (p3.getX()*(p1.getY() - p2.getY()));
        triArea = Math.abs(triArea/2);
        return triArea;
    }
}
