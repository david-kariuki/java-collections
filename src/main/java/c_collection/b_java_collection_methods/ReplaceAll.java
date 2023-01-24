package c_collection.b_java_collection_methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @note Class to demonstrate the replaceAll() collection method
 * @note The Java Collections replaceAll() method can replace all occurrences of one element with
 *     another element.
 * @author David Kariuki
 * @since 17/01/2023
 */
public class ReplaceAll {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    List<String> source = new ArrayList<>(3);
    source.add("A");
    source.add("B");
    source.add("A");

    System.out.println("List before replacing\n");
    source.forEach(System.out::println);

    boolean replacedAny = Collections.replaceAll(source, "A", "C");

    System.out.println("\nList after replacing\n");
    source.forEach(System.out::println);
    System.out.println("\nList elements replaced : " + replacedAny);
  }
}
