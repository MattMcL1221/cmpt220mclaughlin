/* stringvar.toUpperCase()
Multiple String methods can be added to each other/chained for easier use of code

You can use the link below to find every method in java and to better understand how they function
https://docs.oracle.com/javase/7/docs/api/java/lang/String.html
*/

package hw05;
import java.util.*;
public class Problem2 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Enter a string to be capitalized: ");
        String enteredString = userInput.nextLine();
        System.out.print("The new string is: ");
        title(enteredString);
    }

    public static void title(String s) {
        String result = " ";
        String[] stringSplit = s.split(result); //searches for spaces based on var string result and splits them into an array/multiple strings
        String combineStrings = "";
        for (int i=0; i < stringSplit.length; i++) { //for every iteration
            combineStrings = combineStrings.concat(capitalMethod(stringSplit[i])); 
            combineStrings = combineStrings.concat(" ");
        }
        System.out.println(combineStrings);
    }
    public static String capitalMethod(String s) {
        String firstString = Character.toString(s.charAt(0)).toUpperCase();
        String finalString = s.replaceFirst(Character.toString(s.charAt(0)),firstString);
        return finalString;
    } 
    
}
