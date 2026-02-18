package classes.examples.polymorphism;

public class BadExampleWithoutPolymorphism {

    static void paint(Object shape) {       //?
        if (shape == null) {
            System.out.println("Shape is null, it's better to stop the program rather than to crash");
        }
        if(shape instanceof Triangle) {
            System.out.println("Drawing a triangle");
        }
        else if(shape instanceof Cylinder) {
            System.out.println("Drawing a cylinder");
        }
        //......

        /** Why is this bad?
         * instanceof is a code smell by itself
         * because we are behaving according to the type of the object
         * but instead every object should know how to act.
         * When implementing it, we have to cover all the cases, we may make errors, and forget to implement some of them.
         * Polymorphism covers those risks.
         *
         * Why it doesn't follow the open closed principle?
         * hint if you don't know: if you cannot see why it is bad,
         *              try to add more shapes like Cone or Cylinder
         * Student TODO: refactor this code so it follows OCP and polymorphism
         * Student TODO: add a new Shape subclass (Hexagon, Cone, Cube etc.)
         */
    }

    public static void main(String[] args) {

        Shape[] shapeArray = new Shape[5];
        shapeArray[0] = new Triangle();
        shapeArray[1] = new Triangle();
        shapeArray[2] = new Cylinder();
        shapeArray[3] = new Oval();
        shapeArray[4] = new Oval();
        shapeArray[5] = new Rectangle();

        for(Shape obj: shapeArray) {
            paint(obj);
        }

    }

    //Note that using instance is not the worst thing,
    // it is OK to use on some cases like DTO mapping, Serialization and deserialization
}
