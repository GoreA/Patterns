package edu.pinkmotan.patterns.factory.factories;

import edu.pinkmotan.patterns.factory.products.House;
import edu.pinkmotan.patterns.factory.products.Personage;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 *
 * @author AlGore
 */
public class PersonageFactory {
    public Personage getPersonage(String name, House house){
        switch (house){
            case STARK:{
                return new StarkFactory().getPersonage(name);
            }
            case LANISTER:{
                return new LanisterFactory().getPersonage(name);
            }
            case TARGARYEN:{
                return new TargaryenFactory().getPersonage(name);
            }
                default:{
                    throw new IllegalArgumentException("There is no such type of personage yet!");
                }
        }
    }

    protected Personage getPersonage(String name){
        throw new UnsupportedOperationException("It's not possible to get such personage yet");
    }
}
