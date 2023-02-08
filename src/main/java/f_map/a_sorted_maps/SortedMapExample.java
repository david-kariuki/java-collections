package f_map.a_sorted_maps;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @note A class to demonstrate how to implement and use a sorted map
 * @author David Kariuki
 * @since 07/02/2023
 */
public class SortedMapExample {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    // Create Comparator to sort the map
    Comparator<String> comparator = Comparator.naturalOrder();

    SortedMap<String, String> sortedMap = new TreeMap<>(comparator);
    sortedMap.put("a", "1");
    sortedMap.put("c", "3");
    sortedMap.put("e", "5");
    sortedMap.put("d", "4");
    sortedMap.put("b", "2");

    sortedMap.entrySet().forEach(System.out::println);

    String firstKey = sortedMap.firstKey();
    String lastKey = sortedMap.lastKey();
    SortedMap<String, String> headMap = sortedMap.headMap("c");
    SortedMap<String, String> subMap = sortedMap.subMap("b", "e");
    SortedMap<String, String> tailMap = sortedMap.tailMap("c");
  }
}
