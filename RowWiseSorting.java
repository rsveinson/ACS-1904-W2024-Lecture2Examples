import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Arrays;

/** 
 * ACS-1904 Assignment 1
 * @Sveinson 
*/

public class RowWiseSorting{
    public static void main(String[] args)throws FileNotFoundException {
        
        Scanner scanner = new Scanner(System.in);
        Random r = new Random();

        int table[][] = new int[5][10];
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 10; j++){
                table[i][j] = r.nextInt(10) + 1;
            }// end for j
        }// end for i
        
        printTable(table, table.length, table[0].length);
        sortTable(table, table.length);
        
        System.out.println();
        printTable(table, table.length, table[0].length);

        System.out.println("end of program");
    }
    public static void sortTable(int[][] t, int size){
        for(int i = 0; i < size; i++){
            Arrays.sort(t[i]);
        }
    }
    
    public static void printTable(int[][] t, int r, int c){
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                System.out.print(t[i][j] + " ");
            }// end j
            System.out.println();
        }//end i
    }
}
