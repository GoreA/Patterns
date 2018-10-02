package edu.pinkmotan.patterns.factory.products;

import edu.pinkmotan.patterns.factory.products.pet.Pet;

public class Targaryen extends Personage {

    public Targaryen(String name){
        this.name = name;
    }

    @Override
    public void sayHouseWords() {
        System.out.println("Fire and Blood!");
    }

}
