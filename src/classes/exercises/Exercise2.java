package classes.exercises;

/**
 * Exercise 2: Constructors
 * -------------------------
 * TODO:
 * 1. Create a class `Person` with fields: name, age.
 * 2. Write a default constructor (assign default values).
 * 3. Write a parameterized constructor.
 * 4. Create objects using both constructors and display results.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        Person p1 = new Person();
        Person p2 = new Person("George", 20);

        p1.display();
        p2.display();
    }

    Exercise2() {

    }
}

/**
 * This class will be used in Example2Contructors.java
 */
class WeTrySomething {
    public int field;
    public WeTrySomething() {

    }
}

class Person {
    String name;
    int age;

    Person() {
        this.name = "Julie";
        this.age = 30;
    }

    // parameterized constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display () {
        System.out.println(name + " is " + age + " years old." );
    }
}