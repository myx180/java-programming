public class Lab4Task2 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 2;
        int maximum = max(number1, number2);
        System.out.println("The maximum of " + number1 + " and " + number2 + " is " + maximum);
    }

    public static int max(int num1, int num2) {
        return num1 > num2? num1 : num2;
    }
}