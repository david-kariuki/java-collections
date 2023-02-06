package e_set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @note A class to demonstrate how to add elements to a Set
 * @author David Kariuki
 * @since 24/01/2023
 */
public class AddElementsToSet {

  /**
   * Main Method
   *
   * @param args - String array
   */
  @SuppressWarnings("WhileLoopReplaceableByForEach")
  public static void main(String[] args) {

    Set<String> elementsSet = new HashSet<>();
    Collections.addAll(elementsSet, "element1", "element2", "element3");

    Iterator<String> elementsIterator = elementsSet.iterator();

    // Iterate iterator
    while (elementsIterator.hasNext()) {
      System.out.println(elementsIterator.next());
    }
    System.out.println();
    System.out.println();

    // Add All Elements From Another Collection
    Set<String> set1 = new HashSet<>();
    Set<String> set2 = new HashSet<>();
    Set<String> set3 = new HashSet<>();

    Collections.addAll(set1, "one", "two", "three");
    Collections.addAll(set2, "four", "five");

    set3.addAll(set1);
    set3.addAll(set2);

    // Iterate set
    set3.forEach(System.out::println);
  }
}
