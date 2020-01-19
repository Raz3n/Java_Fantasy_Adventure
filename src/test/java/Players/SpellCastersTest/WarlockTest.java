package Players.SpellCastersTest;

import Components.Tools.*;
import Players.Spellcasters.Warlock;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WarlockTest {
    Warlock warlock;

    @Before
    public void before() {
        warlock = new Warlock("Naz", 100, 0, SpellType.BUBBLESORT, CreatureType.EUGENE);
    }

    @Test
    public void hasName(){
        assertEquals("Naz", warlock.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, warlock.getHealthPoints());
    }

    @Test
    public void hasVictoryPoints() {
        assertEquals(0, warlock.getVictoryPoints());
    }

    @Test
    public void hasSpell() {
        assertEquals(SpellType.BUBBLESORT, warlock.getSpell());
    }

    @Test
    public void hasCreature() {
            assertEquals(CreatureType.EUGENE, warlock.getCreature());
    }
}
