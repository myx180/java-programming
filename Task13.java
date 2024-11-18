import java.util.Random;

public class Task13 {
    public static void main(String[] args) {
        int[][] matrix = new int[4][4];
        Random random = new Random();

        // Fill the matrix with random 0s and 1s
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = random.nextInt(2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        int largestRowIndex = 0;
        int largestRowCount = 0;
        for (int i = 0; i < 4; i++) {
            int rowCount = 0;
            for (int j = 0; j < 4; j++) {
                if (matrix[i][j] == 1) {
                    rowCount++;
                }
            }
            if (rowCount > largestRowCount) {
                largestRowCount = rowCount;
                largestRowIndex = i;
            }
        }

        int largestColumnIndex = 0;
        int largestColumnCount = 0;
        for (int j = 0; j < 4; j++) {
            int columnCount = 0;
            for (int i = 0; i < 4; i++) {
                if (matrix[i][j] == 1) {
                    columnCount++;
                }
            }
            if (columnCount > largestColumnCount) {
                largestColumnCount = columnCount;
                largestColumnIndex = j;
            }
        }

        System.out.println("The largest row index: " + largestRowIndex);
        System.out.println("The largest column index: " + largestColumnIndex);
    }
}