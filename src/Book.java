public class Book {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;

    public Book(String title, String author, int totalPages) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.currentPage = 0;
    }

    public void readPages(int pages) {
        currentPage += pages;

        if (currentPage > totalPages) {
            currentPage = totalPages;
        }

        System.out.println("You are on page " + currentPage + " out of " + totalPages);
    }

    public double getProgress() {
        return (double) currentPage / totalPages * 100;
    }

    public boolean isFinished() {
        return currentPage == totalPages;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    @Override
    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', totalPages=" + totalPages + ", currentPage=" + currentPage + "}";
    }
}