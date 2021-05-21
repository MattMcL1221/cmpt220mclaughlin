package hw11;

import java.util.*;

public class Problem2 {
    private static Scanner userInput;

    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Enter the number of items: ");
        int itemNum = userInput.nextInt();
        System.out.println("Enter the weights for each item;");
        double itemWeights[] = new double[itemNum];
        for (int i = 0; i < itemNum; i++) {
            System.out.println("Enter the weight for item" + (i + 1) + ": ");
            itemWeights[i] = userInput.nextInt();
        }
        System.out.println("Enter the weight limit for the bag: ");
        double weightLimit = userInput.nextInt();
        ArrayList<Integer> mainList = m(itemNum - 1, weightLimit, itemWeights);
        mainList.remove(mainList.size()-1);
        System.out.print("The Maximum weight of the items placed in the bag is " );
        double maxWeight = 0;
        for(int i = 0; i < mainList.size(); i++) {
            maxWeight += itemWeights[mainList.get(i)];
        }
        System.out.println(maxWeight);
        System.out.print("The items in the bag are ");
        for(int i = 0; i < mainList.size(); i++) {
            System.out.print("#" + mainList.get(i) + " ");
        }
        System.out.println("");
        System.out.print("The weights of the items in the bag are ");
        for(int i = 0; i < mainList.size(); i++) {
            System.out.print(itemWeights[mainList.get(i)] + " ");
        }
    }

    public static ArrayList<Integer> m(int i, double weightLimit, double[] w) {
        if (i <= 0) {
            if (w[i] > weightLimit){
                ArrayList<Integer> oGList = new ArrayList<Integer>();
                oGList.add(0);
                return oGList;
            }
            else {
                ArrayList<Integer> list1 = new ArrayList<Integer>();
                list1.add(0, i);
                return list1;
            }
        }
        else {
            if (w[i] > weightLimit) {
                return m(i - 1, weightLimit, w);
            }
            int a;
            int b;
            a = (int)m(i - 1, weightLimit, w).get((int)m(i - 1, weightLimit, w).size()-1);
            b = (int)m(i - 1, weightLimit - w[i], w).get((int)m(i - 1, weightLimit - w[i], w).size()-1);
            if (w[a] > w[i] + w[b]) {
                return m(i - 1, weightLimit, w);
            }
            else {
                ArrayList<Integer> newList = m(i - 1, weightLimit - w[i], w);
                newList.add(i);
                return newList;
            }
        }
    }
}