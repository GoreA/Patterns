package edu.pinkmotan.patterns.strategy;

import edu.pinkmotan.patterns.strategy.client.Personage;
import edu.pinkmotan.patterns.strategy.client.Stark;
import edu.pinkmotan.patterns.strategy.client.Targaryen;
import edu.pinkmotan.patterns.strategy.killbehaviour.KillMachineInofensive;

/**
 *
 * @author AlGore
 */
public class Test {
    public static void main(String[] args) {
        Personage daenerys = new Targaryen("Daenerys", "Dragon");
        Personage john = new Stark("John Snow", "Wolf");
        Personage sansa = new Stark("Sansa", "Wolf");

        daenerys.kill();
        john.kill();

        sansa.setKillMachine(new KillMachineInofensive());
        sansa.kill();

    }
}
