package instrumentTests;

import instruments.Family;
import instruments.Saxophone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SaxophoneTest {

    private Saxophone saxophone;

    @Before
    public void setUp(){
        saxophone = new Saxophone("Yamaha", 749, 450, Family.WOODWIND, "Brass", true);
    }


    @Test
    public void canGetName(){
        assertEquals("Yamaha", saxophone.getName());
    }

    @Test
    public void canSetName(){
        saxophone.setName("Mendini");
        assertEquals("Mendini", saxophone.getName());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(749, saxophone.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetSellingPrice(){
        saxophone.setSellingPrice(1000);
        assertEquals(1000, saxophone.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetPurchasedPrice(){
        assertEquals(450, saxophone.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canSetPurchasedPrice(){
        saxophone.setPurchasedPrice(350);
        assertEquals(350, saxophone.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canGetInstrumentFamily(){
        assertEquals(Family.WOODWIND, saxophone.getFamily());
    }

    @Test
    public void canSetInstrumentFamily(){
        saxophone.setFamily(Family.BRASS);
        assertEquals(Family.BRASS, saxophone.getFamily());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        saxophone.setMaterial("Copper");
        assertEquals("Copper", saxophone.getMaterial());
    }
}
