package ECommerceFinalProject;

public class Book {
    private String ISBN;
    private String title;
    private String author;
    private double cost;
    private String category;
    private String[] reviews;
    public Book(String isbnInput, String titleInput, String authorInput, double costInput,
                String categoryInput, String[] reviewsInput) {
        this.ISBN = isbnInput;
        this.title = titleInput;
        this.author = authorInput;
        this.cost = costInput;
        this.category = categoryInput;
        this.reviews = reviewsInput;
    }

    public Book(String commaSeparatedLine) {
        String[] informationAboutBook = commaSeparatedLine.split(", ");
        this.ISBN = informationAboutBook[0];
        this.title = informationAboutBook[1];
        this.author = informationAboutBook[2];
        this.cost = Double.parseDouble(informationAboutBook[3]);
    }

    public void printBookDetails() {
        System.out.println("ISBN Number: " + ISBN + ", Title: " + title + ", Author(s): " + author
                + ", Cost: " + cost + ", Category: " + category);
        System.out.println("***********REVIEWS***********");
        for (String review : reviews) {
            System.out.println(review);
        }
    }

}
