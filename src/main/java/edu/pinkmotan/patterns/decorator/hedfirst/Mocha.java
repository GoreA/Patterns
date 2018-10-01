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
public class Mocha extends CondimentDecorator {

  Beverage beverage;

  public Mocha(Beverage beverage) {
    this.beverage = beverage;
  }

  @Override
  public String getDescription() {
    return beverage.getDescription() + ", Mocha";
  }

  public Size getSize() {
    return beverage.getSize();
  }

  @Override
  public double cost() {
    double initialCost = 0;
    switch (beverage.getSize()) {
      case SMALL:
        initialCost = .10;
        break;
      case MEDIUM:
        initialCost = .15;
        break;
      case LARGE:
        initialCost = .20;
        break;
      default:
        throw new IllegalArgumentException();
    }
    return initialCost + beverage.cost();
  }
}
