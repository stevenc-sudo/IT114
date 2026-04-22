public class Movie {
    private String title;
    private int[] ratings;
    private int ratingCount;

    public Movie(String title) {
        this.title = title;
        this.ratings = new int[10];
        this.ratingCount = 0;
    }

    public void addRating(int rating) {
        if (rating < 1 || rating > 5) {
            System.out.println("Invalid rating. Please enter a rating between 1 and 5.");
            return;
        }

        if (ratingCount >= ratings.length) {
            System.out.println("Cannot add more ratings. The rating list is full.");
            return;
        }

        ratings[ratingCount] = rating;
        ratingCount++;
        System.out.println("Added rating " + rating + " for " + title);
    }

    public double getAverageRating() {
        if (ratingCount == 0) {
            return 0.0;
        }

        int sum = 0;
        for (int i = 0; i < ratingCount; i++) {
            sum += ratings[i];
        }

        return (double) sum / ratingCount;
    }

    public int getHighestRating() {
        if (ratingCount == 0) {
            return 0;
        }

        int highest = ratings[0];
        for (int i = 1; i < ratingCount; i++) {
            if (ratings[i] > highest) {
                highest = ratings[i];
            }
        }

        return highest;
    }

    public String getTitle() {
        return title;
    }

    public int getRatingCount() {
        return ratingCount;
    }
}