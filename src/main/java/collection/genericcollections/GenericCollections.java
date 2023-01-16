package collection.genericcollections;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @author David Kariuki
 * @note Class to demonstrate how to implement and loop generic collections
 * @since 12/01/2023
 */

public class GenericCollections {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {

        Collection<String> collection = new HashSet<>();
        collection.add("Element 1");
        collection.add("Element 2");
        collection.add("Element 3");

        iterateGenericCollectionUsingWhileLoop(collection); // Iterate collection using while loop
        iterateGenericCollectionUsingForLoop(collection); // Iterate collection using for loop
    }

    /**
     * Method to iterate collection using while loop
     *
     * @param collection - Collection<String>
     */
    private static void iterateGenericCollectionUsingWhileLoop(Collection<String> collection) {

        Iterator<String> iterator = collection.iterator(); // Get collection iterator

        // Loop using while loop
        //noinspection WhileLoopReplaceableByForEach
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
        System.out.println(); // Add blank line
    }

    /**
     * Method to iterate collection using for loop
     *
     * @param collection - Collection<String>
     */
    @SuppressWarnings("unused")
    private static void iterateGenericCollectionUsingForLoop(Collection<String> collection) {

        // Loop using for loop
        for (String element : collection) {
            System.out.println(element);
        }
        System.out.println(); // Add blank line
    }
}
