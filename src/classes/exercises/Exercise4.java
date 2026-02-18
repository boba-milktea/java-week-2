package classes.exercises;

/**
 * Exercise 4: Abstract, Final, Inner Classes
 * ------------------------------------------
 * TODO:
 * 1. Create an abstract class Animal with abstract method sound().
 * 2. Create a subclass Cat that implements sound().
 * 3. Create a final class MathUtil with method square(int).
 * 4. Create an inner class inside Exercise4_AbstractFinalInner that prints a message.  //do not do it yet
 */
public class Exercise4 {
    public static void main(String[] args) {

    Animal a = new Cat();
    a.sound();

    MathUtil m = new MathUtil();
    System.out.println("The square of the number is: " + m.square(2));

    Exercise4 outer = new Exercise4();
    Inner inner = outer.new Inner();
    inner.show();

    staticInner inner2 = new staticInner();
    inner2.show();

    }
    class Inner {
        void show () {
            System.out.println("Inner Method");
        }
    }

    static class staticInner {
        void show () {
            System.out.println("Static Inner Method");
        }
    }
}

abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    void sound () {
        System.out.println("Meow!");
    }
}

final class MathUtil {
    int square (int num) {
        return num * num;
    }
}