package classes.examples.polymorphism;

public class AnotherUsageInOurProjectWithPolymorphism {

    static void paint(Shape shape)
    {
        if (shape != null) {
            shape.draw();
        }


    }

    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[5];
        shapeArray[0] = new Triangle();
        shapeArray[1] = new Triangle();
        shapeArray[2] = new Cylinder();
        shapeArray[3] = new Oval();
        shapeArray[4] = new Oval();

        for(Shape obj: shapeArray) {
            paint(obj);
        }

    }

    //Note that using instance is not the worst thing,
    // it is OK to use on some cases like DTO mapping, Serialization and deserialization
}
