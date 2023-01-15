import java.util.Scanner;
public class TripsPerDriver
{
    public static void main(String[] args ){
        int[][] trips ={
            {25, 29, 30, 40},
            {44, 25},
            {22, 27, 55, 33, 80},
            {55, 57, 45},
            {31, 42, 49, 46}
        };
        // one line for each driver
        for (int i=0; i<trips.length; i++){
            System.out.println("driver "+i+
                " made  "+trips[i].length+
                " deliveries");
        }
    }

}
