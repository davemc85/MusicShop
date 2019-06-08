package accessoriesTest;

import accessories.GuitarString;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarStringTest {

    private GuitarString guitarString;

    @Before
    public void setUp(){
        guitarString = new GuitarString("Silly String", 30, 10);
    }

    @Test
    public void canGetName(){
        assertEquals("Silly String", guitarString.getName());
    }

    @Test
    public void canSetName(){
        guitarString.setName("Basic");
        assertEquals("Basic", guitarString.getName());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(30, guitarString.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetSellingPrice(){
        guitarString.setSellingPrice(15);
        assertEquals(15, guitarString.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetPurchasedPrice(){
        assertEquals(10, guitarString.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canSetPurchasedPrice(){
        guitarString.setPurchasedPrice(15);
        assertEquals(15, guitarString.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canGetCalculateMarkup(){
        assertEquals(20, guitarString.calculateMarkup(), 0.00);
    }
}
