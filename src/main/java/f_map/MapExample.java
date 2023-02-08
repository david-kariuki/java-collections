package f_map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @note A class to demonstrate how to implement and use the map interface
 * @author David Kariuki
 * @since 06/02/2023
 */
@SuppressWarnings({
  "rawtypes",
  "unchecked",
  "MismatchedQueryAndUpdateOfCollection",
  "RedundantOperationOnEmptyContainer"
})
public class MapExample {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    Map mapA = new HashMap();
    Map mapB = new TreeMap();

    mapA.put(1, 1); // The key and value will be auto-boxed to Integer object

    Map<String, Object> objectsMap = new HashMap<>(0);
    objectsMap.put("name", "David Kariuki");
    objectsMap.put("dob", "22/10/1997");
    objectsMap.put("gender", "Male");

    System.out.println(objectsMap.getOrDefault("name", "John Doe"));

    for (Object object : objectsMap.values()) {
      System.out.println(object);
    }
    System.out.println();

    for (String key : objectsMap.keySet()) {
      Object object = objectsMap.get(key);
      System.out.println(object);
    }
    System.out.println();

    Map<String, String> mapWithNull = new HashMap<>(0);
    mapA.put(null, "Value for null key");

    String valueOfNull = mapWithNull.get(null);
    System.out.println("valueOfNull : " + valueOfNull);
    System.out.println();
  }
}
