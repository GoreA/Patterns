package edu.pinkmotan.patterns.factory.products;

/**
 *
 * @author AlGore
 */
public class Stark extends Personage {

    public Stark(String name){
        this.name = name;
    }

    @Override
    public void sayHouseWords() {
        System.out.println("Winter is Coming!");
    }
}