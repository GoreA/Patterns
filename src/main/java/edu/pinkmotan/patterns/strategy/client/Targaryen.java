package edu.pinkmotan.patterns.strategy.client;

import edu.pinkmotan.patterns.strategy.killbehaviour.KillWithDragonMachine;

/**
 *
 * @author AlGore
 */
public class Targaryen extends Personage{

    public Targaryen(String name, String pet) {
        super(name, pet);
        killMachine = new KillWithDragonMachine();
    }

}
