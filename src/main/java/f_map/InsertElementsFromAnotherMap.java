package f_map;

import java.util.HashMap;
import java.util.Map;

/**
 * @note A class to demonstrate how to insert elements of one map into another
 * @author David Kariuki
 * @since 07/02/2023
 */
@SuppressWarnings({
  "rawtypes",
  "unchecked",
  "MismatchedQueryAndUpdateOfCollection",
  "RedundantOperationOnEmptyContainer"
})
public class InsertElementsFromAnotherMap {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    Map<String, String> firstMap = new HashMap<>(0);
    firstMap.put("name", "David Kariuki");
    firstMap.put("dob", "22/10/1997");
    firstMap.put("gender", "Male");

    Map<String, String> secondMap = new HashMap<>(0);
    secondMap.putAll(firstMap);
  }
}
