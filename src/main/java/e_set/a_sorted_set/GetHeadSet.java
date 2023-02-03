package e_set.a_sorted_set;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @note A class to demonstrate how to implement a TreeSet
 * @author David Kariuki
 * @since 01/02/2023
 */
public class GetHeadSet {

  /**
   * Main Method
   *
   * @param args - String array
   */
  @SuppressWarnings("WhileLoopReplaceableByForEach")
  public static void main(String[] args) {

    SortedSet<String> sortedSet = new TreeSet<>();
    Collections.addAll(sortedSet, "a", "b", "c", "d", "e", "f");

    SortedSet<String> headSet = sortedSet.headSet("d"); // Get head-set
    Iterator<String> headSetIterator = headSet.iterator(); // Get iterator

    // Loop iterator
    while (headSetIterator.hasNext()) {
      String element = headSetIterator.next();
      System.out.println(element);
    }
  }
}
