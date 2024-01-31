import java.util.Scanner;
public class KmPerTripParallelArrayWithMethod
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

            // pass one row into the sum method
            tripDistance[i] = sumList(trips[i]);
        }// end for
        
        // or, not quite as good in my opinion but you could
        // argue otherwise
        //sumList(trips, tripDistance);

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

    public static void sumList(int[][] t, int[] l){
        for (int i=0; i<t.length; i++){

            // sum the table row of trip distancesw
            for (int j=0; j<t[i].length; j++){
                //distance += trips[i][j];
                l[i] += t[i][j];
            }// end for    
        }// end ;for i
    }// end sumlist

    public static int sumList(int[] t){
        int sum = 0;

        //sum the row i.e. the 1d array passed into the method
        for (int i=0; i<t.length; i++){           
            sum += t[i];
        }// end for
        return sum;
    }// end get driver total

    public static void printList(int[] l, int actualLength){
        for(int i = 0; i < actualLength; i++){
            System.out.println(i + 1 + ": " + l[i]);
        }// end for
    }// end print list

}
