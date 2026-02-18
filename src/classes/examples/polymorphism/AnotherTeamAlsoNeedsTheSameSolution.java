package classes.examples.polymorphism;

public class AnotherTeamAlsoNeedsTheSameSolution {


    public static void main(String[] args) {
        Shape[] shapeArray = new Shape[6];
        shapeArray[0] = new Triangle();
        shapeArray[1] = new Triangle();
        shapeArray[2] = new Cylinder();
        shapeArray[3] = new Oval();
        shapeArray[4] = new Oval();
        shapeArray[5] = new Rectangle();

        // They didn't do it! because it was complicated
        // Student TODO: Why may this occur?

        Triangle t = new Triangle();
        System.out.println(t.equals(shapeArray[0]) );
        System.out.println( t.toString() );
        System.out.println(t.getClass() );
        System.out.println(t.hashCode() );

    }

    //Note that using instance is not the worst thing, it is OK to use on some cases like DTO mapping, Serialization and deserialization

}
