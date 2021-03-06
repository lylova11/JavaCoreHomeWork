package hw1;

import hw1.Player;

public class Team {

    private String name;
    private Player[] players;

    public Team(String name, Player[] players) {
        this.name = name;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public Player[] getPeoples() {
        return players;
    }
}
