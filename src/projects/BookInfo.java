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
    int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void printDetails() {
        System.out.println("The book title: " + title);
        System.out.println("The book author: " + author);
        System.out.println("Published Year: " + year);
        System.out.println();
    }
}
