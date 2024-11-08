public class Book {
    private int bookNumber;
    private double bookPrice;
    private String bookTitle;
    private String bookAuthor;

    // Setter methods for the Book
    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public void setBookPrice(double bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    // Getter methods for the Book
    public int getBookNumber() {
        return bookNumber;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    // Method to print all book details
    public void printBookDetails() {
        System.out.println("Book Number: " + getBookNumber());
        System.out.println("Book Title: " + getBookTitle());
        System.out.println("Book Author: " + getBookAuthor());
        System.out.println("Book Price: " + getBookPrice()+" Php");
    }
}

