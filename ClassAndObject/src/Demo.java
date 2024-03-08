// Define a class Test with integer and string attributes.
class Test {
    int a = 1; // Declare and initialize an integer variable.
    String b = "MERAJ"; // Declare and initialize a string variable.

    // Method to display the values of integer and string attributes.
    void show() {
        System.out.println(a + " " + b); // Print the values of attributes.
    }
}

// Main class Demo to demonstrate the usage of the Test class.
class Demo {
    public static void main(String[] args) {
        Test r = new Test(); // Create an instance of the Test class.
        r.show(); // Call the show method to display the values.
    }
}
