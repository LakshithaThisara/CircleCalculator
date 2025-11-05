import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        // Create Circle object
        Circle circle = new Circle(radius);

        System.out.println("\n=== Circle Calculations ===");
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        input.close();
    }
}
