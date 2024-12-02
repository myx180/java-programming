import java.util.Scanner;

public class Week8Task22 {
    public static double min(double[] array) {
        double minValue = array[0];
        for (double value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 10 numbers:");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextDouble();
        }
        double minNumber = min(numbers);
        System.out.println("The minimum number is " + minNumber);
        scanner.close();
    }
}