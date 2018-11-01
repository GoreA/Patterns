package edu.pinkmotan.patterns.singletone.multithreading;

/**
 *
 * @author AlGore
 */
public enum Incrementor {
    INSTANCE;

    public int add(int counter){
        return counter + 1;
    }
}
