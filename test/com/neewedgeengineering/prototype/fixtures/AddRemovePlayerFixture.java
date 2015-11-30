package com.neewedgeengineering.prototype.fixtures;

import com.neewedgeengineering.prototype.Game;
import com.neewedgeengineering.prototype.Player;

public class AddRemovePlayerFixture {
  private String playerName;
  private Game theGame;

  public void setPlayerName(String playerName) {
    this.playerName = playerName;
  }

  public boolean addPlayer() {
    theGame = StaticGame.theGame;
    Player thePlayer = theGame.addPlayer(playerName);
    return theGame.playerIsPlaying(thePlayer);
  }

  public int countPlayers() {
    return theGame.getNumberOfPlayers();
  }
  
  public boolean removePlayer() {
    theGame = StaticGame.getInstance();
    Player thePlayer = theGame.getPlayerNamed(playerName);
    theGame.removePlayer(thePlayer);
    return (playerWasRemoved(thePlayer));
  }

  private boolean playerWasRemoved(Player aPlayer) {
    return (!theGame.playerIsPlaying(aPlayer));
  }
}
