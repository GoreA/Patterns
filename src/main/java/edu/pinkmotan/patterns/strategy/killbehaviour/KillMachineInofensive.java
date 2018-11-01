package edu.pinkmotan.patterns.strategy.killbehaviour;

/**
 *
 * @author AlGore
 */
public class KillMachineInofensive implements KillMachine{
    public void kill(){
        System.out.println("Cannot kill!");
    }
}
