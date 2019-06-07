package instrumentTests;

import instruments.Family;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;


    @Before
    public void setUp(){
        guitar = new Guitar("Gibson", 3000, 2000, Family.STRING, "Mahogany", "Electric");
    }

    @Test
    public void canGetName(){
        assertEquals("Gibson", guitar.getName());
    }

    @Test
    public void canSetName(){
        guitar.setName("Fender");
        assertEquals("Fender", guitar.getName());
    }

    @Test
    public void canGetSellingPrice(){
        assertEquals(3000, guitar.getSellingPrice(), 0.00);
    }

    @Test
    public void canSetSellingPrice(){
        guitar.setSellingPrice(4000);
        assertEquals(4000, guitar.getSellingPrice(), 0.00);
    }

    @Test
    public void canGetPurchasedPrice(){
        assertEquals(2000, guitar.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canSetPurchasedPrice(){
        guitar.setPurchasedPrice(3500);
        assertEquals(3500, guitar.getPurchasedPrice(), 0.00);
    }

    @Test
    public void canGetInstrumentFamily(){
        assertEquals(Family.STRING, guitar.getFamily());
    }

    @Test
    public void canSetInstrumentFamily(){
        guitar.setFamily(Family.PERCUSSION);
        assertEquals(Family.PERCUSSION, guitar.getFamily());
    }

    @Test
    public void canGetMaterial(){
        assertEquals("Mahogany", guitar.getMaterial());
    }

    @Test
    public void canSetMaterial(){
        guitar.setMaterial("Beech");
        assertEquals("Beech", guitar.getMaterial());
    }

    @Test
    public void canGetType(){
        assertEquals("Electric", guitar.getType());
    }

    @Test
    public void canSetType(){
        guitar.setType("Acoustic");
        assertEquals("Acoustic", guitar.getType());
    }

}
