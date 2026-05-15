package lab8;

public class Main {

    public static void main(String[] args) {

        Book b1 = new Book("1984", "George Orwell", "111");
        Book b2 = new Book("The Hobbit", "J.R.R Tolkien", "222");
        Book b3 = new Book("Dune", "Frank Herbert", "333");
        Book b4 = new Book("Dracula", "Bram Stoker", "444");

        Member m1 = new Member("Steve", "M001");

        m1.borrowBook(b1);
        m1.borrowBook(b2);
        m1.borrowBook(b3);

        m1.borrowBook(b4);

        m1.listBorrowedBooks();

        m1.returnBook(b2);

        m1.listBorrowedBooks();

        System.out.println(b1.getDetails());
    }
}