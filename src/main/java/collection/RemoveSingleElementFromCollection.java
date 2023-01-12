package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author David Kariuki
 * @note Class to demonstrate how to remove an element from a collection
 * @since 12/01/2023
 */

public class RemoveSingleElementFromCollection {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {


        String element1 = "Element 1";
        String element2 = "Element 2";

        Set<String> elementsSet = new HashSet<>();
        elementsSet.add(element1);
        elementsSet.add(element2);

        Collection<String> collection = new HashSet<>();

        boolean collectionChanged = collection.addAll(elementsSet);

        System.out.printf("Collection Changed %s%n", collectionChanged);

        collection.forEach(System.out::println); // Iterate collection printing out elements

        collection.remove(element2); // Remove single element

        System.out.println("\nElements after removal");
        collection.forEach(System.out::println); // Iterate collection printing out elements
    }
}
