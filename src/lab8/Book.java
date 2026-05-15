package lab8;

public class Book {

    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    String getDetails() {
        return title + " by " + author + " | ISBN: " + isbn +
                " | Available: " + isAvailable;
    }

    void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println(title + " has been checked out.");
        } else {
            System.out.println(title + " is already checked out.");
        }
    }

    void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }
}