
package edu.pinkmotan.patterns.decorator.hedfirst;

/**
 *
 * @author HeadFirst
 */
public class Espresso extends Beverage {

  public Espresso(Size size) {
    description = "Espresso";
    this.size = size;
  }

  public double cost() {
    return 1.99;
  }
}
