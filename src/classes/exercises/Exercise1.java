package classes.exercises;

/**
 * Exercise 1: Basic Class
 * ------------------------
 * TODO:
 * 1. Create a class `Book` with fields: title, author.
 * 2. Add a method `displayInfo()` to print book details.
 * 3. Create objects in main() and call the method.
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        Book b = new Book();
        b.displayInfo();
    }
}

class Book {
    void displayInfo() {
        System.out.println("Book Details");
    }
}

