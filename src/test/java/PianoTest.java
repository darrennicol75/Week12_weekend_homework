import instruments.Guitar;
import instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Wood", "Steinback", "Beethoven", 250, 550, 32);
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasMake(){
        assertEquals("Steinback", piano.getMake());
    }

    @Test
    public void hasModel(){
        assertEquals("Beethoven", piano.getModel());
    }

    @Test
    public void hasBuyingPrice(){
        assertEquals(250, piano.getBuyingPrice());
    }

    @Test
    public void hasSellingPrice(){
        assertEquals(550, piano.getSellingPrice());
    }

    @Test
    public void hasNumberOfKeys(){
        assertEquals(32, piano.getNumberOfKeys());
    }

    @Test
    public void canPlay(){
        assertEquals("plink plonk!", piano.play());
    }


}
