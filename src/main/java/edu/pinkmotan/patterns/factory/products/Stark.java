package edu.pinkmotan.patterns.factory.products;

import edu.pinkmotan.patterns.factory.products.pet.Pet;

public class Stark extends Personage {

    public Stark(String name){
        this.name = name;
    }

    @Override
    public void sayHouseWords() {
        System.out.println("Winter is Coming!");
    }
}