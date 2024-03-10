class Pen {

    String color;
    String type;
    public void show() {
        System.out.println("color is "+ color);
        System.out.println("type is "+type);
    }
    public void printColor() {
        System.out.println(this.color);
    }
}

class Student {
    String name;
    int age;
    int rollno;
    public void StudentInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.rollno);
    }
}
public class ClassPen {
    public static void main(String[] args)
    {
        Student s1 = new Student();
        s1.name= "MERAJ";
        s1.age = 20;
        s1.rollno = 1;

        s1.StudentInfo();

        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpen";

        pen1.printColor();
        pen2.printColor();
    }
}
