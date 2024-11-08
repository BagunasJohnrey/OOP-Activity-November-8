public class EncapsulationSample {

    public static void main(String[] args) {

        Book book = new Book();

        book.setBookNumber(1);
        book.setBookTitle("It Ends With Us");
        book.setBookAuthor("Colleen Hoover");
        book.setBookPrice(500.00); // Using float value

        // Print book details
        book.printBookDetails();
    }
}