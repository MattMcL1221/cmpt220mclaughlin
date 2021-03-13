package hw01;

public class Problem2 {

    public static void main(String[] args) {

        double v0 = 5.6;
        System.out.println("V0 is " + v0);
        double v1 = 10.5;
        System.out.println("V1 is " + v1);
        double t = 0.5;
        System.out.println("t is " + t);
        System.out.println("(V1-V0)/t = ");
        double Avgaccel = (v1 - v0) / (t); //print the average acceleration below
        System.out.println("The average acceleration is " + Avgaccel);
    }
}

