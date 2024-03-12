package oop4;

public class Customer {
    private String name;
    private int id;
    private ShoppingCart cart;

    public Customer(String name, int id, ShoppingCart cart) {
        this.name = name;
        this.id = id;
        this.cart = cart;
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public ShoppingCart getCart() {
        return cart;
    }
}
