import java.util.Random;
import java.util.Arrays;

/** 
 * ACS-1904 Sorting the rows of table
 * @Sveinson 
*/

public class RowWiseSorting{
    public static void main(String[] args){
        // set up the table constants
        final int ROWS = 5;
        final int COLUMNS = 10;
        
        Random r = new Random();

        int table[][] = new int[ROWS][COLUMNS];
        
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < COLUMNS; j++){
                table[i][j] = r.nextInt(10) + 1;
            }// end for j
        }// end for i
        
        printTable(table, table.length, table[0].length);
        sortTable(table, table.length);
        
        System.out.println();
        printTable(table, table.length, table[0].length);

        System.out.println("end of program");
    }//end main
    
    // some static methods
    
    // sort the table row wise
    public static void sortTable(int[][] t, int size){
        for(int i = 0; i < size; i++){
            Arrays.sort(t[i]);
        }// end i
    }// end sort
    
    
    public static void printTable(int[][] t, int r, int c){
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(t[i][j] + " ");
            }// end j
            System.out.println();
        }//end i
    }// end printtable
    
    
}// end class
