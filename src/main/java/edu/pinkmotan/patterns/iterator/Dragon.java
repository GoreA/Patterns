
package edu.pinkmotan.patterns.iterator;

/**
 *
 * @author AlGore
 */
public class Dragon implements Personage{
  private String name;

  public Dragon(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
}
