package c_collection.b_java_collection_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @note Class to demonstrate the sort() collection method
 * @note The Collections sort() method can sort a Java List.
 * @author David Kariuki
 * @since 17/01/2023
 */
public class Sort {

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
    list.add("four");

    System.out.println("List before sorting\n");
    list.forEach(System.out::println);

    Collections.sort(list); // Sort list - Alphabetically

    System.out.println("\nList after sorting\n");
    list.forEach(System.out::println);
  }
}
