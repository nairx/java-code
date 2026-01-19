package part2;
public class Main20 {
    static void greet() {
        System.out.println("Good Morning");
    }

    static void greet1(String name) {
        System.out.println("Hello " + name);
    }

    static String greet2() {
        return "Cathy";
    }
    public static void main(String[] args) {
        System.out.println("This is main method");
        greet();
        greet1("John");
        String result = greet2();
        System.out.println(result);
    }
}
