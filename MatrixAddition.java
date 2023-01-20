import java.util.Scanner;
public class MatrixAddition
{
    public static void main(String[] args) {
        int[][] a ={
            {1, 2, 3, 4},
            {1, 2, 3, 4},
            {1, 2, 3, 4}
        };
        int[][] b ={
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };
        int [][] c ={
            {0, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 0, 0}
        };;
        
        // C = A + B
        // For each c[i][j] in C
        //    c[i][j] = a[i][j]+b[i][j]
        // A and B must have the same 
        //    number of rows and columns
        for (int i=0; i< a.length; i++)
            for (int j=0; j<a[i].length; j++)
                c[i][j] =a [i][j] + b[i][j];
                
        // display the 3 matrices
        displayMatrix("A = ",a);
        displayMatrix("B = ",b);
        displayMatrix("C = ",c);
    }
    public static void displayMatrix(
        String heading,int[][] m){
        System.out.println(heading);
        for (int i=0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++)
                System.out.print(m[i][j]+"\t");
            System.out.println();
        }
    }
}
