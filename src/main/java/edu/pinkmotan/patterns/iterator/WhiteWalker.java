
package edu.pinkmotan.patterns.iterator;

/**
 *
 * @author AlGore
 */
public class WhiteWalker implements Personage{
  private String name;

  public WhiteWalker(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }
  
}
