import java.util.Scanner;

public class Week5Task24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String input = scanner.next();

        char letter = input.charAt(0);

        if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
            switch (letter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    System.out.println(letter + " is a vowel");
                    break;
                default:
                    System.out.println(letter + " is a consonant");
            }
        } else {
            System.out.println(letter + " is an invalid input");
        }

        scanner.close();
    }
}