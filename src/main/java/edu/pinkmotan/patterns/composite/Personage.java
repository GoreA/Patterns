package edu.pinkmotan.patterns.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author AlGore
 */
public class Personage {

  private List<Personage> children;
  private Personage spose;
  private List<Personage> parents;
  private final String name;

  public Personage(String name) {
    this.name = name;
    this.parents = new ArrayList<>();
    this.children = new ArrayList<>();
  }

  public List<Personage> getChildren() {
    return children;
  }

  public void addChild(Personage child) {
    this.children.add(child);
  }

  public Personage getSpose() {
    return spose;
  }

  public void setSpose(Personage spose) {
    this.spose = spose;
  }

  public Personage addParent(Personage parent) {
    this.parents.add(parent);
    parent.addChild(this);
    return this;
  }

  public List<Personage> getParents() {
    return parents;
  }

  public String getName() {
    return name;
  }

  public void displayAnchestors() {
    System.out.println(this);
    if (!children.isEmpty() && children != null) {
      for(Personage child : children) {
        child.displayAnchestors();
      }
    }
  }

  @Override
  public String toString() {
    if (!parents.isEmpty() && parents != null) {
      String display = "Name=" + name;
      for(Personage parent : parents){
        display += ", parent= " + parent.name;
      }
      return  display;
    } else {
      return "Name=" + name;
    }
  }

}
