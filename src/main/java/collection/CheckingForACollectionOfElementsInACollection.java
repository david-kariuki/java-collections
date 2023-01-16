package collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author David Kariuki
 * @note Class to demonstrate how to check for an element in a collection
 * @since 12/01/2023
 */

public class CheckingForACollectionOfElementsInACollection {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {

        Collection<String> collection = new HashSet<>();
        collection.add("David");
        collection.add("Kariuki");
        collection.add("Kamau");
        collection.add("Is");
        collection.add("Practicing");
        collection.add("Java");
        collection.add("Collections");
        collection.add("Today");

        // Target collection
        Collection<String> targetCollection = new HashSet<>();
        targetCollection.add("Java");
        targetCollection.add("Collections");
        targetCollection.add("Today");


        boolean containsTargetElements = collection.containsAll(targetCollection);
        System.out.println("Collection contains target elements : " + containsTargetElements);
    }
}
