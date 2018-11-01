package edu.pinkmotan.patterns.factory.products.pet;

import edu.pinkmotan.patterns.factory.products.Personage;
import edu.pinkmotan.patterns.factory.products.Stark;

/**
 *
 * @author AlGore
 */
public class Wolf extends Pet{

    public Wolf(String name, PetType type, Stark owner) {
        this.name = name;
        this.type = type;
        this.setOwner(owner);
    }

    @Override
    public void voice() {
        System.out.println("Woooooooo!");
    }

    @Override
    public PetType getType() {
        return type;
    }
}
