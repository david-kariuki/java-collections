package c_collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author David Kariuki
 * @note Class to demonstrate how to check for an element in a collection
 * @since 12/01/2023
 */

public class CheckingForAnElementsInACollection {

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

        String targetElement = "David"; // Target element

        boolean containsElement = collection.contains(targetElement);
        System.out.println("Collection contains element " + containsElement);
    }
}
