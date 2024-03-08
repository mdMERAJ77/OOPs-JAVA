// Define a class Fruit to represent fruits with name and color attributes.
class Fruit {
    String name; // Declare variable to store fruit name.
    String color; // Declare variable to store fruit color.

    // Method to display the name and color of the fruit.
    void show() {
        System.out.println("Fruit's name is = " + name); // Print fruit name.
        System.out.println("Fruit's color is = " + color); // Print fruit color.
    }
}

// Main class Myclass to demonstrate the usage of Fruit class.
public class Myclass {
    public static void main(String[] args) {
        Fruit f1 = new Fruit(); // Create an instance of Fruit class.
        f1.name = "Apple"; // Assign value to the name attribute of f1.
        f1.color = "Red"; // Assign value to the color attribute of f1.
        f1.show(); // Call the show method to display f1's attributes.

        System.out.println(); // Print an empty line for separation.

        Fruit f2 = new Fruit(); // Create another instance of Fruit class.
        f2.name = "BANANA"; // Assign value to the name attribute of f2.
        f2.color = "YELLOW"; // Assign value to the color attribute of f2.
        f2.show(); // Call the show method to display f2's attributes.
    }
}
