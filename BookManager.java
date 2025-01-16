import javax.swing.*;

class Book {
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return "Book [Title: " + title + ", Author: " + author + ", ISBN: " + isbn + "]";
    }
}

public class BookManager {
    public static void main(String[] args) {
        Book[] books = new Book[100]; // Fixed array for storing books
        int bookCount = 0; // Track the number of books added
        String menu = "1. Add Book\n2. Remove Book\n3. View All Books\n4. Exit";

        while (true) {
            String choice = JOptionPane.showInputDialog(menu);
            switch (choice) {
                case "1": // Add Book
                    if (bookCount >= books.length) {
                        JOptionPane.showMessageDialog(null, "Library is full! Cannot add more books.");
                        break;
                    }
                    String title = JOptionPane.showInputDialog("Enter Book Title:");
                    String author = JOptionPane.showInputDialog("Enter Book Author:");
                    String isbn = JOptionPane.showInputDialog("Enter Book ISBN:");
                    books[bookCount++] = new Book(title, author, isbn);
                    JOptionPane.showMessageDialog(null, "Book added successfully!");
                    break;

                case "2": // Remove Book
                    String isbnToRemove = JOptionPane.showInputDialog("Enter ISBN of the Book to Remove:");
                    boolean found = false;
                    for (int i = 0; i < bookCount; i++) {
                        if (books[i] != null && books[i].getIsbn().equals(isbnToRemove)) {
                            books[i] = null; // Mark the book as null
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        JOptionPane.showMessageDialog(null, "Book removed successfully!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Book not found!");
                    }
                    break;

                case "3": // View All Books
                    String allBooks = "Books in Library:\n";
                    boolean hasBooks = false;
                    for (int i = 0; i < bookCount; i++) {
                        if (books[i] != null) {
                            allBooks += books[i].toString() + "\n"; // Concatenate book details
                            hasBooks = true;
                        }
                    }
                    JOptionPane.showMessageDialog(null, hasBooks ? allBooks : "No books in library.");
                    break;

                case "4": // Exit
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid choice! Try again.");
            }
        }
    }
}
