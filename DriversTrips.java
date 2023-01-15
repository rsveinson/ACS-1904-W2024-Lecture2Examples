import java.util.Scanner;
public class DriversTrips
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
        
        System.out.println("\n\t\tDriver Trips");
        
        // number of drivers = number of rows
        //    is trips.length
        for (int i=0; i<trips.length; i++){
            System.out.print("driver: "+i+"\t");
            
            // number of trips for ith driver 
            //    is trips[i].length
            for (int j=0;j<trips[i].length;j++){
                System.out.print(trips[i][j]+"\t");
            }
            System.out.println();
        }
    }

}
