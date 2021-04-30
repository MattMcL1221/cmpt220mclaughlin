package hw08;
import java.util.*;
public class Problem1 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Enter a string to be split by its delimiters.");
        System.out.println("First, Enter the string; Then enter the delimiters");
        System.out.println("An example would look like this");
        System.out.println("Enter a string: AB#C D?EF#45");
        System.out.println("Enter the delimiters: # ?");
        System.out.println("This would result in values split by the # and ? values listed in the delimiters");
        System.out.print("Enter a String: ");
        String stringInput = userInput.nextLine();
        System.out.print("Enter the delimiters: ");
        String delimiterInput = userInput.nextLine();
        ArrayList<String> result = split(stringInput, delimiterInput);
        for(String s : result) {       //string s will loop everytime for every string it finds in the result array list       
            System.out.println(s);           
        }

    }
    //Question functions like: homework 4 problem 3 & homework 5 problem 2 but can't use the string regex which i assume is just split(regex) ? 
    public static ArrayList<String> split(String s, String delimiters) {
        Boolean isDelimiter;
        ArrayList<String> listOfStrings = new ArrayList<String>();
        listOfStrings.add("");
        for (int i = 0; i < s.length(); i++) {
            isDelimiter = false;
            for (int j = 0; j < delimiters.length();j++) {
                if(s.charAt(i) == delimiters.charAt(j)) {
                    isDelimiter = true;
                    listOfStrings.add("");
                }
            }
            if (isDelimiter == false) {
                listOfStrings.set(listOfStrings.size()-1, listOfStrings.get(listOfStrings.size()-1).concat(Character.toString(s.charAt(i))));
            }
        }
        return listOfStrings;
    }
}
