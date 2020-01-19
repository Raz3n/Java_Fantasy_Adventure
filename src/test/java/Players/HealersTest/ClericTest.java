package Players.HealersTest;

import Components.Tools.ArmourType;
import Components.Tools.ItemType;
import Components.Tools.WeaponType;
import Players.Healers.Cleric;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class ClericTest {

    Cleric cleric;

    @Before
    public  void before(){
        cleric = new Cleric("Michael", 100, 0, ItemType.BEER);
    }


    @Test
    public void hasName(){
        assertEquals("Michael", cleric.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, cleric.getHealthPoints());
    }

    @Test
    public void hasVictoryPoints() {
        assertEquals(0, cleric.getVictoryPoints());
    }

    @Test
    public void hasItem() {
        assertEquals(ItemType.BEER, cleric.getItem());

}
}
