package models;
import java.util.ArrayList;

public class Grocery {

    private String item;
    private int quantity;
    private float price;

    public Grocery (String item, int quantity, float price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

}
