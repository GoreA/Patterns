package edu.pinkmotan.patterns.factory.products;

import edu.pinkmotan.patterns.factory.products.pet.Pet;

public class Lanister extends Personage {

    public Lanister(String name){
        this.name = name;
    }

    @Override
    public void sayHouseWords() {
        System.out.println("A Lannister always pays his debts!");
    }

}
