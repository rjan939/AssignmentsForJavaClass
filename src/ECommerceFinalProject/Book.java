package ECommerceFinalProject;
import java.util.ArrayList;


public class Book {
    private ArrayList<String> authors;
    public String ISBN;
    public String title;
    public double cost;
    public String category;
    public String[] reviews;
    public Book(String isbnInput, String titleInput, double costInput,
                String categoryInput, String[] reviewsInput, String authorInputOne,
                String authorInputTwo, String authorInputThree, String authorInputFour,
                String authorInputFive, String authorInputSix, String authorInputSeven, String authorInputEight,
                String authorInputNine, String authorInputTen) {
        this.authors = new ArrayList<>();
        this.ISBN = isbnInput;
        this.title = titleInput;
        this.cost = costInput;
        this.category = categoryInput;
        this.reviews = reviewsInput;
        authors.add(authorInputOne);
        authors.add(authorInputTwo);
        authors.add(authorInputThree);
        authors.add(authorInputFour);
        authors.add(authorInputFive);
        authors.add(authorInputSix);
        authors.add(authorInputSeven);
        authors.add(authorInputEight);
        authors.add(authorInputNine);
        authors.add(authorInputTen);
    }

    public Book(String commaSeparatedLine) {
        authors = new ArrayList<>();
        String[] informationAboutBook = commaSeparatedLine.split(", ");
        this.ISBN = informationAboutBook[0];
        this.title = informationAboutBook[1];
        //this.authors = informationAboutBook[2];
        this.cost = Double.parseDouble(informationAboutBook[3]);

    }

    public void printBookDetails() {
        System.out.println("ISBN Number: " + ISBN + ", Title: " + title
                + ", Cost: " + cost + ", Category: " + category);
        for (String current : authors) {
            if (!current.equals("")) {
                System.out.println("Author: " + current);
            }
        }
        System.out.println("***********REVIEWS***********");
        for (String review : reviews) {
            System.out.println(review);
        }
    }

}
