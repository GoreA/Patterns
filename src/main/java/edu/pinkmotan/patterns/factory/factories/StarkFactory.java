package edu.pinkmotan.patterns.factory.factories;

import edu.pinkmotan.patterns.factory.products.House;
import edu.pinkmotan.patterns.factory.products.Personage;
import edu.pinkmotan.patterns.factory.products.Stark;
import edu.pinkmotan.patterns.factory.products.pet.Pet;
import edu.pinkmotan.patterns.factory.products.pet.PetType;
import edu.pinkmotan.patterns.factory.products.pet.Wolf;

/**
 *
 * @author AlGore
 */
public class StarkFactory extends PersonageFactory {

    @Override
    public Personage getPersonage(String name) {
        Stark stark = new Stark(name);
        Pet wolf = createPet(stark);
        stark.setPet(wolf);
        return stark;
    }

    private Pet createPet(Stark owner) {
        String name = owner.getName() + "'s pet";
        return new Wolf(name, PetType.WOLF, owner);

    }
}