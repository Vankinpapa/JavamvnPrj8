public class Book extends Product {
    private String author;

    protected String getAuthor() {
        return author;
    }

    protected void setAuthor(String author) {
        this.author = author;
    }

    protected Book(int id, String name, int price, String author) {
        super(id, name, price);
        this.author = author;
    }
}

