package f_map.a_sorted_maps;

import java.util.Iterator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @note A class to demonstrate how to iterate a sorted map
 * @author David Kariuki
 * @since 07/02/2023
 */
public class IteratingSortedMap {

  /**
   * Main Method
   *
   * @param args - String array
   */
  @SuppressWarnings("WhileLoopReplaceableByForEach")
  public static void main(String[] args) {

    SortedMap<String, String> sortedMap = new TreeMap<>();
    sortedMap.put("a", "one");
    sortedMap.put("b", "two");
    sortedMap.put("c", "three");

    Iterator<String> ascendingIterator = sortedMap.keySet().iterator();

    while (ascendingIterator.hasNext()) {
      String key = ascendingIterator.next();
      String value = sortedMap.get(key);
      System.out.printf("%s %s %n", key, value);
    }
  }
}
