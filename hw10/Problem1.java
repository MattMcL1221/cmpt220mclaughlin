package hw10;

import java.util.*;

public class Problem1 {
    private static Scanner userInput;

    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        int hoursInput; int minsInput; int secInput;
        System.out.println("Enter the time in the following order: ");
        System.out.print("(Hours) ");
        hoursInput = userInput.nextInt();
        System.out.print("(Hours) " + hoursInput);
        System.out.print(" (Minutes) ");
        minsInput = userInput.nextInt();
        System.out.print("Time " + ": (Hours) " + hoursInput + " (Minutes) " + minsInput);
        System.out.print(" (Seconds) ");
        secInput = userInput.nextInt();
        Time time1 = new Time(hoursInput, minsInput, secInput);
        System.out.println("Elapsed seconds in Time 1: " + time1.getSeconds());
        System.out.println(time1);
        System.out.println("Enter the Elapsed Time for Time 2: ");
        Time time2 = new Time(userInput.nextInt());
        System.out.println("Elapsed seconds in Time 2: " + time2.getTime());
        System.out.println(time2);
        System.out.println("Compared Time: " + time1.compareTo(time2));
        Time time3 = new Time();
        time3 = (Time)time1.clone();
        System.out.println("Time3 is created as a clone of time 1");
        System.out.println("Compared Time: " + time1.compareTo(time3));
    }
}
