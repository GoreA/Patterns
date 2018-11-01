
package edu.pinkmotan.patterns.iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author AlGore
 */
public class Test {
  public static void main(String[] args) {
    List<Wolf> wolves = new ArrayList<>();
    wolves.add(new Wolf("Grey Wind"));
    wolves.add(new Wolf("Lady"));
    wolves.add(new Wolf("Nymeria"));
    wolves.add(new Wolf("Direwolf Summer"));
    wolves.add(new Wolf("Grey Shaggydog"));
    wolves.add(new Wolf("Ghost"));
    StarkWolves starkWolves = new StarkWolves(wolves);
    
    Map<WhiteWalker, Integer> whiteWalkers = new HashMap<>();
    whiteWalkers.put(new WhiteWalker("First one"), 1);
    whiteWalkers.put(new WhiteWalker("Second one"), 2);
    whiteWalkers.put(new WhiteWalker("Third one"), 3);
    whiteWalkers.put(new WhiteWalker("Forth one"), 4);
    WhiteWalkersArmy army = new WhiteWalkersArmy(whiteWalkers);
    
    DaenerysDragons instance = DaenerysDragons.INSTANCE;
    
    System.out.println("----------- The Stark Wolves -------------");
    displayName(starkWolves.getIterator());
    System.out.println("------- The Army of White Walkers --------");
    displayName(army.getIterator());
    System.out.println("---------- The Daenerys Dragons ----------");
    displayName(instance.getIterator());
    
  }
  
  public static void displayName(Iterator iterator) {
    while (iterator.hasNext()) {
      Personage nextElement = (Personage)iterator.next();
      System.out.println(nextElement.getName());
    }
  }
}
