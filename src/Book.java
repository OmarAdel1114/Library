public class Book {
    private String book_name = "Omar";
    private String book_author;
    private int bookID;
    private int book_quant;
    private double book_price;
    private String book_edition;
    private String book_publisher;

    public Book() {
    }

    public Book (String book_name, String book_author, int bookID, int book_quant, double book_price,
                 String book_edition, String book_publisher)
    {
        this.book_name = book_name;
        this.book_author = book_author;
        this.bookID = bookID;
        this.book_quant = book_quant;
        this.book_price = book_price;
        this.book_edition = book_edition;
        this.book_publisher = book_publisher;
    }

    public String getBookName() {
        return book_name;
    }

    public void setBookName(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return book_author;
    }

    public void setAuthor(String book_author) {
        this.book_author = book_author;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public int getQuantity() {
        return book_quant;
    }

    public void setQuantity(int book_quant) {
        this.book_quant = book_quant;
    }

    public double getPrice() {
        return book_price;
    }

    public void setPrice(double book_price) {
        this.book_price = book_price;
    }

    public String getEdition() {
        return book_edition;
    }

    public void setEdition(String book_edition) {
        this.book_edition = book_edition;
    }

    public String getPublisher() {
        return book_publisher;
    }

    public void setPublisher(String book_publisher) {
        this.book_publisher = book_publisher;
    }
}
