package ECommerceFinalProject;

public class ECommerceStarter {
    public static void main(String[] argv) {
        Book javaBook = new Book("ISBN0001", "How to program in Java", "John Doe"
                , 24.5, "Educational", new String[] {"Good book", "Verbose"});
        javaBook.printBookDetails();

        Book cPlusPlusBook = new Book("ISBN0002", "How to program in c++"
                , "Sally Smith", 19.9, "Educational",
                new String[]{"Good book", "Verbose"});
        cPlusPlusBook.printBookDetails();

        Book cBook = new Book("ISBN9780131101630, The C Programming Language, " +
                "Brian Kernighan and Dennis Ritchie, 24");
        cBook.printBookDetails();


    }
}
