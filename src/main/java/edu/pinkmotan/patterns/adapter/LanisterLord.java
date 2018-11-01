package edu.pinkmotan.patterns.adapter;

/**
 *
 * @author AlGore
 */
public class LanisterLord implements Lord {

    @Override
    public void giveCommand() {
        System.out.println("Be brave, my soldiers!!!");
    }
}
