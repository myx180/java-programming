public class Lab6Task7{
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        int i = 5; 
        int j = 3;
        if (i < j) {
            System.out.println(i);
        } else {
            System.out.println(j);
        }
        while (j < 10) {
            j++;
        }
        do {
            j++;
        } while (j < 10);
    }
}