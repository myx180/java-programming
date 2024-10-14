import java.util.Scanner;

public class Lab6Task4 {
    public static void main(String[] args) {
        final int NUMBER_OF_QUESTIONS = 5;
        int correctCount = 0;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        StringBuilder output = new StringBuilder();

        while (count < NUMBER_OF_QUESTIONS) {
            int number1 = (int) (Math.random() * 10);
            int number2 = (int) (Math.random() * 10);
            if (number1 < number2) {
                int temp = number1;
                number1 = number2;
                number2 = temp;
            }

            System.out.print("What is " + number1 + " - " + number2 + "? ");
            int answer = scanner.nextInt();
            if (number1 - number2 == answer) {
                System.out.println("You are correct!");
                correctCount++;
            } else {
                System.out.println("Your answer is wrong. " + number1 + " - " + number2 + " should be " + (number1 - number2));
            }
            count++;
            output.append("\n").append(number1).append("-").append(number2).append("=").append(answer).append((number1 - number2 == answer)? " correct" : " wrong");
        }

        long endTime = System.currentTimeMillis();
        long testTime = endTime - startTime;
        System.out.println("Correct count is " + correctCount);
        System.out.println("Test time is " + testTime / 1000 + " seconds");
        System.out.println(output);
        scanner.close();
    }
}