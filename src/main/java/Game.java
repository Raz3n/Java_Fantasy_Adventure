import Components.EnemyType;
import Players.Player;
import Players.Spellcasters.Warlock;
import Rooms.Room;

public class Game {
    private Player player;
    private Room room;

    public Game(Player player, Room room) {
        this.player = player;
        this.room = room;
    }

    public Player getPlayer() {
        return player;
    }

    public Room getRoom() {
        return room;
    }

    public boolean fight(Room room, Player player) {
        if (player.getPowerPoints() < room.getEnemy().getPowerPoints()) {
            return true;
        } else {
            return false;
        }
    }

    public int fightOutcome(Room room, Player player) {
        if (fight(room, player) == false) {
            return player.getHealthPoints() - room.getEnemy().getDamage();
        } else(fight(room, player) == true){
            return player.addVictoryPoints(room.getTreasure().getVictoryPoints());
        }
    }

}
