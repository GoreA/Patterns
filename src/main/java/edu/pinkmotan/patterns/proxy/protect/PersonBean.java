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
public interface PersonBean {
  String getName();
  String getGender();
  String getInterests();
  int getHotOrNotRaiting();
  
  void setName(String name);
  void setGender(String gender);
  void setInterests(String interests);
  void setHotOrNotRaiting(int raiting);
}
