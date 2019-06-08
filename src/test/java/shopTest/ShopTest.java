package shopTest;

import accessories.DrumSticks;
import accessories.GuitarString;
import accessories.SheetMusic;
import instruments.*;
import org.junit.Before;
import org.junit.Test;
import shop.Shop;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    private Shop shop;
    private Guitar guitar;
    private DrumKit drumKit;
    private Piano piano;
    private Saxophone saxophone;
    private DrumSticks drumSticks;
    private GuitarString guitarString;
    private SheetMusic sheetMusic;

    @Before
    public void setUp(){
        guitar = new Guitar("Gibson", 3000, 2000, Family.STRING, "Mahogany", "Electric");
        drumKit = new DrumKit("Pearl", 1500, 850, Family.PERCUSSION, "Mahogany", 5 );
        piano = new Piano("Steinway", 100000, 60000, Family.KEYBOARD, "Maple", "Grand");
        saxophone = new Saxophone("Yamaha", 750, 450, Family.WOODWIND, "Brass", true);
        drumSticks = new DrumSticks("Basic", 10, 5);
        guitarString = new GuitarString("Silly String", 30, 10);
        sheetMusic = new SheetMusic("100 Great Songs", 20, 7.50);
        shop = new Shop("Davids Music Emporium");
    }

    @Test
    public void hasName() {
        assertEquals("Davids Music Emporium", shop.getName());
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, shop.stockItemCount());
    }

    @Test
    public void canAddInstrumentStock(){
        shop.addStock(piano);
        assertEquals(1, shop.stockItemCount());
    }

    @Test
    public void canAddAccessoryStock(){
        shop.addStock(guitarString);
        assertEquals(1, shop.stockItemCount());
    }

    @Test
    public void canRemoveStock(){
        shop.addStock(guitar);
        shop.addStock(saxophone);
        shop.sellStock(guitar);
        assertEquals(1, shop.stockItemCount());
    }

    @Test
    public void canOnlyRemoveStockWhichIsInStock(){
        shop.addStock(guitar);
        shop.addStock(saxophone);
        shop.sellStock(piano);
        assertEquals(2, shop.stockItemCount());
    }

    @Test
    public void canCalculateProfit(){
        shop.addStock(guitar);
        shop.addStock(drumKit);
        assertEquals(1650, shop.calcuateProfit(), 0.00);
    }

    @Test
    public void CalculateTotalAvailableProfit(){
        shop.addStock(guitar);
        shop.addStock(drumKit);
        shop.addStock(piano);
        shop.addStock(saxophone);
        shop.addStock(drumSticks);
        shop.addStock(sheetMusic);
        shop.addStock(guitarString);
        assertEquals(41987.50, shop.calcuateProfit(), 0.00);
    }
}
