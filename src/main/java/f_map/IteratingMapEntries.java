package f_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @note A class to demonstrate how to iterate map entries(Both key and value)
 * @author David Kariuki
 * @since 07/02/2023
 */
@SuppressWarnings("ALL")
public class IteratingMapEntries {

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

    System.out.println("Using an entry iterator");
    for (Map.Entry<String, String> entry : map.entrySet()) {
      String key = entry.getKey();
      String value = entry.getValue();
    }
  }
}
