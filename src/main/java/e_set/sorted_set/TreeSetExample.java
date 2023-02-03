package e_set.sorted_set;

import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @note A class to demonstrate how to implement a TreeSet
 * @author David Kariuki
 * @since 01/02/2023
 */
public class TreeSetExample {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    SortedSet<String> sortedSet = new TreeSet<>();
    sortedSet.add("One");
    sortedSet.add("Two");
    sortedSet.add("Three");
  }
}
