// Define a class AddTwoNumber to perform addition of two numbers.
class AddTwoNumber {
    int a, b, result; // Declare variables for operands and result.

    // Method to calculate and display the sum of the two numbers.
    void show() {
        result = a + b;
        System.out.println(result);
    }
}

// Main class Addition to demonstrate the addition functionality.
public class Addition {
    public static void main(String[] args) {
        AddTwoNumber r = new AddTwoNumber(); // Create an instance of AddTwoNumber class.
        r.a = 2; // Assign value to the first operand.
        r.b = 5; // Assign value to the second operand.

        r.show(); // Call the method to perform addition and display the result.
    }
}
