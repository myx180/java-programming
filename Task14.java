import java.util.Random;

public class Task14 {
    public static void shuffle(int[][] m) {
        Random random = new Random();
        for (int i = m.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            int[] temp = m[i];
            m[i] = m[j];
            m[j] = temp;
        }
    }

    public static void main(String[] args) {
        int[][] m = {
                {1, 2},
                {3, 4},
                {5, 6},
                {7, 8},
                {9, 10}
        };

        System.out.println("Original matrix:");
        for (int[] row : m) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }

        shuffle(m);

        System.out.println("\nShuffled matrix:");
        for (int[] row : m) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}