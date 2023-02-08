package f_map.a_sorted_maps;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @note A class to demonstrate how to implement and use a sorted map
 * @author David Kariuki
 * @since 07/02/2023
 */
public class SortedMapMethods {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    // Create Comparator to sort the map
    Comparator<String> comparator = Comparator.naturalOrder();

    SortedMap<String, String> sortedMap = new TreeMap<>(comparator);
  }
}
