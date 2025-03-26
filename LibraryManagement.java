import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public boolean isTitleMatch(String searchTitle) {
        return this.title.equalsIgnoreCase(searchTitle);
    }

    public void displayDetails() {
        System.out.println("\nBook Found:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Rupees " + price);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[4];
        books[0] = new Book("RD Sharma", "RD", 780);
        books[1] = new Book("PremChand ki kahani", "Premchand", 120);
        books[2] = new Book("Two men in a boat", "Unknown", 350);
        books[3] = new Book("Let us C", "Yashvanth Kanethkar", 699);
        System.out.print("Enter the book title to search: ");
        String searchTitle = scanner.nextLine();
        boolean found = false;
        for (Book book : books) {
            if (book.isTitleMatch(searchTitle)) {
                book.displayDetails();
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found in the library.");
        }

        scanner.close();
    }
}
