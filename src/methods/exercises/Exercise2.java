package methods.exercises;

/**
 * Exercise 2: Modifiers
 * ----------------------
 * TODO:
 * 1. Create one method with each access modifier:
 *    - public, protected, default, private
 * 2. Create one static method and one final method.
 * 3. Try calling them inside main().
 */

public class Exercise2
{
    public static void main(String[] args)
    {
        Exercise2 obj = new Exercise2();

        // Example usage
        obj.publicMethod();

        // TODO: Call other methods here
        obj.defaultMethod();
        obj.privateMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.finalMethod();
        // static method call - attach to the class
        Exercise2.staticMethod();

    }
    // Example: public method
    public void publicMethod()
    {
        System.out.println("Public method called");
    }

    // TODO: Add protectedMethod()
    protected  void protectedMethod() {
        System.out.println("Protected Method Called");
    }

    // TODO: Add defaultMethod()
    void defaultMethod() {
        System.out.println("Default Method Called");
    }


    // TODO: Add privateMethod()
    private void privateMethod () {
        System.out.println("Private Method Called");
    }

    // TODO: Add staticMethod()
    static void staticMethod () {
        System.out.println("Static Method Called");
    }

    // TODO: Add finalMethod()
    final void finalMethod() {
        System.out.println("Final Method Called");
    }

}
