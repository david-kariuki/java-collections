/**
 * @note This example first creates a new List and adds 3 elements to it.
 * Then it uses a for-each loop to iterate the elements of the List, and print out the toString() value of each element.
 * @author David Kariuki
 * @since 11/01/2023
 */

package iterable;

import java.util.ArrayList;
import java.util.List;

public class IterateViaForEachLoop {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // Create list

        // Add to List
        list.add("one");
        list.add("two");
        list.add("three");

        // Iterate list
        for (String element : list) {
            System.out.println(element);
        }
    }
}
