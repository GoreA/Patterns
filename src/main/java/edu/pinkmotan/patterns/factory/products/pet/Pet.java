package edu.pinkmotan.patterns.factory.products.pet;

import edu.pinkmotan.patterns.factory.products.Personage;

public abstract class Pet {
    String name;
    PetType type;
    Personage owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(PetType type) {
        this.type = type;
    }

    public Personage getOwner() {
        return owner;
    }

    public void setOwner(Personage owner) {
        this.owner = owner;
    }

    public abstract void voice();

    public abstract PetType getType();

    @Override
    public String toString() {
        return "I am " + this.name + " and I am a " + this.type.toString().toLowerCase();
    }
}
