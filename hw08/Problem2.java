package hw08;
import java.util.*;
public class Problem2 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.print("Enter the number of objects: ");
        int inputSize = userInput.nextInt();
        ArrayList<Integer> objects = new ArrayList<>();
        for (int i = 0; i < inputSize; i++) {
            System.out.print("Enter the weight of object " + (i+1) + ": ");
            objects.add(userInput.nextInt());
        }
        int container = 1;
        while (!objects.isEmpty()) { //As long as objects are NOT empty, execute while loop
            System.out.println("Container " + container++ + " contains objects with weight " + binPlacement(objects, 10)); //we use a set size of
        }                                                                                                                 //10 as we are splitting
    }                                                                                                                    //objects by a max size of
                                                                                                                        //of 10
    //need a class, method or a function to sort weights from highest to lowest and then answer will be correct
    //Arrays.sort() wont work because an array uses [] and we are using an arraylist which uses <>
    public static String binPlacement(ArrayList<Integer> objects, int max) {
        Collections.sort(objects);      //Like Arrays.sort() , Collections.sort is used for ARRAYLISTS. Sort sorts from smallest to largest
        Collections.reverse(objects);  //the collections method:reverse simply reverses elements of an arrays. Reverse makes order largest2smallest
        String result = "";
        for (int i = 0; i < objects.size(); i++) {
            if (objects.get(i) <= max) {       //Max is 10 so we are looking for objects with weights greater than or equal to 10 as we need to
                int tempVar = objects.get(i); //place objects in bins starting with the largest values.
                result += tempVar + " ";
                objects.remove(i);
                return result + binPlacement(objects, max - tempVar);
            }
        }
        return result;
    }
}
