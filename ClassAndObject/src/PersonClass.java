// Define a class named Person with attributes age, weight, and color, and methods eat and sleep.
class Person {
    int age = 21; // Default age set to 21
    int weight = 65; // Default weight set to 65
    String color = "White"; // Default color set to "White"

    // Method to simulate eating
    void eat() {
        System.out.println("I am eating ");
    }

    // Method to simulate sleeping
    void sleep() {
        System.out.println("I am sleeping ");
    }
}

// Main class to demonstrate the usage of the Person class
public class PersonClass {
    public static void main(String[] args) {
        // Create an instance of the Person class
        Person p = new Person();

        // Output the default attributes of the Person
        System.out.println(p.age); // Output age
        System.out.println(p.weight); // Output weight
        System.out.println(p.color); // Output color

        // Call the eat and sleep methods of the Person instance
        p.eat(); // Simulate eating
        p.sleep(); // Simulate sleeping
    }
}
