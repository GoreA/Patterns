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
public class Espresso extends Beverage {

  public Espresso(Size size) {
    description = "Espresso";
    this.size = size;
  }

  public double cost() {
    return 1.99;
  }
}
