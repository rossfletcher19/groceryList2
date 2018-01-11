package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    }

    @Test
    public void NewGroceryListInstanciatesCorrectly_true() throws Exception {
        Grocery grocery = new Grocery("bananas", 5, 3);
        assertEquals(true, grocery instanceof Grocery);

    }

    @Test
    public void item_getsItem_item() throws Exception {
        Grocery testGrocery = setUpNewGroceryList();
        assertEquals("bananas", testGrocery.getItem());
    }

    @Test
    public void item_getsQty_qty() throws Exception {
        Grocery testGrocery = setUpNewGroceryList();
        assertEquals(5, testGrocery.getQuantity());
    }

}