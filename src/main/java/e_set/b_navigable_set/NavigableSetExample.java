package e_set.b_navigable_set;

import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * @note A class to demonstrate how to implement a NavigableSet
 * @author David Kariuki
 * @since 06/02/2023
 */
public class NavigableSetExample {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    NavigableSet<Integer> originalNavigableSet = new TreeSet<>();
    Collections.addAll(originalNavigableSet, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    NavigableSet<Integer> reversedNavigableSet = originalNavigableSet.descendingSet();

    Iterator<Integer> reversedIterator = originalNavigableSet.descendingIterator();
  }
}
