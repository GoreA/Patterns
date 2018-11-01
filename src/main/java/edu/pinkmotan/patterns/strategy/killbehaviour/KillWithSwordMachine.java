package edu.pinkmotan.patterns.strategy.killbehaviour;

/**
 *
 * @author AlGore
 */
public class KillWithSwordMachine implements KillMachine{

    public void kill() {
        System.out.println("Kill with a sword!");
    }
}
