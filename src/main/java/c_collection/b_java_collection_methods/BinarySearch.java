package c_collection.b_java_collection_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @note Class to demonstrate the binarySearch() collection method
 * @note The Collections binarySearch() method can search a Java List for an element using a binary
 *     search algorithm. The List must be sorted in ascending order before you search it using
 *     binarySearch() .
 * @author David Kariuki
 * @since 16/01/2023
 */
public class BinarySearch {

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
    list.add("five");

    Collections.sort(list); // Sort list

    list.forEach(System.out::println); // Iterate list

    int index = Collections.binarySearch(list, "four");

    System.out.println(index);
  }
}
