package part3;
// Create two method sum and sqr
// pass two numbers to sum method and 
// then pass the result to sqr
// then print the result of sqr method in main method
public class Main21 {
    static int sum(int x, int y) {
        return x + y;
    }

    static int sqr(int z) {
        return z * z;
    }

    public static void main(String[] args) {
        int result = sum(4, 5);
        int result1 = sqr(result);
        System.out.println(result1);

    }
}
