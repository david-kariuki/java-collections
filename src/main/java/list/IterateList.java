package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @note Class to illustrate how to loop a list
 * @author David Kariuki
 * @since 24/01/2023
 */
public class IterateList {

  /**
   * Main Method
   *
   * @param args - String array
   */
  @SuppressWarnings({"WhileLoopReplaceableByForEach", "ForLoopReplaceableByForEach"})
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    Collections.addAll(list, "first", "second", "third");

    System.out.println("\n\nUsing iterator");
    Iterator<String> listIterator = list.iterator();
    while (listIterator.hasNext()) {
      System.out.println(listIterator.next());
    }

    System.out.println("\n\nUsing for each");
    for (String element : list) {
      System.out.println(element);
    }

    System.out.println("\n\nUsing for loop");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }

    System.out.println("\n\nUsing streams");
    Stream<String> stream = list.stream();
    stream.forEach(System.out::println);
  }
}
