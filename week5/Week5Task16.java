public class Week5Task16 {
    public static void main(String[] args) {
        // indexOf
        System.out.println("Welcome to Java".indexOf("W"));
        System.out.println("Welcome to Java".indexOf("0"));
        System.out.println("Welcome to Java".indexOf("o", 5));
        System.out.println("Welcome to Java".indexOf("come"));
        System.out.println("Welcome to Java".indexOf("Java", 5));
        System.out.println("Welcome to Java".indexOf("java", 5));

        // lastIndexOf
        System.out.println("Welcome to Java".lastIndexOf("W"));
        System.out.println("Welcome to Java".lastIndexOf("0"));
        System.out.println("Welcome to Java".lastIndexOf("o", 5));
        System.out.println("Welcome to Java".lastIndexOf("come"));
        System.out.println("Welcome to Java".lastIndexOf("Java", 5));
        System.out.println("Welcome to Java".lastIndexOf("java", 5));
    }
}