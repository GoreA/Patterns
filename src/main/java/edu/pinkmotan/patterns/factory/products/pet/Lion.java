package edu.pinkmotan.patterns.factory.products.pet;

import edu.pinkmotan.patterns.factory.products.Lanister;

/**
 *
 * @author AlGore
 */
public class Lion extends Pet {

    public Lion(String name, PetType type, Lanister owner) {
        this.name = name;
        this.type = type;
        this.setOwner(owner);
    }

    @Override
    public void voice() {
        System.out.printf("Roar!!!");
    }

    @Override
    public PetType getType() {
        return this.type;
    }
}
