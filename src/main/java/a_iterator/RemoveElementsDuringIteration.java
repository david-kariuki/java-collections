/**
 * @note The Java Iterator interface has a remove() method which lets you remove the element just
 *     returned by next() from the underlying collection. Calling remove() does not cause a
 *     ConcurrentModificationException to be thrown.
 * @note Here is an example of removing an element from a collection during iteration of its
 *     Iterator:
 * @author David Kariuki
 * @since 11/01/2023
 */
package a_iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveElementsDuringIteration {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {

        // Create List
        java.util.List<Integer> numberList = new ArrayList<>();
        numberList.add(123);
        numberList.add(456);
        numberList.add(789);
        numberList.add(911);
        numberList.add(912);
        numberList.add(913);

        Iterator<Integer> numberListIterator = numberList.iterator(); // Get lists' iterator

        // Iterate iterator
        while (numberListIterator.hasNext()) {

            Integer value = numberListIterator.next();
            int target = 456;
            if (value.equals(target)) {

                System.out.println("Removing : " + target);
                numberListIterator.remove();
            }
        }
    }
}