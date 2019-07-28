import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

    private Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Wood", "Fender", "Stratocaster", 350, 500, 6);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasMake(){
        assertEquals("Fender", guitar.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Stratocaster", guitar.getModel());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(350, guitar.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(500, guitar.getSellingPrice());
    }

    @Test
    public void hasNumberOfStrings(){
        assertEquals(6, guitar.getNumberOfStrings());
    }

    @Test
    public void canPlay(){
        assertEquals("Struuummm!", guitar.play());
    }

}
