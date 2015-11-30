package com.neewedgeengineering.prototype.fixtures;

import com.neewedgeengineering.prototype.Game;

public class GameTurnFixture {
  private int roll;
  private Game theGame;

  public String player() {
    theGame = StaticGame.theGame;
    return theGame.takeTurn(roll);
  }

  public boolean gameHasStarted() {
    theGame = StaticGame.theGame;
    return theGame.gameHasStarted();
  }

  public void setRoll(int roll) {
    this.roll = roll;
  }
}
