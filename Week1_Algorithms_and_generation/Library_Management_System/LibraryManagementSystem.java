import java.util.*;

public class LibraryManagementSystem {
    private List<Book> books;

    public LibraryManagementSystem() {
        books = new ArrayList<>();
    }

    // Method to add books to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Linear search for books by title
    public Book linearSearch(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Binary search for books by title (requires sorted list)
    public Book binarySearch(String title) {
        int left = 0;
        int right = books.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = books.get(mid).getTitle().compareToIgnoreCase(title);

            if (comparison == 0) {
                return books.get(mid);
            } else if (comparison < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    // Method to sort books by title (for binary search)
    public void sortBooks() {
        Collections.sort(books, Comparator.comparing(Book::getTitle));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LibraryManagementSystem library = new LibraryManagementSystem();

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Add Book");
            System.out.println("2. Search Book (Linear Search)");
            System.out.println("3. Search Book (Binary Search)");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Input for adding a new book
                    System.out.print("Enter Book ID: ");
                    String bookId = scanner.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.nextLine();

                    Book newBook = new Book(bookId, title, author);
                    library.addBook(newBook);
                    System.out.println("Book added successfully.");
                    break;
                case 2:
                    // Search for a book using linear search
                    System.out.print("Enter the title of the book to search (Linear Search): ");
                    String linearSearchTitle = scanner.nextLine();
                    Book foundLinearBook = library.linearSearch(linearSearchTitle);
                    if (foundLinearBook != null) {
                        System.out.println("Book found: " + foundLinearBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 3:
                    // Search for a book using binary search
                    library.sortBooks(); // Ensure the list is sorted before binary search
                    System.out.print("Enter the title of the book to search (Binary Search): ");
                    String binarySearchTitle = scanner.nextLine();
                    Book foundBinaryBook = library.binarySearch(binarySearchTitle);
                    if (foundBinaryBook != null) {
                        System.out.println("Book found: " + foundBinaryBook);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
