package edu.pinkmotan.patterns.strategy.client;

import edu.pinkmotan.patterns.strategy.killbehaviour.KillMachine;
import edu.pinkmotan.patterns.strategy.killbehaviour.KillMachineInofensive;

/**
 *
 * @author AlGore
 */
public abstract class Personage {
    String name;
    String pet;
    KillMachine killMachine;

    public Personage(String name, String pet) {
        this.name = name;
        this.pet = pet;
        this.killMachine = new KillMachineInofensive();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public KillMachine getKillMachine() {
        return killMachine;
    }

    public void setKillMachine(KillMachine killMachine) {
        this.killMachine = killMachine;
    }

    public void kill(){
        killMachine.kill();
    }


}
