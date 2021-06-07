package orderSystem;
import java.util.ArrayList;

public class Order {
    private String product;
    private double price;
    private String buyer;
    private int quantity;
    private double orderID = Math.random();

    public String getProduct(){return this.product;}
    public double getPrice(){return this.price;}
    public String getBuyer(){return this.buyer;}
    public int getQuantity(){return this.quantity;}
    public double getOrderID(){return this.orderID;}
    
    public Order(String product, double price, String buyer, int quantity){
        this.product = product;
        this.price = price;
        this.buyer = buyer;
        this.quantity = quantity;
    }
}
