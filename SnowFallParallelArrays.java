import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class SnowFallParallelArrays
{
    public static void main(String[] args)
    throws FileNotFoundException {

        String strin = "";              // string to read input file line by line

        // an array of 15 rows and 12 columns
        double [][] snowfall = new double[15][12];
        int[] year = new int[snowfall.length];
        // test the length of the new 1D array called year should be 15
        //System.out.println(year.length);
        
        // need a starting year
        int startingYear = 2000;
        
        // keep track of how many rows have been used/made
        int rows = 0;

        // open the input data stream
        Scanner f = new Scanner(new File("SnowfallInInches.txt"));

        // print some header information
        System.out.println("\nData read from "
            +"SnowfallInInches.txt "+
            "\nby year from 2000 to 2014, and for "+
            "\neach year from January to December");

        // outer loop controls the row subscript
        rows = 0;       // i know we set rows to 0 at declaration but I like to make sure

        while(f.hasNextLine()){
            strin = f.nextLine();
            //System.out.println(strin);
            
            // add a new element to the year array
            year[rows] = startingYear + rows;
            
            //create a scanner for the line read from the file
            Scanner s = new Scanner(strin);

            // inner loop controls the column 
            for (int j = 0; j < snowfall[rows].length; j++){
                snowfall[rows][j] = s.nextDouble();
            }

            // increment rows
            rows++;            
        }// end eof loop

        // display the contents of the table by year

        // first print out column headings
        printRowAndColHeadings();

        //System.out.println("Data obtained is:");
        for (int i=0; i<snowfall.length; i++){
            //now instead of printing the variable year we print element i of the year array
            System.out.print(year[i] + "\t");
            
            // print the table of temperatures
            for (int j=0;j<snowfall[i].length;j++){
                System.out.print(snowfall[i][j]+"\t");
            }// end for j
            System.out.println();
        }// end for i
    }// end main

    public static void printRowAndColHeadings(){
        System.out.print("Year\t");
        System.out.println("Jan\tFeb\tMar\tApr\tMay\tJun\tJul\tAug\tSep\tOct\tNov\tDec");
    }// end print heading
}
