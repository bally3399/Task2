package oop4;

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
        Product product = new Product("rice", 55.0, 1, ProductCategory.GROCERIES);
        Item item = new Item(2, product);
        cart.add(item);
        assertEquals(1, cart.getItems().size());

    }
    @Test
    public void testThatICanAddTwoProductToMyCart(){
        ShoppingCart cart = new ShoppingCart();
        assertTrue(cart.isEmpty());
        Product product = new Product("rice", 55.0, 1, ProductCategory.GROCERIES);
        Product product1 = new Product("beans", 1000, 2, ProductCategory.GROCERIES);
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
        Product product = new Product("rice", 22.45, 1, ProductCategory.GROCERIES);
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

        Product product = new Product("rice", 1500, 1, ProductCategory.GROCERIES);
        Product product1 = new Product("beans", 1000, 2, ProductCategory.GROCERIES);
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

    @Test
    public void testCalculateTotalWithSingleProduct() {
        ShoppingCart cart = new ShoppingCart();
        Product product = new Product("cloth", 10.0, 1, ProductCategory.CLOTHING);
        Item item = new Item(1, product);
        cart.add(item);
        cart.calculateTotal();

        assertEquals(10.0, cart.calculateTotal());
    }

    @Test
    public void testCalculateTotalWithMultipleProducts() {
        Product product1 = new Product("Bulb", 10.0, 1, ProductCategory.ELECTRONICS);
        Product product2 = new Product("Knife", 15.0, 1, ProductCategory.UTENSILS);
        Product product3 = new Product("Generator", 35_000, 1, ProductCategory.ELECTRONICS);
        ShoppingCart cart = new ShoppingCart();
        Item item = new Item(1, product1);
        Item item1 = new Item(2, product2);
        Item item2 = new Item(1, product3);
        cart.add(item);
        cart.add(item1);
        cart.add(item2);

        assertEquals(45.0, cart.calculateTotal());
    }


}
