package edu.pinkmotan.patterns.templatemethod;

import java.util.List;

/**
 *
 * @author AlGore
 */
public class TargaryenArmy extends Army {

    public TargaryenArmy(List<String> armies, List<String> weapons) {
        this.armies = armies;
        this.weapons = weapons;
    }

    @Override
    public void callSmallHousesArmies(List<String> armies) {

    }

    @Override
    public void dressArmy() {

    }

    @Override
    public void prepareWeapons(List<String> weapons) {

    }

    @Override
    public void exercise() {

    }
}
