import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private int nextId;

    // Constructor
    public Library() {
        books = new ArrayList<>();
        nextId = 1;
    }

    // Add a new book to the library
    public void addBook(String title, String author) {
        books.add(new Book(nextId++, title, author));
    }

    // Display all books in the library
    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    // Borrow a book by id
    public void borrowBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && !book.isBorrowed()) {
                book.borrow();
                System.out.println("Book borrowed successfully.");
                return;
            }
        }
        System.out.println("Book not found or already borrowed.");
    }

    // Return a book by id
    public void returnBook(int id) {
        for (Book book : books) {
            if (book.getId() == id && book.isBorrowed()) {
                book.returnBook();
                System.out.println("Book returned successfully.");
                return;
            }
        }
        System.out.println("Book not found or not borrowed.");
    }
}
