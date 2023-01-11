public class ProductRepository {

    protected Product[] products = new Product[0];

    protected ProductRepository() {

    }

    public void saveProduct(Product product) {
        Product[] tmp = new Product[products.length + 1];
        for (int i = 0; i < products.length; i++) {
            tmp[i] = products[i];
        }
        tmp[tmp.length - 1] = product;
        products = tmp;
    }

    public void removeProductById(int removeId) {
        if (findById(removeId) == null) {
            throw new NotFoundException(removeId);
        }
        Product[] tmp = new Product[products.length - 1];
        int index = 0;
        for (Product product : products) {
            if (product.getId() != removeId) {
                tmp[index] = product;
                index++;
            }
        }
        products = tmp;
    }

    public Product findById(int id) {
        for (Product product : products) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public Product[] findProducts() {
        return products;
    }
}
