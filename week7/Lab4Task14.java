public class Lab4Task14{
    public static int gcd(int a, int b) {
        while (b!= 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = scanner.nextInt();
        int gcdValue = gcd(firstNumber, secondNumber);
        System.out.println("The greatest common divisor for " + firstNumber + " and " + secondNumber + " is " + gcdValue);
    }
}