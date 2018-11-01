package edu.pinkmotan.patterns.factory.products;

/**
 *
 * @author AlGore
 */
public class Targaryen extends Personage {

    public Targaryen(String name){
        this.name = name;
    }

    @Override
    public void sayHouseWords() {
        System.out.println("Fire and Blood!");
    }

}
