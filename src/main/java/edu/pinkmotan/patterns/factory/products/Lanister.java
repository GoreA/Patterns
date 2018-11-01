package edu.pinkmotan.patterns.factory.products;

/**
 *
 * @author AlGore
 */
public class Lanister extends Personage {

    public Lanister(String name){
        this.name = name;
    }

    @Override
    public void sayHouseWords() {
        System.out.println("A Lannister always pays his debts!");
    }

}
