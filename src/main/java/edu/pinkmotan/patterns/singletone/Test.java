package edu.pinkmotan.patterns.singletone;

/**
 *
 * @author AlGore
 */
public class Test {
    public static void main(String[] args) {
        PropertyReader reader = PropertyReader.INSTANCE;

        System.out.println("Who is the king now?");
        System.out.println("The of the " + reader.getPropertiess().getProperty("king"));
    }
}
