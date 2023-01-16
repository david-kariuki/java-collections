package collection.methodsofthejavacollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * @note Class to demonstrate the unmodifiableSet() collection method
 * @note The unmodifiableSet() method in the Java Collections class can create
 * an immutable (unmodifiable) Set from a normal Java Set.
 * @author David Kariuki
 * @since 17/01/2023
 */
public class UnmodifiableSet {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    Set<String> normalSet = new HashSet<>();

    @SuppressWarnings("Java9CollectionFactory")
    Set<String> immutableSet = Collections.unmodifiableSet(normalSet);

    //noinspection ConstantConditions
    immutableSet.add("0"); // Add to HashSet - Should throw an exception
  }
}
