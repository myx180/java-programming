import java.util.Scanner;

public class Lab6Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 101);
        int userGuess;
        System.out.println("Guess a magic number between 0 and 100.");
        do {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt();
            if (userGuess == targetNumber) {
                System.out.println("Yes, the number is " + targetNumber);
            } else if (userGuess > targetNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }
        } while (userGuess!= targetNumber);
        scanner.close();
    }
}