package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author David Kariuki
 * @note Class to demonstrate how to iterate a collection
 * @note You can iterate all elements of a collection. This is done by obtaining a Java Iterator from the collection,
 * and iterate through that
 * You can iterate a collection using an iterator or by using a for-each loop
 * @see iterable.IterateViaAnIterator - Iterator
 * @see iterable.IterateViaForEachLoop - forEach loop
 * @since 12/01/2023
 */

@SuppressWarnings("WhileLoopReplaceableByForEach")
public class IterateACollection {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {

        Collection<String> collection1 = new HashSet<>();
        collection1.add("David");
        collection1.add("Kariuki");
        collection1.add("Kamau");


        // Method 1: Using Iterator
        Iterator<String> iterator = collection1.iterator(); // Get Collection Iterator

        // Iterate iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Method 2: Using forEachLoop
        Collection<String> collection2 = new HashSet<>();
        collection2.add("I am");
        collection2.add("Practicing");
        collection2.add("Java");
        collection2.add("Collections");
        collection2.add("Today");

        collection2.forEach(System.out::println); // Iterate collection using forEach loop
    }
}
