public class week9task2{
    public static void main(String[] args) {
        // Create a circle of radius 1
        Circle circle1 = new Circle();
        System.out.println("The area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        // Create a circle of radius 25
        Circle circle2 = new Circle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        // Create a circle of radius 75
        Circle circle3 = new Circle(75);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        // Change the radius of circle 2
        circle2.radius = 100;
        circle2.setRadius(100);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());
    }
}

class Circle {
    double radius;

    // First constructor without arguments
    Circle() {
        radius = 1;
    }

    // Constructor with arguments
    Circle(double newRadius) {
        radius = newRadius;
    }

    // Get area of this circle
    double getArea() {
        return radius * radius * Math.PI;
    }

    // Get perimeter of this circle
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Set new radius for this circle
    void setRadius(double newRadius) {
        radius = newRadius;
    }
}