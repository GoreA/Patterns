/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pinkmotan.patterns.decorator.got;

/**
 *
 * @author agore
 */
public class Test {
  public static void main(String[] args) {
    SevenKingdomHouse targaryenHouse = new TargaryenHouse("Fire and Blood", Status.WAR);
    System.out.println("The Army of Targaryens is :" + targaryenHouse.getArmy());
    
    SevenKingdomHouse mormontHouse = new MormontHouse("Here We Stand", Status.PEACE);
    SevenKingdomHouse gloverHouse = new GloverHouse("We have no words", Status.PEACE, mormontHouse);
    SevenKingdomHouse starkHouse = new StarkHouse("Winter is Coming", Status.PEACE, gloverHouse);
    
    System.out.println("The Army of Starks is :" + starkHouse.getArmy());
    
    targaryenHouse.setAllyHouse(starkHouse);
    System.out.println("The Army of Targaryens allied with Starks is :" + targaryenHouse.getArmy());
  }
  
}
