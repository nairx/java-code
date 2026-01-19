package part4;

class Employee {
    String name;
    int age;

    public Employee(String n, int a) {
        this.name = n;
        this.age = a;
    }

    void showDetails() {
        System.out.println(this.name + "-" + this.age);
    }

    void showName() {
        System.out.println(this.name);
    }

    void greet() {
        System.out.println("Good Morning");
    }
}

class Contractor extends Employee {
    String type;

    public Contractor(String n, int a, String t) {
        super(n, a);
        this.type = t;
        ;
    }

    void showCategory() {
        System.out.println("Contractor-" + this.type);
    }

    void greet() {
        System.out.println("Good Evening");
    }

    void greet(String msg) {
        System.out.println("Hello " + msg);
    }
}

public class App {
    public static void main(String[] args) {
        Contractor c = new Contractor("Cathy", 23, "C");
        c.showCategory();
        c.showDetails();
        c.showName();
        c.greet();
        c.greet("John");
    }
}
