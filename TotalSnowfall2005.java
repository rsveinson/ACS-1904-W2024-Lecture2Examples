import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class TotalSnowfall2005
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
        // display snowfall for 2005
        // convert year to proper subscript
        int year = 2005-2000;
        // get total of values in the row for 2005
        double total = 0;
        for (double s : snowfall[year])
            total+=s;
        System.out.print("The snowfall for 2005 "+
            " is "+total+" inches");
    }
}
