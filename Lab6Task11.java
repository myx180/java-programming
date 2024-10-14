public class Lab6Task11 {
    public static void main(String[] args) {
        int totalSum = 0;
        int currentNumber = 0;
        while (currentNumber < 20) {
            currentNumber++;
            if (currentNumber == 10 || currentNumber == 11) {
                continue;
            }
            totalSum += currentNumber;
        }
        System.out.println("The sum is " + totalSum);
    }
}