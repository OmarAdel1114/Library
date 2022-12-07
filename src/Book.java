public class Book {
    private String bookName = "Omar";
    private String author;
    private int bookID;
    private int quantity;
    private double price;
    private String edition;
    private String publisher;

    public Book (String bookName, String author, int bookID, int quantity, double price,
                 String edition, String publisher)
    {
        this.bookName = bookName;
        this.author = author;
        this.bookID = bookID;
        this.quantity = quantity;
        this.price = price;
        this.edition = edition;
        this.publisher = publisher;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}
