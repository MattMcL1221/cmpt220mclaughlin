package hw05;
import java.util.*;
public class Problem3 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Enter total time in seconds:" );
        long timeInSeconds = userInput.nextLong();
        System.out.println("The total time of " + timeInSeconds + " is: " + format(timeInSeconds));
    }
    //predefined method needed to be used by homework question
    public static String format(long seconds) { //move if statements to secondary method, mimic problem 1
        long hours = seconds / 3600; //3600 seconds in an hour
        long minutes = seconds / 60;
        long totalMinutes = minutes % 60;
        long remainingSeconds = seconds % 60;
        System.out.println("Hours are: " + hours);
        return timeFormat(hours) + ":" + timeFormat(totalMinutes) + ":" + timeFormat(remainingSeconds); 
//return timeFormat(var) runs an entered var through the method below to change/update that var
    }
    public static String timeFormat(long totalTime) { //This method runs each defined variable through totalTime, 
        if (totalTime < 10) { //displaying/returning the time with a zero if a single digit # or returning the same inputted val if bigger than 9
            return "0" + totalTime; //Use public static String, therefore a string must be returned in return.
        }
        else {
            return (totalTime + ""); //If no string, you can just put + "" as a placeholder
        }
    }   
}
