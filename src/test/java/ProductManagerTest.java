import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

//Вау, данные забыл удалить! =))

class ProductManagerTest {

    @Test

    public void testSearchProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        //Вау, данные забыл удалить! =)) Спасибо!!!

        Product product1 = new Book(1, "Book", 399, "Pushkin");
        Product product2 = new Book(11, "Book2", 359, "Pushkin");
        Product product3 = new Smartphone(12, "Phone 1", 9999, "Nokia");
        Product product4 = new Smartphone(32, "Phone 2", 8999, "Nokia");
        Product product5 = new Product(23, "Ball", 599);
        Product product6 = new Product(44, "Ball", 499);

        manager.add(product1);
        manager.add(product3);
        manager.add(product4);
        manager.add(product5);

        Product[] actual = manager.searchBy("Phone");
        Product[] expected = {product3, product4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testSearchWithClarificationProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Product product1 = new Book(1, "Book", 399, "Pushkin");
        Product product2 = new Book(11, "Book2", 359, "Pushkin");
        Product product3 = new Smartphone(12, "Phone 1", 9999, "Nokia");
        Product product4 = new Smartphone(32, "Phone 2", 8999, "Nokia");
        Product product5 = new Product(23, "Ball", 599);
        Product product6 = new Product(44, "Ball", 499);

        manager.add(product1);
        manager.add(product3);
        manager.add(product4);
        manager.add(product5);

        Product[] actual = manager.searchBy("Phone 1");
        Product[] expected = {product3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testSearchAbsenceProduct() {
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
        manager.add(product5);

        Product[] actual = manager.searchBy("Phone");
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testAbsenceProduct() {
        ProductRepository repo = new ProductRepository();
        ProductManager manager = new ProductManager(repo);

        Product product1 = new Book(1, "Book", 399, "Pushkin");
        Product product2 = new Book(11, "Book2", 359, "Pushkin");
        Product product3 = new Smartphone(12, "Phone 1", 9999, "Nokia");
        Product product4 = new Smartphone(32, "Phone 2", 8999, "Nokia");
        Product product5 = new Product(23, "Ball", 599);
        Product product6 = new Product(44, "Ball", 499);

        Product[] actual = manager.repository.findProducts();
        Product[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void testAddProduct() {
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

        Product[] actual = manager.repository.findProducts();
        Product[] expected = {product1, product2, product3};

        Assertions.assertArrayEquals(expected, actual);
    }
}