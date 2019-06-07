package instrumentTests;

import instruments.Family;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    private Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Steinway", 100000, 60000, Family.KEYBOARD, "Maple", "Grand");
    }

    @Test
    public void canGetName(){
        assertEquals("Steinway", piano.getName());
    }

    @Test
    public void canSetName(){
        piano.setName("Baby Grand");
        assertEquals("Baby Grand", piano.getName());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(100000, piano.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetSellingPrice(){
        piano.setSellingPrice(200000);
        assertEquals(200000, piano.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetPurchasedPrice(){
        assertEquals(60000, piano.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canSetPurchasedPrice(){
        piano.setPurchasedPrice(3500);
        assertEquals(3500, piano.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canGetInstrumentFamily(){
        assertEquals(Family.KEYBOARD, piano.getFamily());
    }

    @Test
    public void canSetInstrumentFamily(){
        piano.setFamily(Family.PERCUSSION);
        assertEquals(Family.PERCUSSION, piano.getFamily());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Maple", piano.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        piano.setMaterial("Beech");
        assertEquals("Beech", piano.getMaterial());
    }

    @Test
    public void canGetType(){
        assertEquals("Grand", piano.getType());
    }

    @Test
    public void canSetType(){
        piano.setType("Upright");
        assertEquals("Upright", piano.getType());
    }


}
