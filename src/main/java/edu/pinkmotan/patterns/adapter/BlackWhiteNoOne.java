package edu.pinkmotan.patterns.adapter;

public class BlackWhiteNoOne implements NoOne {
    @Override
    public void kill(String personageName) {
        System.out.println("You have to die, " + personageName + "!!!");
    }

    @Override
    public void giveCommand(String command) {
        System.out.println(command);

    }
}
