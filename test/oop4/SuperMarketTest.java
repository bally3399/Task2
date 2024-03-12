package oop4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SuperMarketTest {
    @Test
    public void testThatSuperMarketIsEmpty(){
        SuperMarket superMarket = new SuperMarket();
        assertTrue(superMarket.isEmpty());
    }

    @Test
    public void testAddProduct() {
        SuperMarket superMarket = new SuperMarket();
        assertTrue(superMarket.isEmpty());

        Product product = new Product("Knife", 150, 1, ProductCategory.ELECTRONICS);
        superMarket.addProduct(product);
        assertEquals(1, superMarket.getProducts().size());
    }

    @Test
    public void addTwoProductTest(){
        SuperMarket superMarket = new SuperMarket();
        Product product = new Product("Generator",35_000, 1, ProductCategory.ELECTRONICS);
        Product product1 = new Product("cloth", 5_000, 2, ProductCategory.CLOTHING);
        superMarket.addProduct(product);
        superMarket.addProduct(product1);
        assertEquals(2, superMarket.getProducts().size());
    }
    @Test
    public void testRemoveProduct(){
        SuperMarket superMarket = new SuperMarket();
        Product product = new Product("Gown", 5_000, 1, ProductCategory.CLOTHING);
        superMarket.addProduct(product);
        superMarket.removeProduct(product);
        assertEquals(0, superMarket.getProducts().size());
    }

    @Test
    public void addTwoProduct_removeOne_remainOneProduct(){
        SuperMarket superMarket = new SuperMarket();
        Product product = new Product("Generator",35_000, 1, ProductCategory.ELECTRONICS);
        Product product1 = new Product("cloth", 5_000, 2, ProductCategory.CLOTHING);
        superMarket.addProduct(product);
        superMarket.addProduct(product1);
        superMarket.removeProduct(product);
        assertEquals(1, superMarket.getProducts().size());
    }
    @Test
    public void testGetProductByName() {
        SuperMarket superMarket = new SuperMarket();
        Product product = new Product("Orange", 50, 1, ProductCategory.GROCERIES);
        superMarket.addProduct(product);
        assertEquals(product, superMarket.getProductByName("Orange"));
    }
    @Test
    public void testProductExists() {
        SuperMarket superMarket = new SuperMarket();
        Product product = new Product("Pineapple", 4.0, 1, ProductCategory.GROCERIES);
        superMarket.addProduct(product);
        assertTrue(superMarket.productExists("Pineapple"));
    }
    @Test
    public void testThatProductDoNotExists(){
        SuperMarket superMarket = new SuperMarket();
        assertFalse(superMarket.productExists("Pineapple"));
    }
    @Test
    public void addCustomer(){
        SuperMarket superMarket = new SuperMarket();
        ShoppingCart cart = new ShoppingCart();
        Customer customer = new Customer("bally", 1, cart);
        superMarket.join(customer);
        assertEquals(1,superMarket.getCustomer().size());
    }
    @Test
    public void testForTwoCustomerInTheSuperMarket(){
        SuperMarket superMarket = new SuperMarket();
        ShoppingCart cart = new ShoppingCart();
        ShoppingCart cart1 = new ShoppingCart();
        Customer customer = new Customer("bally", 1, cart);
        Customer customer1 = new Customer("bim bim", 1, cart1);
        superMarket.join(customer);
        superMarket.join(customer1);
        assertEquals(2, superMarket.getCustomer().size());

    }
    @Test
    public void testForTwoCustomer_OneLeft_remainCustomerInTheSuperMarket(){
        SuperMarket superMarket = new SuperMarket();
        ShoppingCart cart = new ShoppingCart();
        ShoppingCart cart1 = new ShoppingCart();
        Customer customer = new Customer("bally", 1, cart);
        Customer customer1 = new Customer("bim bim", 2, cart1);
        superMarket.join(customer);
        superMarket.join(customer1);
        superMarket.left(customer1);
        assertEquals(1, superMarket.getCustomer().size());
    }

}
