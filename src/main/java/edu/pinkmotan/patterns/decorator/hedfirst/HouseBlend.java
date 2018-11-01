
package edu.pinkmotan.patterns.decorator.hedfirst;

/**
 *
 * @author HeadFirst
 */
public class HouseBlend extends Beverage {

  public HouseBlend(Size size) {
    description = "House Blend Coffee";
    this.size = size;
  }

  @Override
  public double cost() {
    return .89;
  }
}
