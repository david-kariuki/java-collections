package e_set.a_sorted_set;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @note A class to demonstrate how to implement a TreeSet
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

    Comparator<String> comparator = String::compareTo;

    TreeSet<String> treeSet = new TreeSet<>(comparator);
    treeSet.add("One");
    treeSet.add("Two");
    treeSet.add("Three");

    Iterator<String> ascendingIterator = treeSet.iterator();
    Iterator<String> descendingIterator = treeSet.descendingIterator();

    System.out.println("Ascending iterator");
    while (ascendingIterator.hasNext()) {
      String element = ascendingIterator.next();
      System.out.println(element);
    }

    System.out.println("Descending iterator");
    while (descendingIterator.hasNext()) {
      String element = ascendingIterator.next();
      System.out.println(element);
    }
  }
}
