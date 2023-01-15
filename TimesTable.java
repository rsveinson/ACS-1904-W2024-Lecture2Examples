import java.util.Scanner;
/** 
 * ACS-1904 Assignment X Question Y
 * @author 
*/

public class TimesTable{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // operands and product
        int i = 0;
        int j = 0;
        int p = 0;
        
        int[][] times = {{1,2,3,4,5,6},     //times[0]
                         {2,4,6,8,10,12},   // times[1]
                         {3,6,9,12,15,18},  // times[2]
                         {4,8,12,16,20,24},
                         {5,10,15,20,25,30},
                         {6,12,18,24,30,36}};
        
        // calculate prducts                 
        System.out.println("enter 2 numbers to multiply, enter 0 for the first number to quit");
        i = scanner.nextInt();
        
        while(i != 0){
            j = scanner.nextInt();
            p = times[i - 1][j -1];
            
            // print the result
            System.out.println("The product of "+i+" and "+j+" is "+p);

            // update the loop
            System.out.println("enter 2 numbers to multiply, enter 0 for the first number to quit");
            i = scanner.nextInt();            
        }//end while

        // that's it
        System.out.println("end of program");
    }
}
