/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.pinkmotan.patterns.proxy.protection;

/**
 *
 * @author agore
 */
public class PersonBeanImpl implements PersonBean {

  String name;
  String gender;
  String interests;
  int raiting;
  int raitingCounter = 0;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getInterests() {
    return interests;
  }

  public void setInterests(String interests) {
    this.interests = interests;
  }

  @Override
  public int getHotOrNotRaiting() {
    if(raitingCounter == 0) return 0;
    return (raiting/raitingCounter);
  }

  @Override
  public void setHotOrNotRaiting(int raiting) {
    this.raiting += raiting;
    raitingCounter++;
  }

  
}
