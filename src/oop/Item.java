package oop;

public class Item {
    private int quantityOfProduct;
    private final Product product;

    public Item(int quantityOfProduct, Product product) {
        this.quantityOfProduct = quantityOfProduct;
        this.product = product;
    }
    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    public Product getProduct() {
        return product;
    }

}
