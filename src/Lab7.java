public class Lab7 {
    public static void main(String[] args) {

        // Task 1 - Book
        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 310);
        Book book2 = new Book("1984", "George Orwell", 328);

        book1.readPages(50);
        book2.readPages(100);

        System.out.println("Book 1 progress: " + book1.getProgress() + "%");
        System.out.println(book1.toString());

        System.out.println("Book 2 progress: " + book2.getProgress() + "%");
        System.out.println(book2.toString());

        book1.readPages(260);
        System.out.println("Book 1 finished? " + book1.isFinished());

        System.out.println();

        // Task 2 - Movie
        Movie movie1 = new Movie("Inception");
        Movie movie2 = new Movie("Interstellar");

        movie1.addRating(5);
        movie1.addRating(4);
        movie1.addRating(6);

        movie2.addRating(3);
        movie2.addRating(5);
        movie2.addRating(2);

        System.out.println(movie1.getTitle() + " average rating: " + movie1.getAverageRating());
        System.out.println(movie1.getTitle() + " highest rating: " + movie1.getHighestRating());

        System.out.println(movie2.getTitle() + " average rating: " + movie2.getAverageRating());
        System.out.println(movie2.getTitle() + " highest rating: " + movie2.getHighestRating());
    }
}