package oop4;

public class Product {
    private String productName;
    private double price;
    private int productId;
    private ProductCategory category;
    private  int counter;

    public Product(String productName, double price, int productId, ProductCategory category) {
        this.productName = productName;
        this.price = price;
        this.productId = productId;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }



    public String getProduct() {
        return productName;
    }

    public double getPrice() {
        return price;

    }
    public String getName(){
        return  productName;
    }
}