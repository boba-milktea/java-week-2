package projects;

/**
 * Book Information (Intro to Classes)
 * Concepts used: Classes, objects, fields, methods, constructors.
 *
 * Create a Book class with fields: title, author, year.
 * Add a constructor to initialize the book.
 * Add a method printDetails() that prints all info.
 * In main, create two Book objects and call printDetails() on each.
 */

public class BookInfo {
    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "Father of Java", 2001 );
        Book b2 = new Book("Java Advanced", "Father of Java", 2003 );
        b1.printDetails();
        b2.printDetails();
    }
}

class Book {
    String title;
    String author;
<<<<<<< Updated upstream
<<<<<<< Updated upstream
    int year;

=======
=======
>>>>>>> Stashed changes
    Integer year;

    // default constructor (no-arg constructor) to make the default values
    public Book () {
        title = "";
        author = "";
        year = 0;
    }

    // parameter constructor
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void printDetails() {
<<<<<<< Updated upstream
<<<<<<< Updated upstream
        System.out.println("The book title: " + title);
        System.out.println("The book author: " + author);
        System.out.println("Published Year: " + year);
        System.out.println();
=======
=======
>>>>>>> Stashed changes
        System.out.printf("Title %s | Book Author %s | Published Year %d\n", this.title, this.author, this.year);
        // System.out.println("The book title: " + title);
        // System.out.println("The book author: " + author);
        // System.out.println("Published Year: " + year);
        // System.out.println();
<<<<<<< Updated upstream
>>>>>>> Stashed changes
=======
>>>>>>> Stashed changes
    }
}
