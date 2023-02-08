package e_set.a_sorted_set;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @note A class to demonstrate how to get a subset from a Set
 * @author David Kariuki
 * @since 01/02/2023
 */
public class GetSubSet {

  /**
   * Main Method
   *
   * @param args - String array
   */
  @SuppressWarnings("WhileLoopReplaceableByForEach")
  public static void main(String[] args) {

    SortedSet<String> sortedSet = new TreeSet<>();
    Collections.addAll(sortedSet, "a", "b", "c", "d", "e", "f");

    SortedSet<String> subSet = sortedSet.subSet("a", "d"); // Get subset
    Iterator<String> headSetIterator = subSet.iterator(); // Get iterator

    // Loop iterator
    while (headSetIterator.hasNext()) {
      String element = headSetIterator.next();
      System.out.println(element);
    }
  }
}
