package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/11/18.
 */
public class GroceryTest {

    public Grocery setUpNewGroceryList() {
        return new Grocery("bananas", 5, 3);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
        Grocery.clearInstances();
    }

    @Test
    public void NewGroceryListInstanciatesCorrectly_true() throws Exception {
        Grocery grocery = new Grocery("bananas", 5, 3);
        assertEquals(true, grocery instanceof Grocery);

    }

    @Test
    public void item_getItem_item() throws Exception {
        Grocery testGrocery = setUpNewGroceryList();
        assertEquals("bananas", testGrocery.getItem());
    }

    @Test
    public void qty_getQty_qty() throws Exception {
        Grocery testGrocery = setUpNewGroceryList();
        assertEquals(5, testGrocery.getQuantity());
    }

    @Test
    public void price_getPrice_price() throws Exception {
        Grocery testGrocery = setUpNewGroceryList();
        assertEquals(4, testGrocery.getPrice(), 1);
    }

//    @Test
//    public void linePrice_testLinePrice() {
//        Grocery testGrocery = setUpNewGroceryList();
//        assertEquals(15, testGrocery.getLinePriceTotal(),1);
//    }

    @Test
    public void getTotal_getCostTotal_totalCost() {
//        ArrayList<Grocery> instances = new ArrayList<>();
        Grocery testGrocery = new Grocery("bananas", 5, 3);
        Grocery testSecondBeta = new Grocery("apples", 3, 2);

//        float allTotal = Grocery.getTotal();

        assertEquals(21, Grocery.getTotal(), 0);


//

        //assertEquals(18, Grocery.getTotal(),0);
    }

}