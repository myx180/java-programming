public class Week8Task5 {
    public static void main(String[] args) {
        // Create an array
        double[] mylist = new double[5];
        // Initializing arrays with random values:
        for (int i = 0; i < mylist.length; i++) {
            mylist[i] = Math.random() * 10;
        }
        // Summing all elements
        double total = 0;
        for (int i = 0; i < mylist.length; i++) {
            System.out.print(mylist[i] + " ");
            total += mylist[i];
        }
        System.out.println();
        System.out.print("Sum of all elements is: " + total);
    }
}