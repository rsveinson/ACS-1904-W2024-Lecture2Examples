import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Snowfall
{
    public static void main(String[] args)
    throws FileNotFoundException {
        // an array of 15 rows and 12 columns
        double [][] snowfall = new double[15][12];
        int year = 2000;
        
        // open the input data stream
        Scanner f = new Scanner(new File("SnowfallInInches.txt"));
        
        // print some header information
        System.out.println("\nData read from "
            +"SnowfallInInches.txt "+
            "\nby year from 2000 to 2014, and for "+
            "\neach year from January to December");
            
        // outer loop controls the row subscript
        for (int i = 0; i < snowfall.length; i++){
            // inner loop controls the column 
            for (int j = 0; j < snowfall[i].length; j++){
                snowfall[i][j] = f.nextDouble();
            }
        }
        
        // display the contents of the table by year
        
        // first print out column headings
        printRowAndColHeadings();
        
        //System.out.println("Data obtained is:");
        for (int i=0; i<snowfall.length; i++){
            //System.out.println();
            //System.out.print(year++ + "\t");
            //System.out.print(year[i] + "\t");
            
            for (int j=0;j<snowfall[i].length;j++){
                System.out.print(snowfall[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
    public static void printRowAndColHeadings(){
        System.out.print("Year\t");
        System.out.println("Jan\tFeb\tMar\tApr\tMay\tJun\tJul\tAug\tSep\tOct\tNov\tDec");
    }// end print heading
}
