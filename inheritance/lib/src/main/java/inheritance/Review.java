package inheritance;

public class Review {

    private String author;
    private String body;
    private int rating;

    public Review(String author, String body, int rating) {
        this.author = author;
        this.body = body;
        this.rating = rating;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Review{Author: " + author + ", Body: " + body + ", Rating: " + rating + "}";
    }
}