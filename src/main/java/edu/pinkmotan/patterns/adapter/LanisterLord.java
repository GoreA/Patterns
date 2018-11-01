package edu.pinkmotan.patterns.adapter;

public class LanisterLord implements Lord {

    @Override
    public void giveCommand() {
        System.out.println("Be brave, my soldiers!!!");
    }
}
