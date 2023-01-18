import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductRepositoryTest {

    @Test

    public void testRemoveProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Product product1 = new Book(1, "Book", 399, "Pushkin");
        Product product2 = new Book(11, "Book2", 359, "Pushkin");
        Product product3 = new Smartphone(12, "Phone 1", 9999, "Nokia");
        Product product4 = new Smartphone(32, "Phone 2", 8999, "Nokia");
        Product product5 = new Product(23, "Ball", 599);
        Product product6 = new Product(44, "Ball", 499);

        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);
        manager.add(product5);
        manager.add(product6);
        manager.repository.removeProductById(32);
        manager.repository.removeProductById(1);
        manager.repository.removeProductById(44);

        Product[] actual = manager.repository.findProducts();
        Product[] expected = {product2, product3, product5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemoveProductWithException() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Product product1 = new Book(1, "Book", 399, "Pushkin");
        Product product2 = new Book(11, "Book2", 359, "Pushkin");
        Product product3 = new Smartphone(12, "Phone 1", 9999, "Nokia");
        Product product4 = new Smartphone(32, "Phone 2", 8999, "Nokia");
        Product product5 = new Product(23, "Ball", 599);
        Product product6 = new Product(44, "Ball", 499);

        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);
        manager.add(product5);
        manager.add(product6);

        Assertions.assertThrows(NotFoundException.class,
                () -> manager.repository.removeProductById(88));

    }

}