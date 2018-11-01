package edu.pinkmotan.patterns.templatemethod;

import java.util.List;

/**
 *
 * @author AlGore
 */
public abstract class Army {

    List<String> armies;
    List<String> weapons;

    public void prepare(){
        callSmallHousesArmies(armies);
        dressArmy();
        prepareWeapons(weapons);
        exercise();
    }

    public abstract void callSmallHousesArmies(List<String> armies);
    public abstract void dressArmy();
    public abstract void prepareWeapons(List<String> weapons);
    public abstract void exercise();
}
