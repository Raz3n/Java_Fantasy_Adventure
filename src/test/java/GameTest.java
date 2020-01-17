import Components.EnemyType;
import Components.Tools.*;
import Components.TreasureType;
import Players.Fighters.Barbarian;
import Players.Healers.Cleric;
import Players.Player;
import Players.Spellcasters.Warlock;
import Rooms.Room;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GameTest {

    Barbarian barbarian;
    Warlock warlock;
    Cleric cleric;
    Room room1;
    Room room2;
    Game game;

    @Before
    public void before(){
        barbarian = new Barbarian("Sophia", 100, 0, WeaponType.BAGUETTE, ArmourType.CUIRASS);
        warlock = new Warlock("Daniel", 100, 0, SpellType.EUGENEABANDONUS, CreatureType.DEMON);
        cleric = new Cleric("Hitch", 100, 0, ItemType.BIGMAC);
        room1 = new Room("Surprise", EnemyType.TROLL, TreasureType.JUANSGLASSES);
        room2 = new Room("Disaster", EnemyType.ORC, TreasureType.SANDYSMARKER);
        game = new Game(barbarian, room1);
    }

    @Test
    public void hasPlayer(){
        assertEquals(barbarian, game.getPlayer());
    }

    @Test
    public void hasRoom() {
        assertEquals(room1, game.getRoom());
    }

    @Test
    public void canComparePowerPointsOfPlayerAndEnemy(){
        assertEquals(true, game.fight(room1, barbarian));
    }

    @Test
    public void canComparePowerPointsOfPlayerAndEnemyFalse() {
        assertEquals(false, game.fight(room1, warlock));
    }

    @Test
    public void shouldCalculateFightOutcomeHealthPoints() {
        game.fightOutcomeHealthPoints(room1, barbarian);
        assertEquals(90, barbarian.getHealthPoints());

    }

//    @Test
//    public void shouldCalculateFightOutcomeVictoryPoints() {
//        game.fightOutcomeVictoryPoints(room1, warlock);
//        assertEquals(50, warlock.getVictoryPoints());
//
//    }


}
