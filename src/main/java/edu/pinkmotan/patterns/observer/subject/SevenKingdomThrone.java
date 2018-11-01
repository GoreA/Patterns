package edu.pinkmotan.patterns.observer.subject;


import edu.pinkmotan.patterns.observer.observer.Personage;

import java.util.Observable;

/**
 *
 * @author AlGore
 */
public class SevenKingdomThrone extends Observable {
    Personage queen;

/**
 * in case you decide to implement your own observer you have to implement all methods bellow

     List<Observer> observers;

     public SevenKingdomThrone(){
        this.observers = new ArrayList<>();
     }

    public void notifyObservers(Personage character) {
        observers.forEach(o -> o.update(character));
    }

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        if(observers.contains(o)){
            observers.remove(o);
        }
    }
*/

    public void setNewQueenOnTheThrone(Personage queen){
        this.queen = queen;
        setChanged();
        System.out.println("A new queen in Seven Kingdoms!!!");
        notifyObservers(this.queen);
    }

    public Personage getQueen() {
        return queen;
    }
}
