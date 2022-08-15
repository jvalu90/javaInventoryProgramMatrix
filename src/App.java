import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
      
    }

    public static int[][] readMatrix(int m, int n) {
      int[][] matrix = new int[m][n]; 

      return matrix;
    }

    public static int[] readArray(int n) {
      // Scanner
      int[] array = new int[n];

      for (int i = 0; i < n; i++) {
        System.out.print("Please type the code of the product " + (i + 1) + ": ");
      }

      return array; 
    }
}
