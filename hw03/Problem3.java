package hw03;
public class Problem3 {
    public static void main(String[] args) {
        System.out.println("Generate a random point within a circle at the center (0,0).");
        double radius = 5;
        double centerX = 0;
        double centerY = 0;

        double randomNumber = (Math.random() * (2 * Math.PI));
        System.out.println("The random number is: " + randomNumber);
        radius = radius * Math.random();
        double xVal = radius * Math.cos(randomNumber);
        double yVal = radius * Math.sin(randomNumber);
/*
        double nX = -3.3878721143708708;
        double yX = 3.1409080280010944;
        double testdist = Math.sqrt(Math.pow(nX,2) + Math.pow(yX,2));
        System.out.println("Test Distance is = " + testdist);
*/
        System.out.println("The point is: (" + xVal + " , " + yVal + ")");
        double distance =  Math.sqrt(Math.pow(xVal - centerX, 2) + Math.pow(yVal - centerY, 2));
        System.out.println("and the distance to the center is: " + distance);
    }
}
