package hw11;
import java.util.*;
public class Problem1 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int itemNum = userInput.nextInt();
        System.out.println("Enter the weights for each item:");
        double itemWeights[] = new double[itemNum];
        for(int i=0; i < itemNum; i++) {
            System.out.println("Enter the weight for item " + (i+1) + ": ");
            itemWeights[i] = userInput.nextInt();
        }
        System.out.println("Enter the weight limit for the bag: ");
        double weightLimit = userInput.nextInt();

        System.out.println("The Maximum weight of the items placed in the bag is " + m(itemNum-1, weightLimit, itemWeights));
    }
    public static double m(int i, double weightLimit, double[] w) {
        if(i==0) {
            if(w[i] > weightLimit) {
                return 0;
            }
            else {
                return w[i];
            }
        }
        else {
            if (w[i] > weightLimit) {
                return m(i-1, weightLimit, w); 
            }
            return Math.max(m(i-1, weightLimit, w), w[i] + m(i-1, weightLimit - w[i], w));
        }
    }
}