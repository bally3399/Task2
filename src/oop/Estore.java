package oop;

public class Estore {
    private Customer customer;
    private Seller seller;
    private Admin admin;
    public Estore(Customer customer, Seller seller, Admin admin) {
        this.customer = customer;
        this.seller = seller;
        this.admin = admin;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
