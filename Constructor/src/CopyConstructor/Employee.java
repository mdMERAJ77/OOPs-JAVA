package CopyConstructor;
public class Employee {
    int salary;
    String name;

    public Employee(int salary, String name) {
        this.salary=salary;
        this.name=name;
    }
    public Employee (Employee em){
        salary =em.salary+10000;
        name =em.name;
    }
    public static void main(String[] args){
            Employee ob=new Employee(50000,"meraj");
        System.out.println(ob.salary+" "+ob.name+" "+ ob.salary+" "+ ob.name);
        Employee ob3 =new Employee(ob);
        System.out.println("copy data= "+ob3.salary+" "+ob3.name);
    }

}
