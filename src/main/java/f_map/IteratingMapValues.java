package f_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @note A class to demonstrate how to iterate map values
 * @author David Kariuki
 * @since 07/02/2023
 */
@SuppressWarnings("ALL")
public class IteratingMapValues {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    Map<String, String> map = new HashMap<>(0);
    map.put("name", "David Kariuki");
    map.put("dob", "22/10/1997");
    map.put("gender", "Male");

    // Using iterator
    Iterator<String> keyIterator = map.values().iterator();

    System.out.println("Using iterator");
    while (keyIterator.hasNext()) {
      String value = keyIterator.next();
      System.out.printf("Value %s%n", value);
    }
    System.out.println();

    System.out.println("Using for each loop");
    // Using for each llop
    for (String value : map.values()) {
      System.out.printf("Value %s%n", value);
    }
    System.out.println();

    System.out.println("Using stream");
    map.values().stream()
        .forEach(
            value -> {
              System.out.printf("Value %s%n", value);
            });
    System.out.println();
  }
}
