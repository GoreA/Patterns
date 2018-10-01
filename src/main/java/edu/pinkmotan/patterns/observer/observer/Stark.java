package edu.pinkmotan.patterns.observer.observer;


import java.util.Observable;
import java.util.Observer;

public class Stark extends Personage implements Observer {

    public Stark(String name, String pet) {
        super(name, pet);
    }

    @Override
    public void update(Observable o, Object queen) {
            this.setCurrentQueen(queen);
    }
}
