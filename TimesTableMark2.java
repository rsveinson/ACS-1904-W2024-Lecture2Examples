import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class TimesTableMark2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int ROWBOUND = 6;
        final int COLUMNBOUND = 6;
        
        // operands and product
        int r = 0;
        int c = 0;
        int p = 0;
        
        int[][] times = new int[ROWBOUND][COLUMNBOUND];
        
        // load the array
        for(int i = 0; i < ROWBOUND; i++){
            for(int j = 0; j < COLUMNBOUND; j++){
                times[i][j] = (i + 1) * (j + 1);
            }// end for j
        }// end for i
        
        // print the first row (column headings)
        System.out.print("Times\t");
        for(int i = 1; i < ROWBOUND; i++)
            System.out.print(i + "\t");
        System.out.println();
        
        // print the table
        for(int i = 0; i < ROWBOUND; i++){
            System.out.print((i + 1) + "\t");
            for(int j = 0; j < COLUMNBOUND; j++){
                System.out.print(times[i][j] + ",\t");
            }
            System.out.println();
        }        
            
        
        // calculate products 
        // we're asking for a row and column reference to be entered from the keyboard
        System.out.println("enter 2 numbers to multiply, enter 0 for the first number to quit");
        r = scanner.nextInt();
        
        while(r != 0){
            c = scanner.nextInt();
            p = times[r - 1][c -1];
            
            // print the result
            System.out.println("The product of " + r +" and "+ c +" is "+ p);

            // update the loop
            System.out.println("enter 2 numbers to multiply, enter 0 for the first number to quit");
            r = scanner.nextInt();            
        }//end while

        // that's it
        System.out.println("end of program");
    }
}
