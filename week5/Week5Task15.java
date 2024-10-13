import java.util.Scanner;

public class Week5Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first city: ");
        String city1 = scanner.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = scanner.nextLine();

        if (city1.compareTo(city2) < 0) {
            System.out.println("The cities in alphabetical order are: " + city1 + ", " + city2);
        } else {
            System.out.println("The cities in alphabetical order are: " + city2 + ", " + city1);
        }

        scanner.close();
    }
}