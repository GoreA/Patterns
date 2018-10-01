package edu.pinkmotan.patterns.strategy.client;

import edu.pinkmotan.patterns.strategy.killbehaviour.KillWithSwordMachine;

public class Stark extends Personage {

    public Stark(String name, String pet) {
        super(name, pet);
        killMachine = new KillWithSwordMachine();
    }

}
