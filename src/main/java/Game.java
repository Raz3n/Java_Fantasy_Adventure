import Players.Fighters.Barbarian;
import Players.Player;
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


    public void fightOutcomeHealthPoints(Room room, Player player) {
        if(fight(room,player) == false) {
            switch (player.getHealthPoints() - room.getEnemy().getDamage()) {
            }
        }
        switch (player.getVictoryPoints() + room.getTreasure().getVictoryPoints()) {
        }


    }
}

//    public int fightOutcomeHealthPoints(Room room, Player player) {
//        int newHp = player.getHealthPoints();
//        if (fight(room, player) == false) {
//            return newHp = player.getHealthPoints() - room.getEnemy().getDamage();
//        }
//        return player.getVictoryPoints() + room.getTreasure().getVictoryPoints();
//    }
//
//    }




//    public int fightOutcomeVictoryPoints(Room room, Player player) {
//        if(fight(room, player) == true) {
//            return player.getVictoryPoints() + room.getTreasure().getVictoryPoints();
//        }
//        return player.getVictoryPoints();
//    }




