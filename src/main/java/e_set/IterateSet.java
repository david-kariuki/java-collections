package e_set;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @note A class to demonstrate how to iterate over elements of a Set
 * @author David Kariuki
 * @since 24/01/2023
 */
public class IterateSet {

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

    System.out.println("\n\nUsing iterator");
    Iterator<String> listIterator = elementsSet.iterator();
    while (listIterator.hasNext()) {
      System.out.println(listIterator.next());
    }

    System.out.println("\n\nUsing for each");
    for (String element : elementsSet) {
      System.out.println(element);
    }

    System.out.println("\n\nUsing streams");
    Stream<String> stream = elementsSet.stream();
    stream.forEach(System.out::println);
  }
}
