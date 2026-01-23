package part12;

class Utility<T> {
    public T display(T a) {
        return a;
    }
}
public class App {
    public static void main(String[] args) {

        Utility<Integer> util = new Utility<>();
        int result = util.display(10);

        Utility<String> util1 = new Utility<>();
        String result1 = util1.display("John");

        System.out.println(result);
        System.out.println(result1);
    }
}
