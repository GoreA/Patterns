
package edu.pinkmotan.patterns.decorator.hedfirst;

/**
 *
 * @author HeadFirst
 */
public class DarkRoast extends Beverage {

  public DarkRoast(Size size) {
    description = "DarkRoast";
    this.size = size;
  }

  @Override
  public double cost() {
    return 2.99;
  }
}
