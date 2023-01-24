package c_collection.b_java_collection_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @note Class to demonstrate the shuffle() collection method
 * @note The Collections shuffle() method can shuffle the elements of a List.
 * @author David Kariuki
 * @since 17/01/2023
 */
public class Shuffle {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");

    System.out.println("List before shuffling\n");
    list.forEach(System.out::println);

    Collections.shuffle(list); // Shuffle list

    System.out.println("\nList after shuffling\n");
    list.forEach(System.out::println);
  }
}
