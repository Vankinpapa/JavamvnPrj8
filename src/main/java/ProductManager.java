public class ProductManager {
    protected ProductRepository repository;

    protected ProductManager(ProductRepository repository) {
        this.repository = repository;
    }

    Product product1 = new Book(1, "Book", 399, "Pushkin");
    Product product2 = new Book(11, "Book2", 359, "Pushkin");
    Product product3 = new Smartphone(12, "Phone 1", 9999, "Nokia");
    Product product4 = new Smartphone(32, "Phone 2", 8999, "Nokia");
    Product product5 = new Product(23, "Ball", 599);
    Product product6 = new Product(44, "Ball", 499);

    public void add(Product product) {
        repository.saveProduct(product);
    }

    public Product[] searchBy(String text) {
        Product[] result = new Product[0];
        for (Product product : repository.findProducts()) {
            if (matches(product, text)) {
                Product[] tmp = new Product[result.length + 1];
                for (int i = 0; i < result.length; i++) {
                    tmp[i] = result[i];
                }
                tmp[tmp.length - 1] = product;
                result = tmp;
            }
        }
        return result;
    }

    public boolean matches(Product product, String search) {
        if (product.getName().contains(search)) {
            return true;
        } else {
            return false;
        }
    }
}
