
package edu.pinkmotan.patterns.iterator;

/**
 *
 * @author AlGore
 */
public class Wolf implements Personage {

  private String name;

  public Wolf(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}
