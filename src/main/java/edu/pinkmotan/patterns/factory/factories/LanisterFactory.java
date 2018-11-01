package edu.pinkmotan.patterns.factory.factories;

import edu.pinkmotan.patterns.factory.products.Lanister;
import edu.pinkmotan.patterns.factory.products.Personage;
import edu.pinkmotan.patterns.factory.products.pet.Lion;
import edu.pinkmotan.patterns.factory.products.pet.Pet;
import edu.pinkmotan.patterns.factory.products.pet.PetType;

/**
 *
 * @author AlGore
 */
public class LanisterFactory extends PersonageFactory {

    @Override
    public Personage getPersonage(String name) {
        Lanister lanister = new Lanister(name);
        Pet lion = createPet(lanister);
        lanister.setPet(lion);
        return lanister;
    }

    private Pet createPet(Lanister owner) {
        String name = owner.getName() + "'s pet";
        return new Lion(name, PetType.LION, owner);
    }
}
