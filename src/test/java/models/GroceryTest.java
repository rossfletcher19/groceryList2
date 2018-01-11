package models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Guest on 1/11/18.
 */
public class GroceryTest {
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void NewGroceryListInstanciatesCorrectly_true() throws Exception {
        Grocery grocery = new Grocery("Item1");
        assertEquals(true, grocery instanceof Grocery);

    }

}