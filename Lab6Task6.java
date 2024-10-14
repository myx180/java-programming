import java.util.Scanner;

public class Lab6Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputData;
        int totalSum = 0;
        System.out.print("Enter an integer (the input ends if it is 0): ");
        do {
            inputData = scanner.nextInt();
            totalSum += inputData;
        } while (inputData!= 0);
        System.out.println("The sum is " + totalSum);
        scanner.close();
    }
}