package accessoriesTest;

import accessories.DrumSticks;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrumStickTest {

    private DrumSticks drumSticks;

    @Before
    public void setUp(){
        drumSticks = new DrumSticks("Basic", 10, 5);
    }

    @Test
    public void canGetName(){
        assertEquals("Basic", drumSticks.getName());
    }

    @Test
    public void canSetName(){
        drumSticks.setName("Fancy");
        assertEquals("Fancy", drumSticks.getName());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(10, drumSticks.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetSellingPrice(){
        drumSticks.setSellingPrice(15);
        assertEquals(15, drumSticks.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetPurchasedPrice(){
        assertEquals(5, drumSticks.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canSetPurchasedPrice(){
        drumSticks.setPurchasedPrice(10);
        assertEquals(10, drumSticks.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canGetCalculateMarkup(){
        assertEquals(5, drumSticks.calculateMarkup(), 0.00);
    }
}
