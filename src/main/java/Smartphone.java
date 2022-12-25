public class Smartphone extends Product {

    private String manufacturer;

    protected String getManufacturer() {
        return manufacturer;
    }

    protected void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    protected Smartphone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }
}
