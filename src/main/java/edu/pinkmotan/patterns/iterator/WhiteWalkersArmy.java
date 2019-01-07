
package edu.pinkmotan.patterns.iterator;

import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author AlGore
 */
public class WhiteWalkersArmy {

  private Map<WhiteWalker, Integer> whiteWalkers;

  public WhiteWalkersArmy(Map<WhiteWalker, Integer> whiteWalkers) {
    this.whiteWalkers = whiteWalkers;
  }

  public Map<WhiteWalker, Integer> getWhiteWalkers() {
    return whiteWalkers;
  }

  public void setWhiteWalkers(Map<WhiteWalker, Integer> whiteWalkers) {
    this.whiteWalkers = whiteWalkers;
  }

  public Iterator getIterator() {
    return this.whiteWalkers.keySet().iterator();
  }
}
