package accessoriesTest;

import accessories.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void setUp(){
        sheetMusic = new SheetMusic("100 Great Songs", 20, 7.50);
    }

    @Test
    public void canGetName(){
        assertEquals("100 Great Songs", sheetMusic.getName());
    }

    @Test
    public void canSetName(){
        sheetMusic.setName("Classical Hits");
        assertEquals("Classical Hits", sheetMusic.getName());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(20, sheetMusic.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetSellingPrice(){
        sheetMusic.setSellingPrice(15);
        assertEquals(15, sheetMusic.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetPurchasedPrice(){
        assertEquals(7.50, sheetMusic.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canSetPurchasedPrice(){
        sheetMusic.setPurchasedPrice(10);
        assertEquals(10, sheetMusic.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canGetCalculateMarkup(){
        assertEquals(12.50, sheetMusic.calculateMarkup(), 0.00);
    }
}
