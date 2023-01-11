/**
 * @note You can iterate the elements of a Java Iterable by obtaining a Java Iterator from it by calling the Iterable
 * iterator() method. You can then iterate through that Iterator like you would with any other Iterator.
 * @author David Kariuki
 * @since 11/01/2023
 */

package iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("WhileLoopReplaceableByForEach")
public class IterateViaAnIterator {

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

        Iterator<String> listIterator = list.iterator(); // Get List Iterator

        // Iterate List iterator
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }
}
