package part9;
class Student {
   static String college = "ABC College";
   String name;
   static int sqr(int x) {
      return x * x;
   }
   static class InnerApp {
           void display() {
         System.out.println("Inside Static Inner Class");
      }
   }
}

public class App {
      public static void main(String[] var0) {
      System.out.println(Student.college);
      System.out.println("Square of 5: " + Student.sqr(5));
      Student.InnerApp var1 = new Student.InnerApp();
      var1.display();
   }
}
