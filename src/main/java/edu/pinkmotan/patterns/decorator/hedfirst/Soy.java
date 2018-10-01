/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pinkmotan.patterns.decorator.hedfirst;

/**
 *
 * @author agore
 */
public class Soy extends CondimentDecorator {

  Beverage beverage;

  public Soy(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Soy";
  }

  public Size getSize() {
    return beverage.getSize();
  }

  @Override
  public double cost() {
    double initialCost = 0;
    switch (beverage.getSize()) {
      case SMALL:
        initialCost = .20;
        break;
      case MEDIUM:
        initialCost = .25;
        break;
      case LARGE:
        initialCost = .30;
        break;
      default:
        throw new IllegalArgumentException();
    }
    return initialCost + beverage.cost();
  }
}
