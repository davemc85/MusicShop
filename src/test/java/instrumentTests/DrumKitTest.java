package instrumentTests;

import instruments.DrumKit;
import instruments.Family;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DrumKitTest {

    private DrumKit drumKit;

    @Before
    public void setUp(){
        drumKit = new DrumKit("Pearl", 1500, 850, Family.PERCUSSION, "Mahogany", 5 );
    }

    @Test
    public void canGetName(){
        assertEquals("Pearl", drumKit.getName());
    }

    @Test
    public void canSetName(){
        drumKit.setName("Ludwig");
        assertEquals("Ludwig", drumKit.getName());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(1500, drumKit.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetSellingPrice(){
        drumKit.setSellingPrice(2000);
        assertEquals(2000, drumKit.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetPurchasedPrice(){
        assertEquals(850, drumKit.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canSetPurchasedPrice(){
        drumKit.setPurchasedPrice(350);
        assertEquals(350, drumKit.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canGetInstrumentFamily(){
        assertEquals(Family.PERCUSSION, drumKit.getFamily());
    }

    @Test
    public void canSetInstrumentFamily(){
        drumKit.setFamily(Family.BRASS);
        assertEquals(Family.BRASS, drumKit.getFamily());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Mahogany", drumKit.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        drumKit.setMaterial("Beech");
        assertEquals("Beech", drumKit.getMaterial());
    }

    @Test
    public void canGetNumberOfDrums(){
        assertEquals(5, drumKit.getNumberOfDrums());
    }

    @Test
    public void canSetNumberOfDrums(){
        drumKit.setNumberOfDrums(4);
        assertEquals(4, drumKit.getNumberOfDrums());
    }

    @Test
    public void canMakeSound(){
        assertEquals("da-dum-da-dum", drumKit.makeSound());
    }
}
