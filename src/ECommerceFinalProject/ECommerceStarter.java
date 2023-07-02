package ECommerceFinalProject;

public class ECommerceStarter {
    public static void main(String[] argv) {
        Book javaBook = new Book("ISBN0001", "How to program in Java"
                , 24.5, "Educational", new String[] {"Good book", "Verbose"}, "John Doe", "", "", "", "", "", "", "", "", "");
        javaBook.printBookDetails();

        /*Book cPlusPlusBook = new Book("ISBN0002", "How to program in c++"
                , new ArrayList(Arrays.asList("Sally Smith")), 19.9, "Educational",
                new String[]{"Good book", "Verbose"});
        cPlusPlusBook.printBookDetails();

        Book cBook = new Book("ISBN9780131101630, The C Programming Language, " +
                "Brian Kernighan and Dennis Ritchie, 24");
        cBook.printBookDetails();
        */
        Cart myCart = new Cart();
        myCart.addBook(javaBook);
        //myCart.addBook(cPlusPlusBook);
        //myCart.addBook();

        double cartTotal = myCart.getTotal();

        System.out.println("Cart Total: " + cartTotal);

    }
}
