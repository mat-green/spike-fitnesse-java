package com.neewedgeengineering.prototype.fixtures;

import com.neewedgeengineering.prototype.Game;

public abstract class StaticGame {
  public static Game theGame = new Game();

  public static Game getInstance() {
    return theGame;
  }
}
