package com.neewedgeengineering.prototype;

import java.util.ArrayList;

public class Game {

  private ArrayList<Player> players;
  private Player current;

  public Game() {
    players = new ArrayList<Player>();
  }

  public Player addPlayer(String aPlayerName) {
    if(gameHasStarted()) {
      return null;
    } else {
      Player aPlayer = new Player(aPlayerName);
      players.add(aPlayer);
      return aPlayer;
    }
  }

  public boolean playerIsPlaying(Player aPlayer) {
    System.out.printf("[%s, %s] %s\n", players.get(0).getName(), players.get(1).getName(), players.contains(aPlayer));
    return players.contains(aPlayer);
  }

  public int getNumberOfPlayers() {
    return players.size();
  }

  public Player getPlayerNamed(String playerName) {
    for (Player player : players) {
      System.out.printf("checking %s is %s\n", player.getName(), playerName);
      if(player.getName().equals(playerName)) {
        return player;
      }
    }
    return null;
  }

  public void removePlayer(Player thePlayer) {
    if(!gameHasStarted()) {
      players.remove(thePlayer);
    }
  }

  public String takeTurn(int roll) {
    if(this.current == null) {
      this.current = this.players.get(0);
    } else {
      int index = this.players.indexOf(this.current) + 1;
      if(index >= this.players.size()) {
        this.current = this.players.get(0);
      } else {
        this.current = this.players.get(index);
      }
    }
    return this.current.getName();
  }

  public boolean gameHasStarted() {
    return this.current != null;
  }
}
