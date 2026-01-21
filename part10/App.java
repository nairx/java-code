package part10;

//Exception Handlidng
public class App {
    public static void main(String[] args) {
        try {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[0]);
        System.out.println(10/0);
        } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Array index is out of bounds!");
        } 
        catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero!");
        }   
        catch (Exception e) {
        System.out.println("An error occurred: " + e.getMessage());
        }
        finally {
        System.out.println("Execution completed.");
        }
    }
}
