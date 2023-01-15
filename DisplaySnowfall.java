import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class DisplaySnowfall
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
        // prompt user ... display snowfall
        System.out.println("Enter the year as "+
            "an integer, "+
            "\nthen the name of the month:");
        Scanner kb = new Scanner(System.in);
        // convert year to proper subscript
        int year = kb.nextInt()-2000;
        String month = kb.next();
        // convert month to proper subscript
        int monthInt = convertMonth(month);
        System.out.print("The snowfall for "+
            month+" in "+ (2000+year)+" is "+
            snowfall[year][monthInt]+" inches");
    }

    public static int convertMonth(String month){
        int monthInt;
        switch (month.toLowerCase()){
            case "january": monthInt = 0; break;
            case "february": monthInt = 1; break;
            case "march": monthInt = 2; break;
            case "april": monthInt = 3; break;
            case "may": monthInt = 4; break;
            case "june": monthInt = 5; break;
            case "july": monthInt = 6; break;
            case "august": monthInt = 7; break;
            case "september": monthInt = 8; break;
            case "october": monthInt = 9; break;
            case "november": monthInt =  10; break;
            case "december": monthInt = 11; break;
            default: monthInt = -1; // bad month name
        }
        return monthInt;
    }
}
