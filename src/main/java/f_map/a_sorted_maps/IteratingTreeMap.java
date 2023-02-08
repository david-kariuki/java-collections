package f_map.a_sorted_maps;

import java.util.Iterator;
import java.util.TreeMap;

/**
 * @note A class to demonstrate how to iterate a TreeMap using a descending iterator
 * @author David Kariuki
 * @since 07/02/2023
 */
public class IteratingTreeMap {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    TreeMap<String, String> treeMap = new TreeMap<>();
    treeMap.put("a", "one");
    treeMap.put("b", "two");
    treeMap.put("c", "three");

    Iterator<String> ascendingIterator = treeMap.keySet().iterator();
    Iterator<String> descendingIterator = treeMap.descendingKeySet().iterator();

    System.out.println("Looping ascending iterator");
    while (ascendingIterator.hasNext()) {
      String key = ascendingIterator.next();
      String value = treeMap.get(key);
      System.out.printf("%s %s %n", key, value);
    }

    System.out.println("\nLooping descending iterator");
    descendingIterator.forEachRemaining(
        key -> System.out.printf("%S %S %n", key, treeMap.get(key)));
  }
}
