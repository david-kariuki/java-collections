package c_collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author David Kariuki
 * @note Class to demonstrate how to multiple element to a collection
 * @since 12/01/2023
 */

public class AddCollectionOfElementsToCollection {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {

        Set<String> namesSet = new HashSet<>(); // create Set
        namesSet.add("David");
        namesSet.add("Kariuki");
        namesSet.add("Kamau");

        Collection<String> collection = new HashSet<>(); // Create a collection of Strings
        boolean collectionChanged = collection.addAll(namesSet);

        System.out.printf("Collection Changed %s%n", collectionChanged);
    }
}
