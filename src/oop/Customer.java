package oop;

public class Customer {
    private BillingInformation billingInformation;
    private ShoppingCart cart;

    public Customer(BillingInformation billingInformation, ShoppingCart cart) {
        this.billingInformation = billingInformation;
        this.cart = cart;
    }

    public BillingInformation getBillingInformation() {
        return billingInformation;
    }

    public ShoppingCart getCart() {
        return cart;
    }

    public void setBillingInformation(BillingInformation billingInformation) {
        this.billingInformation = billingInformation;
    }

    public void setCart(ShoppingCart cart) {
        this.cart = cart;
    }
}


