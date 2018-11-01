
package edu.pinkmotan.patterns.decorator.got;

import static edu.pinkmotan.patterns.decorator.got.Status.PEACE;

/**
 *
 * @author AlGore
 */
public class StarkHouse extends SevenKingdomHouse {

  StarkHouse(String words) {
    this(words, PEACE, null);
  }

  StarkHouse(String words, Status status) {
    this(words, status, null);
  }

  StarkHouse(String words, Status status, SevenKingdomHouse allyHouse) {
    this.words = words;
    this.armyStatus = status;
    this.allyHouse = allyHouse;
    this.setArmy(status);
  }

  @Override
  public void setArmy(Status status) {
    switch (this.getArmyStatus()) {
      case PEACE:
        this.army = 100_000;
        break;
      case WAR_PREPARATION:
        this.army = 150_000;
        break;
      case WAR:
        this.army = 75_000;
        break;
      case AFTER_WAR:
        this.army = 20_000;
        break;
      default:
        throw new IllegalArgumentException();
    }
  }
}
