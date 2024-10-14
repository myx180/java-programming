public class Lab6Task10 {
    public static void main(String[] args) {
        int currentNumber = 0;
        int totalSum = 0;
        while (currentNumber < 20) {
            currentNumber++;
            totalSum += currentNumber;
            if (totalSum >= 100) {
                break;
            }
        }
        System.out.println("The number is " + currentNumber);
        System.out.println("The sum is " + totalSum);
    }
}