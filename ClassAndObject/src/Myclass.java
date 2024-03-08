class Fruit{
    String name;
    String color;
    
    void show() {
        System.out.println("Fruits name is ="+name);
        System.out.println("Fruits color is ="+color);
    }
}
public class Myclass {
    public static void main(String[] args) {
        Fruit f1 = new Fruit();  // object create
        f1.name = "Apple";
        f1.color = "Red";
        f1.show(); // method call using object

        System.out.println();

        Fruit f2 = new Fruit();
        f2.name = "BANANA";
        f2.color = "YELLOW";
        f2.show(); // method call using object
    }
}
