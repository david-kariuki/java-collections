package e_set.a_sorted_set;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @note A class to demonstrate how to implement a TreeSet with comparator
 * @author David Kariuki
 * @since 01/02/2023
 */
public class TreeSetWithComparator {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    Comparator<Integer> comparator = Integer::compareTo;

    TreeSet<Integer> treeSet = new TreeSet<>(comparator);
    Collections.addAll(treeSet, 1, 2, 3, 4, 5);

    Iterator<Integer> ascendingIterator = treeSet.iterator();
    Iterator<Integer> descendingIterator = treeSet.descendingIterator();

    System.out.println("Ascending iterator");
    while (ascendingIterator.hasNext()) {
      Integer element = ascendingIterator.next();
      System.out.println(element);
    }

    System.out.println("Descending iterator");
    while (descendingIterator.hasNext()) {
      Integer element = descendingIterator.next();
      System.out.println(element);
    }
  }
}
