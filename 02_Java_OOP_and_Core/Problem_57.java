// Q: Create a class Book with title, author, price. Create 3 objects and find the book with the highest price.

class Book {
    String title;
    String author;
    double price;

    // Constructor
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

public class Problem_57 {
    public static void main(String[] args) {
        // Create 3 book objects
        Book book1 = new Book("Java Basics", "Alice", 250.0);
        Book book2 = new Book("Advanced Java", "Bob", 300.0);
        Book book3 = new Book("Java ME Guide", "Charlie", 275.0);

        // Find the book with the highest price
        Book highestPricedBook = book1;

        if (book2.price > highestPricedBook.price) {
            highestPricedBook = book2;
        }
        if (book3.price > highestPricedBook.price) {
            highestPricedBook = book3;
        }

        // Display the highest priced book
        System.out.println("Book with the highest price:");
        highestPricedBook.display();
    }
}
