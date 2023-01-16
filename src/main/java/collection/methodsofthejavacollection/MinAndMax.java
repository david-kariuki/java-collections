package collection.methodsofthejavacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @note Class to demonstrate the min() collection method
 * @note The Collections min() method can find the minimum element in a List according to the
 *     natural ordering of the elements.
 * @author David Kariuki
 * @since 17/01/2023
 */
public class MinAndMax {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    List<String> source = new ArrayList<>(3);
    source.add("1");
    source.add("2");
    source.add("3");

    String min = Collections.min(source); // Get min value
    String max = Collections.max(source); // Get max value

    System.out.println("The min value is : " + min);
    System.out.println("The max value is : " + max);
  }
}
