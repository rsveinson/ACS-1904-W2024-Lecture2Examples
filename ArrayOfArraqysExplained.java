import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class ArrayOfArraqysExplained{
    public static void main(String[] args) {
        final int MAXROW = 5;
        final int MAXCOL = 4;
        
        int[][] table = new int[MAXROW][MAXCOL];
        
        Scanner scanner = new Scanner(System.in);
        
        // load the table with values
        for(int i = 0; i < table.length; i++){
            for(int j = 0; j < table[i].length; j++){
                table[i][j] = i + j;
            }// end for j
        }// end for i
        
        System.out.println("the address of the table is ");
        System.out.println(table + "\n");
        
        // print the length of the table
        System.out.println("The length of the table is " + table.length);
        printTable(table);

        System.out.println("end of program");
    }// end main
    
    public static void printTable(int[][] t){
        // print the table
        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                System.out.print(t[i][j] + "  ");
            }// end for j
            System.out.print("row " + i + " address " + t[i]);
            System.out.print( ": length " + t[i].length);
            System.out.println();
        }// end for i 
    }// end printTable
}// end class
