package lab8;

import java.util.ArrayList;

public class Member {

    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    void borrowBook(Book b) {

        if (borrowedBooks.size() >= 3) {
            System.out.println(name + " has reached the borrow limit.");
            return;
        }

        if (b.isAvailable()) {
            b.checkOut();
            borrowedBooks.add(b);
        } else {
            System.out.println(b.getTitle() + " is not available.");
        }
    }

    void returnBook(Book b) {
        b.returnBook();
        borrowedBooks.remove(b);
    }

    void listBorrowedBooks() {

        if (borrowedBooks.isEmpty()) {
            System.out.println(name + " has no borrowed books.");
        } else {
            System.out.println(name + "'s borrowed books:");

            for (Book b : borrowedBooks) {
                System.out.println(" - " + b.getTitle());
            }
        }
    }
}