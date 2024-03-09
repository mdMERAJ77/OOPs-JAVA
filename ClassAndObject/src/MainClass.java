class car {
    String make;
    String color;
    int year;

    void show() {
        System.out.println(make);
        System.out.println(color);
        System.out.println(year);
    }
}
public class MainClass {
    public static void main(String[] args){
        car r = new car();

        r.make = "Toyota";
        r.color = "Black";
        r.year = 2024;

        r.show();
    }
}
