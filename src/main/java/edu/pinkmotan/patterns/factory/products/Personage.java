package edu.pinkmotan.patterns.factory.products;

import edu.pinkmotan.patterns.factory.products.pet.Pet;

/**
 *
 * @author AlGore
 */
public abstract class Personage {
    String name;
    Pet pet;

    public abstract void sayHouseWords();

    public String getName(){
        return this.name;
    }

    public Pet getPet(){
        return this.pet;
    }

    public void setPet(Pet pet){
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "I am " + this.name + " and I have a " + pet.getType().toString().toLowerCase();
    }
}
