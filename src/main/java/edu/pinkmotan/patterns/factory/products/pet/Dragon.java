package edu.pinkmotan.patterns.factory.products.pet;

import edu.pinkmotan.patterns.factory.products.Targaryen;

/**
 *
 * @author AlGore
 */
public class Dragon extends Pet {

    public Dragon(String name, PetType type, Targaryen owner) {
        this.name = name;
        this.type = type;
        this.setOwner(owner);
    }

    @Override
    public void voice() {
        System.out.println("Fire!!!");
    }

    @Override
    public PetType getType() {
        return this.type;
    }
}
