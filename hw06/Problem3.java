package hw06;
import java.util.*;
public class Problem3 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Enter two strings to be compared and determine if the strings are anagrams:");
        System.out.print("Enter the first string: ");
        String firstAnaString = userInput.nextLine();
        System.out.print("Enter the second string: ");
        String secondAnaString = userInput.nextLine();
        isAnagram(firstAnaString, secondAnaString);
        if (isAnagram(firstAnaString, secondAnaString)) {
            System.out.println("The two strings " + firstAnaString + " and " + secondAnaString + " are anagrams of each other.");
        }
        else {
            System.out.println("The two strings " + firstAnaString + " and " + secondAnaString + " are not anagrams.");
        }
    }

    public static boolean isAnagram(String s1, String s2) {

        if(s1.length() != s2.length()) { //var.length() is a string function that grabs the # of chars in a string.
            return false;               //if the length of s1 is not equal to s2, there is automatically no anagram 
        }                              //end of if statement
        else {
            char[] charArray1 = s1.toLowerCase().toCharArray();   //if any values are upper case, this will convert them to lowercase since B
            char[] charArray2 = s2.toLowerCase().toCharArray();  //& b are different characters. Also turns the string into an array of characters
            Arrays.sort(charArray1);                            //which allows each letter to be easily checked.
            Arrays.sort(charArray2);                           //Arrays.sort is an array function that puts every letter in an array in the order
            if (Arrays.equals(charArray1,charArray2)) {       //from a-z, if you have zabbeddg, it translates to abbddegz
                return true; //if charArray1 & 2 are equal to each other, you have an anagram!
            }
            else {
                return false;
            }
        } //end of else statement
    }
    
}
