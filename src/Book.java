public class Book {
    private String title;
    private String author;
    private int totalPages;
    private int currentPage;

    public void readPages(int pages) {
        currentPage += pages;

        if (currentPage > totalPages) {
            currentPage = totalPages;
        }

        System.out.println("You are on page " + currentPage + " out of " + totalPages);
    }

}
