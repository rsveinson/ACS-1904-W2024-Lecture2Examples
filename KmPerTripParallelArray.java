import java.util.Scanner;
public class KmPerTripParallelArray
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
        
        /* why is the size of this array trips.length?
         * what is trips.length?
         */
        int[] tripDistance = new int[trips.length];
        
        int distance = 0;
        
        /* calculate the total distance for each driver by adding
         * up the distance of each trip
         * I'm not going to 
         */ 
        
        // number of drivers = number of rows
        //    is trips.length
        for (int i=0; i<trips.length; i++){
            //System.out.print("driver: " + i + "\t");
            
            // now add up each distance in row i
            // don't forget to start adding from 0
            distance = 0;

            for (int j=0;j<trips[i].length;j++){
                //distance += trips[i][j];
                tripDistance[i] += trips[i][j];
                //System.out.print(trips[i][j] + " ");
            }
            //System.out.print(distance + "\t");
            
            // now we can add the  calculated distance
            // to the distance array at index i
            //tripDistance[i] = distance;
        }// end for

        
        //  now we can print the disetance per trip on demand
        System.out.println("Distance per trip.");
        printList(tripDistance, tripDistance.length);
        
        /* we can even use the new array 
         * in the same manner as we used parallel 1D arrays
         */
        System.out.println("List of driver's trips with total distance.");
        for (int i=0; i<trips.length; i++){
            System.out.print("driver: " + i + "\t");
            
            // print the table row of trip distancesw
            for (int j=0;j<trips[i].length;j++){
                //distance += trips[i][j];
                System.out.print(trips[i][j] + " ");
            }// end for
            
            // print the ith element of the distance array
            System.out.println(": " + tripDistance[i]);
                        
            
        }// end for
    }
    
    public static void printList(int[] l, int actualLength){
        for(int i = 0; i < actualLength; i++){
            System.out.println(i + 1 + ": " + l[i]);
        }// end for
    }// end print list

}
