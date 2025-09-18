// Q: Create a class Book with title, author, and price. 
//    Create 3 objects of Book and find the book with the highest price using a method.

public class Problem_59 {
    public static void main(String[] args) {
        // Creating 3 Book objects
        Book book1 = new Book();
        book1.title = "Python";
        book1.author = "Ravi";
        book1.price = 480;

        Book book2 = new Book();
        book2.title = "C++";
        book2.author = "Ashish";
        book2.price = 340;

        Book book3 = new Book();
        book3.title = "Java";
        book3.author = "Prince";
        book3.price = 300;

        // Finding the highest priced book
        Book highestPricedBook = Book.getHighestPricedBook(book1, book2, book3);

        System.out.println("Book with the highest price:");
        highestPricedBook.display();
    }
}

class Book {
    String title;
    String author;
    int price;

    // Method to display book details
    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }

    // Static method to find highest priced book among 3 books
    static Book getHighestPricedBook(Book b1, Book b2, Book b3) {
        Book highest = b1;

        if (b2.price > highest.price) {
            highest = b2;
        }
        if (b3.price > highest.price) {
            highest = b3;
        }

        return highest;
    }
}
