class Employee{
    void greet(){
        System.out.println("Hello Employee");
    }
}
class Student{
    void greet(){
        System.out.println("Hello Student");
    }
}
public class Main29 {
    public static void main(String[] args){
        System.out.println("This is main method");
        Employee e = new Employee();
        e.greet();
        Student s = new Student();
        s.greet();

    }
}
