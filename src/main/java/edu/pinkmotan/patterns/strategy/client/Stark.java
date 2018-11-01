package edu.pinkmotan.patterns.strategy.client;

import edu.pinkmotan.patterns.strategy.killbehaviour.KillWithSwordMachine;

/**
 *
 * @author AlGore
 */
public class Stark extends Personage {

    public Stark(String name, String pet) {
        super(name, pet);
        killMachine = new KillWithSwordMachine();
    }

}
