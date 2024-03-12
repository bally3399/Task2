package oop3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ShoppingCartTest {
    @Test
    public void testThatCartIsEmpty(){
        ShoppingCart cart = new ShoppingCart();
        assertTrue(cart.isEmpty());
    }

    @Test
    public void testThatICanAddProductToMyCart(){
        ShoppingCart cart = new ShoppingCart();
        assertTrue(cart.isEmpty());
        Product product = new Product(1, "rice", 55.0, "food", ProductCategory.GROCERIES);
        Item item = new Item(2, product);
        cart.add(item);
        assertEquals(1, cart.getItems().size());

    }
    @Test
    public void testThatICanAddTwoProductToMyCart(){
        ShoppingCart cart = new ShoppingCart();
        assertTrue(cart.isEmpty());
        Product product = new Product(1,"rice", 55.0, "food", ProductCategory.GROCERIES);
        Product product1 = new Product(1, "beans", 1000, "Food", ProductCategory.GROCERIES);
        Item item = new Item(2,product);
        Item item1 = new Item(2, product1);
        cart.add(item);
        cart.add(item1);
        assertEquals(2, cart.getItems().size());

    }

    @Test
    public void testThatICanRemoveProductFromMyCart(){
        ShoppingCart cart = new ShoppingCart();
        assertTrue(cart.isEmpty());
        Product product = new Product(1, "beans",22.45, "food", ProductCategory.GROCERIES);
        Item item = new Item(2, product);
        cart.add(item);
        cart.remove(item);
        assertTrue(cart.isEmpty());
        assertEquals(0, cart.getItems().size());
    }
    @Test
    public void addTwoProduct_removeOne_remainsOne(){
        ShoppingCart cart = new ShoppingCart();
        assertTrue(cart.isEmpty());

        Product product = new Product(1, "rice", 1500, "food", ProductCategory.GROCERIES);
        Product product1 = new Product(1,  "beans", 1500, "food", ProductCategory.GROCERIES);
        Item item = new Item(1, product);
        Item item1 = new Item(1, product1);
        cart.add(item);
        cart.add(item1);
        cart.remove(item);
        assertEquals(1,cart.getItems().size());
    }
    @Test
    public void testCalculateTotalWithEmptyCart() {
        ShoppingCart cart = new ShoppingCart();
        assertEquals(0.0, cart.calculateTotal());
    }

    /*@Test
    public void testCalculateTotalWithSingleProduct() {
        oop4.ShoppingCart cart = new oop4.ShoppingCart();
        oop4.Product product = new oop4.Product("cloth", 10.0, 1, oop4.ProductCategory.CLOTHING);
        oop4.Item item = new oop4.Item(1, product);
        cart.add(item);
        cart.calculateTotal();

        assertEquals(10.0, cart.calculateTotal());
    }

    @Test
    public void testCalculateTotalWithMultipleProducts() {
        oop4.Product product1 = new oop4.Product("Bulb", 10.0, 1, oop4.ProductCategory.ELECTRONICS);
        oop4.Product product2 = new oop4.Product("Knife", 15.0, 1, oop4.ProductCategory.UTENSILS);
        oop4.Product product3 = new Product("Generator", 35_000, 1, ProductCategory.ELECTRONICS);
        oop4.ShoppingCart cart = new ShoppingCart();
        oop4.Item item = new oop4.Item(1, product1);
        oop4.Item item1 = new oop4.Item(2, product2);
        oop4.Item item2 = new Item(1, product3);
        cart.add(item);
        cart.add(item1);
        cart.add(item2);

        assertEquals(45.0, cart.calculateTotal());
    }*/




}
