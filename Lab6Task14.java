public class Lab6Task14 {
    public static void main(String[] args) {
        double tuition = 10000;
        int years = 0;
        while (tuition < 20000) {
            tuition += tuition * 0.07;
            years++;
        }
        System.out.println("Tuition will be doubled in " + years + " years.");
        System.out.println("Tuition will be $" + tuition + " in " + years + " years.");
    }
}