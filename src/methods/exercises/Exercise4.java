package methods.exercises;

/**
 * Exercise 4: Special Methods
 * ----------------------------
 * TODO: do a lesson on this one
 * 1. Create a constructor that prints "Object created".
 * 2. Create a varargs method `printStrings(String... words)` that prints all words.
 * 3. Create an abstract class Shape with abstract method `draw()`.
 * 4. Create a subclass Rectangle that implements draw().
 */

public class Exercise4
{

    // TODO: Constructor prints "Object created"
    public Exercise4() {
        System.out.println("Object created");
    }

    // TODO: Varargs method printStrings()
    public void printStrings(String... names) {
        for (String name : names ) {
            System.out.print(name + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        // TODO: Test constructor

        Exercise4 obj = new Exercise4();
        System.out.println("Test" + obj);

        // TODO: Call printStrings with multiple arguments
        obj.printStrings("Jullie", "Lulu", "Funky", "Sweet");

        Shape s1 = new Circle();
//        s1.draw();

        // TODO: Create Rectangle object and call draw()
        Shape rec = new Rectangle();
            rec.draw();
    }
}


abstract class Shape
{
    // TODO: declare abstract method draw()
    public abstract void draw();
}

class Circle extends Shape
{
//    @Override
    public void draw()
    {
        System.out.println("Drawing a Circle");
    }
}

// TODO: Create Rectangle class that implements draw()
class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}
