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
