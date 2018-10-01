package edu.pinkmotan.patterns.observer.subject;

import edu.pinkmotan.patterns.observer.observer.CustomObserver;
import edu.pinkmotan.patterns.observer.observer.Personage;

/**
 *
 * A custom Observer that takes care about observers
 */
public interface Subject {
    void notifyObservers(Personage personage);
    void addObserver(CustomObserver o);
    void removeObserver(CustomObserver o);
}
