import java.util.Scanner;

public class Lab6Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer (the input ends if it is 0): ");
        int inputNumber = scanner.nextInt();
        int sum = 0;
        while (inputNumber!= 0) {
            sum += inputNumber;
            System.out.print("Enter an integer (the input ends if it is 0): ");
            inputNumber = scanner.nextInt();
        }
        System.out.println("The sum is " + sum);
        scanner.close();
    }
}