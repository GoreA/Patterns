package edu.pinkmotan.patterns.templatemethod;

import java.util.List;

/**
 *
 * @author AlGore
 */
public class LanisterArmy extends Army {

    public LanisterArmy(List<String> armies, List<String> weapons) {
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
