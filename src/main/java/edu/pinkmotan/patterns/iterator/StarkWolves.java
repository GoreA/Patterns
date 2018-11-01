
package edu.pinkmotan.patterns.iterator;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author AlGore
 */
public class StarkWolves {
  private List<Wolf> wolves;
  
  public StarkWolves(List<Wolf> wolves){
    this.wolves = wolves;
  }

  public List<Wolf> getWolves() {
    return wolves;
  }

  public void setWolves(List<Wolf> wolves) {
    this.wolves = wolves;
  }
  
  public Iterator getIterator(){
    return this.wolves.iterator();
  }
}
