
package edu.pinkmotan.patterns.decorator.got;

/**
 *
 * @author AlGore
 */
public abstract class SevenKingdomHouse {

  String words;
  int army;
  Status armyStatus;
  SevenKingdomHouse allyHouse;

  public SevenKingdomHouse getAllyHouse() {
    return allyHouse;
  }

  public void setAllyHouse(SevenKingdomHouse allyHouse) {
    this.allyHouse = allyHouse;
    this.setArmy(armyStatus);
  }

  public String getWords() {
    return words;
  }

  public int getArmy() {
    if (allyHouse != null) {
      return this.army + allyHouse.getArmy();
    } else {
      return this.army;
    }
  }

  public abstract void setArmy(Status status);

  public Status getArmyStatus() {
    return armyStatus;
  }

  public void setArmyStatus(Status armyStatus) {
    this.armyStatus = armyStatus;
  }

}
