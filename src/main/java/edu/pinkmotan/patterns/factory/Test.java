package edu.pinkmotan.patterns.factory;

import edu.pinkmotan.patterns.factory.factories.PersonageFactory;
import edu.pinkmotan.patterns.factory.products.House;
import edu.pinkmotan.patterns.factory.products.Personage;

/**
 *
 * @author AlGore
 */
public class Test {
    public static void main(String[] args) {
        PersonageFactory factory = new PersonageFactory();
        Personage arya = factory.getPersonage("Arya", House.STARK);
        System.out.println(arya);
        arya.getPet().voice();
        arya.getPet().setName("Nymeria");
        System.out.println(arya.getPet());

        Personage tyrion = factory.getPersonage("Tyrion", House.LANISTER);
        tyrion.getPet().setName("Tuzik");
        System.out.println(tyrion.getPet());
    }
}
