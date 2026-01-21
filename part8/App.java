package part8;
//Interface Example

interface Animal {
    void makeSound();
    void move();
}
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
    @Override
    public void move() {
        System.out.println("The dog runs.");
    }
}
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
    @Override
    public void move() {
        System.out.println("The cat prowls.");
    }
}

public class App {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Output: Woof!
        Animal cat = new Cat();
        cat.makeSound(); // Output: Meow!
        dog.move(); // Output: The dog runs.
        cat.move(); // Output: The cat prowls.
    }
}
