package edu.pinkmotan.patterns.observer.observer;


import java.util.Observable;
import java.util.Observer;

public class Targaryen extends Personage implements Observer {

    public Targaryen(String name, String pet) {
        super(name, pet);
    }

    @Override
    public void update(Observable o, Object queen) {
        this.setCurrentQueen(queen);
    }

    protected void setQueen(Personage queen) {
        if (queen instanceof Targaryen) {
            this.currentQueen = queen;
            System.out.printf("%s said: Only a Targaryen can be a good queen!!!%n", this.getName());
        } else {
            this.currentQueen = this;
            System.out.printf("%s said: I'm gonna take your place, you, stupid %s!!!%n",
                    this.getName(), queen.getName());
        }
    }


}
