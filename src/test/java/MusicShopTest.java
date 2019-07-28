import instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MusicShopTest {

    private MusicShop shop;
    private Guitar guitar;


    @Before
    public void setup(){
        shop = new MusicShop("Sound City");
        guitar = new Guitar("wood", "Fender", "Stratocaster", 350, 500, 6);
    }

    @Test
    public void hasName() {
        assertEquals("Sound City", shop.getName());
    }

    @Test
    public void canSetName() {
        shop.setName("Sound City");
        assertEquals("Sound City", shop.getName());
    }

    @Test
    public void canCountInventory() {
        assertEquals(0, shop.inventoryCount());
    }

    @Test
    public void canAddStockToShop() {
        shop.addItem(guitar);
        assertEquals(1, shop.inventoryCount());
        assertTrue(shop.getInventory().contains(guitar));
    }

    @Test
    public void canRemoveItemFromInventory() {
        shop.addItem(guitar);
        shop.removeItem(guitar);
        assertEquals(0, shop.inventoryCount());
    }

    @Test
    public void canCalcProfitMargin(){
        shop.addItem(guitar);
        assertEquals(150, shop.calcProfitMargin());
    }

}
