package projects.bookInfo;

class Book {
    String title;
    String author;
    Integer year;

    // default constructor (no-arg constructor) to make the default values
    public Book () {
        title = "";
        author = "";
        year = 0;
    }

    // parameter constructor
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
        System.out.printf("Title %s | Book Author %s | Published Year %d\n", this.title, this.author, this.year);
    }
}
