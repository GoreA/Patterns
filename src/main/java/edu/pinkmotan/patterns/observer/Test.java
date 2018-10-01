package edu.pinkmotan.patterns.observer;

import edu.pinkmotan.patterns.observer.observer.*;
import edu.pinkmotan.patterns.observer.subject.SevenKingdomThrone;

import java.util.Observer;

public class Test {
    public static void main(String[] args) {
        SevenKingdomThrone throne = new SevenKingdomThrone();
        Personage cercei = new Lanister("Cercei", "wine");
        Personage daenerys = new Targaryen("Daenerys", "Dragon");
        Personage john = new Stark("John Snow", "Wolf");
        Personage sansa = new Stark("Sansa", "Wolf");

        throne.addObserver((Observer) daenerys);
        throne.addObserver((Observer) john);
        throne.addObserver((Observer) sansa);

        throne.setNewQueenOnTheThrone(cercei);

        throne.addObserver((Observer) cercei);

        throne.setNewQueenOnTheThrone(daenerys);

    }
}
