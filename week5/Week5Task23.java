import java.util.Scanner;

public class Week5Task23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length from the center of a pentagon to a vertex: ");
        double r = scanner.nextDouble();

        double s = 2 * r * Math.sin(Math.toRadians(360 / 5) / 2);
        double area = (5 * s * s) / (4 * Math.tan(Math.toRadians(360 / 5)));

        System.out.printf("The area of the pentagon is %.2f\n", area);

        scanner.close();
    }
}