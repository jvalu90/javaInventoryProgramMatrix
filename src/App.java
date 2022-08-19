import java.util.Scanner;
import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner inputs = new Scanner(System.in).useLocale(Locale.US);
      int quantityProducts, quantityLocations, quantityMatrix[][], requirementsMatrix[][], productMean;
      String line, productsArray[];

      try {

        System.out.print("Please enter the quantity of products: ");
        quantityProducts = inputs.nextInt();

        System.out.print("Please enter the quantity of locations: ");
        quantityLocations = inputs.nextInt();

        System.out.println("Please enter list of product codes separated by space: ");
        line = inputs.nextLine();
        productsArray = readArray(line);

        System.out.println("Please enter the data from the table of quantities in the warehouse: ");
        line = inputs.nextLine();
        quantityMatrix = readMatrix(line, quantityLocations, quantityProducts);

        System.out.println("Please enter the data from the table of minimum quantities in the warehouse: ");
        line = inputs.nextLine();
        requirementsMatrix = readMatrix(line, quantityLocations, quantityProducts);

        for (int i = 0; i < quantityLocations; i++) {
          for (int j = 0; j < quantityProducts; j++) {
            if (requirementsMatrix[i][j] < quantityMatrix[i][j]) {
              System.out.println("It is necessary to request products of code " + productsArray[j] + " at the location " + i);
            }
          }
        }

        for (int j = 0; j < quantityProducts; j++) {
          for (int i = 0; i < quantityLocations; i++) {

            // complete
          }
        }


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
