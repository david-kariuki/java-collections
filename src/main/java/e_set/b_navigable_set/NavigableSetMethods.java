package e_set.b_navigable_set;

import java.util.*;

/**
 * @note A class to demonstrate how to use a navigableSet Methods
 * @author David Kariuki
 * @since 06/02/2023
 */
public class NavigableSetMethods {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    // Create Navigable Set
    NavigableSet<Integer> originalNavigableSet = new TreeSet<>();
    Collections.addAll(originalNavigableSet, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
    NavigableSet<Integer> reversedNavigableSet = originalNavigableSet.descendingSet();

    // Get reversed iterator
    Iterator<Integer> reversedIterator = originalNavigableSet.descendingIterator();

    // Get HeadSet
    SortedSet<Integer> headSet = originalNavigableSet.headSet(3);
    headSet.forEach(System.out::println); // Iterate SortedSet
    System.out.println();

    // Get SubSet
    SortedSet<Integer> subSet = originalNavigableSet.subSet(0, 4);
    subSet.forEach(System.out::println); // Iterate SortedSet
    System.out.println();

    // Get TailSet
    SortedSet<Integer> tailSet = originalNavigableSet.tailSet(5);
    tailSet.forEach(System.out::println); // Iterate SortedSet
    System.out.println();

    // Get the smallest element greater or equal to target
    Integer ceiling = originalNavigableSet.ceiling(2);
    System.out.println("Ceiling of 2 : " + ceiling);
    System.out.println();

    // Get the greatest element that is less than or equal to target
    Integer floor = originalNavigableSet.floor(3);
    System.out.println("Floor of 3 : " + floor);
    System.out.println();

    // Get element in the set that is greater(Not equal to) the element
    // passed as a parameter
    Integer higher = originalNavigableSet.higher(4);
    System.out.println("Higher of 4 : " + higher);
    System.out.println();

    // Returns the highest element that is less than (not equal) to the given
    // parameter
    Integer lower = originalNavigableSet.lower(2);
    System.out.println("Lower of 2 : " + lower);
    System.out.println();

    // The pollFirst() method returns and removes the "first" element in the
    // NavigableSet or null if the set is empty. "First" means the smallest
    // element according to the sort order of the set.
    Integer first = originalNavigableSet.pollFirst();
    System.out.println("PollFirst in set : " + first);
    System.out.println();

    // The pollLast() method returns and removes the "last" element in the
    // NavigableSet. "Last" means largest according to the element sorting
    // order of the set.
    Integer last = originalNavigableSet.pollLast();
    System.out.println("PollLast in set : " + last);
    System.out.println();
  }
}
