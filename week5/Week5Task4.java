public class Week5Task4{
    public static void main(String[] args) {
        System.out.println("Math.max(2, 3) returns " + Math.max(2, 3));
        System.out.println("Math.min(2.5, 4.6) returns " + Math.min(2.5, 4.6));
        System.out.println("Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)) returns " + Math.max(Math.max(2.5, 4.6), Math.min(3, 5.6)));
        System.out.println("Math.abs(-2) returns " + Math.abs(-2));
        System.out.println("Math.abs(-2.1) returns " + Math.abs(-2.1));

        int random0To9 = (int)(Math.random() * 10);
        System.out.println("A random integer between 0 and 9: " + random0To9);

        int random50To99 = 50 + (int)(Math.random() * 50);
        System.out.println("A random integer between 50 and 99: " + random50To99);

        int a = 20;
        int b = 30;
        int randomBetweenAB = a + (int)(Math.random() * b);
        System.out.println("A random integer between " + a + " and " + (a + b - 1) + ": " + randomBetweenAB);
    }
}