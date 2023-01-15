import java.util.Scanner;
public class KmPerDriver
{
    public static void main(String[] args ){
        // 2D array with varying number 
        //    of elements per row
        int[][] trips ={
            {25, 29, 30, 40},
            {44, 25},
            {22, 27, 55, 33, 80},
            {55, 57, 45},
            {31, 42, 49, 46}
        };
        
        int distance = 0;
        
        System.out.println("\n\t\tDriver Trips");
        
        // number of drivers = number of rows
        //    is trips.length
        for (int i=0; i<trips.length; i++){
            System.out.print("driver: " + i + "\t");
            
            // now add up each distance in row i
            // don't forget to star adding from 0
            distance = 0;

            for (int j=0;j<trips[i].length;j++){
                distance += trips[i][j];
            }
            System.out.print(distance + "\t");
            System.out.println();
        }
    }

}
