/* Program needs to find Gene Sequence and loop

Test Gene Sequence = TTATGTTTTAAGGATGGGGCGTTAGTT

Gene should be listed to return/print any letters AFTER ATG
GENE SHOULD END DIRECTLY BEFORE STRING COMBO OF - TAG, TAA, or TGA
??????? Maybe???
If String contains "ATG" - do {blah}
If String contains "TAG" || "TAA" || "TGA" - do {end blah & output}
Learned methods - so is there a method that can read strings as opposed to arrays which haven't been learned?
*/
package hw04;
import java.util.*;
public class Problem3 {
    private static Scanner userInput;
    public static void main(String[] args) {
        userInput = new Scanner(System.in);
        System.out.println("Enter a Genome String made from letters A,C,G, & T");
        System.out.print("Genome String: ");
        String genomeInput = userInput.nextLine();
        System.out.println("You entered: " + genomeInput);
        // DO NOT REMOVE, For some reason this comes up as an error but when removed causes lower called vars to not work.
        boolean geneDetect = false; //Value of geneDetect IS USED, not sure why it says it doesn't work.
        /// No matter what I do, the variable still says it isnt used? Potential issue with the IDE?

        int characterPosition = 0; //-1 causes index out of bounds with certain string inputs so this should be zero
        String atgString = "ATG"; //String needs to generate Letters after ATG in a sequence
        String endCombo1 = "TAG";
        String endCombo2 = "TAA";
        String endCombo3 = "TGA";


        for (int i = 0; i < genomeInput.length() -2 ; i++) { //for every iteration less than GenomeInput length
            String threeLetterCombo = genomeInput.substring(i, i +3);
            if (threeLetterCombo.equals(atgString)) {
                characterPosition = i + 3;
            }
            else if (threeLetterCombo.equals(endCombo1) || threeLetterCombo.equals(endCombo2) ||
            threeLetterCombo.equals(endCombo3) && characterPosition != 0) {
                String geneOutput = genomeInput.substring(characterPosition, i);
                if (geneOutput.length() % 3 == 0) {
                    geneDetect = true;
                    System.out.println("Output is " + geneOutput);
                    characterPosition = -1;
                }
            }
        }
        if (geneDetect = false) {
            System.out.println("No gene is found");
        }
    } 
}
