
package edu.pinkmotan.patterns.iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author AlGore
 */
public enum DaenerysDragons {

  INSTANCE(new Dragon[]{new Dragon("Drogon"), new Dragon("Viserion"), new Dragon("Rhaegal")});

  private Dragon[] dragons;

  private DaenerysDragons(Dragon[] dragons) {
    this.dragons = dragons;
  }

  public Iterator getIterator() {
    return Arrays.asList(dragons).iterator();
  }
}
