package c_collection.b_java_collection_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @note Class to demonstrate the copy() collection method
 * @note The Collections copy() method can copy all elements of a List into another List.
 * @author David Kariuki
 * @since 16/01/2023
 */
public class Copy {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    List<String> source = new ArrayList<>();
    Collections.addAll(source, "e1", "e2", "e3");

    List<String> destination = new ArrayList<>();
    Collections.copy(destination, source);

    destination.forEach(System.out::println); // Iterate list
  }
}
