// Define a class PerformAlgebraCalculation to perform basic algebraic operations.
class PerformAlgebraCalculation {
    int a, b, Addition, Subtraction, Multiplication, Divide; // Declare variables for operands and results.

    // Method to calculate and display the results of addition, subtraction, multiplication, and division.
    void show() {
        Addition = a + b; // Calculate the sum.
        Subtraction = a - b; // Calculate the difference.
        Multiplication = a * b; // Calculate the product.
        Divide = a / b; // Calculate the quotient.

        // Print the results of each operation.
        System.out.println("Addition " + Addition);
        System.out.println("Subtraction " + Subtraction);
        System.out.println("Multiplication " + Multiplication);
        System.out.println("Divide " + Divide);
    }
}

// Main class Algebra to demonstrate basic algebraic operations.
public class Algebra {
    public static void main(String[] args) {
        PerformAlgebraCalculation r = new PerformAlgebraCalculation(); // Create an instance of PerformAlgebraCalculation class.
        r.a = 20; // Assign a value to the first operand.
        r.b = 5; // Assign a value to the second operand.

        r.show(); // Call the method to perform calculations and display the results.
    }
}
