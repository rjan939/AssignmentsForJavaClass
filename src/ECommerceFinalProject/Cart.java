package ECommerceFinalProject;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Book> books;

    public Cart() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book titleOfBook) {
        books.add(titleOfBook);
    }

    public double getTotal() {
        double total = 0;
        for (Book book : books) {
            total += book.cost;
        }
        return total;
    }



}
