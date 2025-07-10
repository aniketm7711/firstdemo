package MethodsFunctions;

public class QuadraticEqSlv {
    public static void solveQuadratic(double a, double b, double c) {
        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
            return;
        }

        double discriminant = b * b - 4 * a * c;
        System.out.println("Discriminant: " + discriminant);

        if (discriminant > 0) {
            // Real and distinct roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Real and distinct roots: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            // Real and equal roots
            double root = -b / (2 * a);
            System.out.println("Real and equal roots: " + root + " and " + root);
        } else {
            // Imaginary roots
            double realPart = -b / (2 * a);
            double imagPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Imaginary roots: " + realPart + " + " + imagPart + "i and " +
                    realPart + " - " + imagPart + "i");
        }
    }

    public static void main(String[] args) {
        // Example test
        double a = 1, b = 4, c = 5;
        solveQuadratic(a, b, c);
    }

}
