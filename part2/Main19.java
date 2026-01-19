package part2;
import java.util.Scanner;

public class Main19 {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = scr.nextLine();
        System.out.println("Hello " + name);
        scr.close();
    }
}
