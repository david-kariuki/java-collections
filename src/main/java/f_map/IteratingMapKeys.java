package f_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @note A class to demonstrate how nto iterate map keys
 * @author David Kariuki
 * @since 07/02/2023
 */
@SuppressWarnings("ALL")
public class IteratingMapKeys {

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
    Iterator<String> keyIterator = map.keySet().iterator();

    System.out.println("Using iterator");
    while (keyIterator.hasNext()) {
      String key = keyIterator.next();
      String value = map.get(key);
      System.out.printf("key %s, value %s%n", key, value);
    }
    System.out.println();

    System.out.println("Using for each loop");
    // Using for each llop
    for (String key : map.keySet()) {
      String value = map.get(key);
      System.out.printf("key %s, value %s%n", key, value);
    }
    System.out.println();

    System.out.println("Using stream");
    map.keySet().stream()
        .forEach(
            key -> {
              String value = map.get(key);
              System.out.printf("key %s, value %s%n", key, value);
            });
    System.out.println();
  }
}
