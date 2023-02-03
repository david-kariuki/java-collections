/**
 * @note A class to demonstrate setOf method
 * @author David Kariuki
 * @since 24/01/2023
 */
package e_set;

import java.util.Set;

public class SetOf {

  /**
   * Main Method
   *
   * @param args - String array
   */
  @SuppressWarnings("rawtypes")
  public static void main(String[] args) {

    Set set = Set.of();

    // Add to generic set using Set.of() method
    Set<String> genericSetOf = Set.of("Element 1", "Element 2");
  }
}
