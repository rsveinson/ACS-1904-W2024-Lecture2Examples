import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class AverageFebruarySnowfall
{
    public static void main(String[] args)
    throws FileNotFoundException {
        // initialize the snowfall array
        double [][] snowfall = new double[15][12];
        Scanner f = new Scanner(
                new File("SnowfallInInches.txt"));
        for (int i=0; i<snowfall.length; i++){
            // inner loop controls the column ac
            for (int j=0;j<snowfall[i].length;j++){
                snowfall[i][j] = f.nextDouble();
            }
        }
        // get total of values in for Februar
        // by accessing second element of each row
        double total = 0;
        for (int i=0; i<snowfall.length; i++)
            total+=snowfall[i][1];
        System.out.print("The average February "+
            "snowfall  is "+(total/snowfall.length)+
            " inches");
    }
}
