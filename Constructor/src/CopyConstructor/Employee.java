package CopyConstructor;
public class Employee {
    private int salary;
    private String name;

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
            Employee ob2=ob;
        System.out.println(ob.salary+" "+ob.name+" "+ob2.salary+" "+ob2.name);
        Employee ob3 =new Employee(ob);
        System.out.println("copy data= "+ob3.salary+" "+ob3.name);
    }

}
