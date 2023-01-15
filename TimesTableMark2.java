import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class TimesTableMark2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // operands and product
        int r = 0;
        int c = 0;
        int p = 0;
        
        int[][] times = new int[6][6];
        
        // load the array
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                times[i][j] = (i + 1) * (j + 1);
            }// end for j
        }// end for i
        
        // print the first row (column headings)
        System.out.print("Times\t");
        for(int i = 1; i < 6; i++)
            System.out.print(i + "\t");
        System.out.println();
        
        // print the table
        for(int i = 0; i < 6; i++){
            System.out.print((i + 1) + "\t");
            for(int j = 0; j < 6; j++){
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
