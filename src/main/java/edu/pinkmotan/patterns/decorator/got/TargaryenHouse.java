
package edu.pinkmotan.patterns.decorator.got;

import static edu.pinkmotan.patterns.decorator.got.Status.PEACE;

/**
 *
 * @author AlGore
 */
public class TargaryenHouse extends SevenKingdomHouse{
  
  TargaryenHouse(String words){
    this(words, PEACE, null);
  }
  
  TargaryenHouse(String words, Status status){
    this(words, status, null);
  }
  
  TargaryenHouse(String words, Status status, SevenKingdomHouse allyHouse){
    this.allyHouse = allyHouse;
    this.words = words;
    this.armyStatus = status;
    this.setArmy(status);
  }

  @Override
  public void setArmy(Status status) {
    switch (this.getArmyStatus()) {
      case PEACE:
        this.army = 10_000;
        break;
      case WAR_PREPARATION:
        this.army = 15_000;
        break;
      case WAR:
        this.army = 7_500;
        break;
      case AFTER_WAR:
        this.army = 2_000;
        break;
      default:
        throw new IllegalArgumentException();
    }
  }
}
