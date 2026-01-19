package part5;
class Calc {
    int a;
    int b;
    public Calc(int n1, int n2) {
        this.a = n1;
        this.b = n2;
    }
    void add(){
        System.out.println(this.a + this.b);
    }
    void multiply(){
        System.out.println(this.a * this.b);
    }
}
public class App {
    public static void main(String[] args) {
        Calc c = new Calc(4, 5);
        c.add();
        c.multiply();
    }
}
