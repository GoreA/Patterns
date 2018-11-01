package edu.pinkmotan.patterns.adapter;

public class FacelessMan implements Lord {

    NoOne adaptee;

    public FacelessMan(NoOne adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void giveCommand() {
        adaptee.giveCommand("Be brave, my soldiers! said faceless man.");
    }

}
