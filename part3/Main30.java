package part3;
class Employee1 {
    String company = "JP Morgan";
    void greet() {
        System.out.println("Hello Employee");
    }
    void greet(String name) {
        System.out.println("Hello" + name);
    }
    
}

public class Main30 {
    public static void main(String[] args) {
        System.out.println("This is main method");
        Employee1 e = new Employee1();
        e.greet();
        e.greet("John");
        System.out.println(e.company);

    }
}
