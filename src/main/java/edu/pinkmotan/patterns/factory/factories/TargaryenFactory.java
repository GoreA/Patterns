package edu.pinkmotan.patterns.factory.factories;

import edu.pinkmotan.patterns.factory.products.Personage;
import edu.pinkmotan.patterns.factory.products.Targaryen;
import edu.pinkmotan.patterns.factory.products.pet.Dragon;
import edu.pinkmotan.patterns.factory.products.pet.Pet;
import edu.pinkmotan.patterns.factory.products.pet.PetType;

/**
 *
 * @author AlGore
 */
public class TargaryenFactory extends PersonageFactory{

    @Override
    public Personage getPersonage(String name) {
        Targaryen targaryen = new Targaryen(name);
        Pet dragon = createPet(targaryen);
        targaryen.setPet(dragon);
        return targaryen;
    }

    private Pet createPet(Targaryen owner){
        String name = owner.getName() + "'s pet";
        return new Dragon(name, PetType.DRAGON, owner);

    }
}
