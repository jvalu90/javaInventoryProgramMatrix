import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner inputs = new Scanner(System.in).useLocale(Locale.US);
      int quantityProducts, quantityLocations;

      System.out.print("Please enter the quantity of products: ");
      quantityProducts = inputs.nextInt();

      System.out.print("Please enter the quantity of locations: ");
      quantityLocations = inputs.nextInt();

      // array of products
      // matrix of quantitys 

      try {

      } catch (Exception ex) {
        System.out.println("An error has ocurred" + ex.getMessage());
      } finally {
        inputs.close();
      }
    }

    public static int[][] readMatrix(String line, int quantityLocations, int quantityProducts) {
      int[][] matrix = new int[quantityLocations][quantityProducts];
      String[] rows, columns;
      
      rows = line.split(";");

      for (int i = 0; i < rows.length; i++) {
        columns = rows[i].split(" ");

        for (int j = 0; j < columns.length; j++) {
          matrix[i][j] = Integer.parseInt(columns[j]);
        }
      }

      return matrix;
    }

    public static String[] readArray(String line) {
      String[] array;

      array = line.split(" "); 

      return array;
    }

}
