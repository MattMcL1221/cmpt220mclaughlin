/*
Generate and Display a Pascal triangle based on # of rows entered:
need to loop program multiple times in order to display multiple rows
We did something similar to this in python using graphical programming
Python Similar Program - Need at least 2 for loops... This is more advanced so most likely 3 or 4
for outcount in range(countval):
    for incount in range(countval):
        if outcount == mid:
            if incount == mid:
                print('O',end='')
            else:
                print('*',end='')
        else:
            print('*',end='') 
    print()
*/
//Program must compute 
// C(m,n) = (m!/(m-n)!n!) 

//IF ROWS > 4 && columnNumber > 9 --> Program should print less spaces as values over 9 takes up two spaces...

package hw05;
import java.util.*;
public class Problem4 {
    public static Scanner pascalInput;
    public static void main(String[] args) {
        pascalInput = new Scanner(System.in);
        System.out.println("Display a Pascal Triangle: ");
        System.out.println("Enter the number of rows");
        int rowsEntered =  pascalInput.nextInt();
        pascalTriangle(rowsEntered);
    }
    public static void pascalTriangle(int rows) {
        int blockPos = 1;
        int columnNumber = 1;
        for (int i=0;i<rows+1;i++) { //Row of 8 includes all rows after the top val. So technically there is +1 more than the rows entered
            for (blockPos = 1; blockPos<= rows-i; blockPos++) { //Simple for loop to format, if blockPos was > 1, 
                System.out.print("   "); //program would not have correct spacing on the right side
            }
            for (int j=0; j<=i; j++) {
                if (i == 0 || j == 0) { //if i or j is equal to zero, the position must be the outer area of the triangle,
                    columnNumber = 1; //therefore make columnNumber = 1 so all outer vals will be 1
                }
                else {
                    columnNumber = columnNumber * (i-j + 1) / j;
                }
                //
                if (rows > 4 && columnNumber > 9) { //used to help space rows after 4 which have double digit integers
                    System.out.print(" " + columnNumber);
                }
                else {
                    System.out.print("  " + columnNumber);
                }
                System.out.print("   ");
            }
            System.out.print("\n");
        }
    }
}
