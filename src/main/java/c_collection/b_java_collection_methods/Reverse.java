package c_collection.b_java_collection_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @note Class to demonstrate the reverse() collection method
 * @note The Collections reverse() method can reverse the elements in a Java List.
 * @author David Kariuki
 * @since 16/01/2023
 */
public class Reverse {

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

    System.out.println("List before reversing\n");
    list.forEach(System.out::println);

    Collections.reverse(list); // Reverse list

    System.out.println("\nList after reversing\n");
    list.forEach(System.out::println);
  }
}
