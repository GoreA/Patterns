/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pinkmotan.patterns.decorator.got;

import static edu.pinkmotan.patterns.decorator.got.Status.PEACE;

/**
 *
 * @author agore
 */
public class GloverHouse extends SevenKingdomSmallHouse {

  private SevenKingdomHouse allyHouse;

  GloverHouse(String words) {
    this(words, PEACE, null);
  }

  GloverHouse(String words, Status status) {
    this(words, status, null);
  }

  GloverHouse(String words, Status status, SevenKingdomHouse allyHouse) {
    this.words = words;
    this.armyStatus = status;
    this.allyHouse = allyHouse;
    this.setArmy(status);
  }

  @Override
  public void setArmy(Status status) {
    switch (this.getArmyStatus()) {
      case PEACE:
      case WAR_PREPARATION:
      case WAR:
        this.army = 1_000;
        break;
      case AFTER_WAR:
        this.army = 100;
        break;
      default:
        throw new IllegalArgumentException();
    }
  }
}
