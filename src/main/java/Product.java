public class Product {
    protected int length;
    protected int id;
    protected String name;
    protected int price;

    protected Product() {
    }

    protected int getLength() {
        return length;
    }

    protected void setLength(int length) {
        this.length = length;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected int getPrice() {
        return price;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    protected Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }


}
