package models;
import java.util.ArrayList;
import java.util.List;

public class Grocery {

    private String item;
    private int quantity;
    private float price;
    private static ArrayList<Grocery> instances = new ArrayList<>();

    public Grocery (String item, int quantity, float price) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
        instances.add(this);
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

//    public float getLinePrice() {
//        return quantity * price;
//    }

//    public static float getLinePriceTotal() {
//        float linePrice = quantity * price;
//        return linePrice;
//    }

    public static float getTotal() {
        float linePriceTotal = 0;
        for (int i = 0; i < instances.size(); i++) {
            Grocery currentGrocery = instances.get(i);
            linePriceTotal += currentGrocery.getPrice() * currentGrocery.getQuantity();

//            linePriceTotal += instances.get(i).getLinePriceTotal();
        }
        return linePriceTotal;
    }

    public static void clearInstances() {
        instances.clear();
    }

    public static ArrayList<Grocery> getAll() {
        return instances;
    }
}
