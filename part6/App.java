
//Encapsulation Example: Employee Class
class Employee {
    private String name;
    private int id;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
}
public class App {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101);
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee ID: " + emp.getId());
    }
}
