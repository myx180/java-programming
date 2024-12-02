public class Week8Task1 {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            int[] values = new int[5];
            values[i] = i + values[i - 1];
        }
        values[0] = values[1] + values[4];
    }
}