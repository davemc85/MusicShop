package instrumentTests;

import instruments.Family;
import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;
    private Family family;

    @Before
    public void setUp(){
        guitar = new Guitar("Gibson", 3000, 2000, family.STRING, "Mahogany", "Electric");
    }

    @Test
    public void canGetName(){
        assertEquals("Gibson", guitar.getName());
    }


}
