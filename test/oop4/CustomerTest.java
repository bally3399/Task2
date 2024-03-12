package oop4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerTest {
    @Test
    public void testConstructor(){
        ShoppingCart cart = new ShoppingCart();
        Customer customer = new Customer("Bally", 1, cart);
        assertEquals("Bally", customer.getName());
        assertEquals(1, customer.getId());
        assertEquals(cart, customer.getCart());
    }


}

