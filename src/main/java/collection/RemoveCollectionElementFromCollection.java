package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author David Kariuki
 * @note Class to demonstrate how to remove a collection of element from a collection
 * @since 12/01/2023
 */

public class RemoveCollectionElementFromCollection {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {


        String element1 = "Element 1";
        String element2 = "Element 2";
        String element3 = "Element 3";
        String element4 = "Element 4";
        String element5 = "Element 5";

        String[] stringArray = new String[]{element1, element2, element3, element4, element5};

        Collection<String> collection = new ArrayList<>(); // Create collection

        boolean collectionChanged = collection.addAll(List.of(stringArray));

        System.out.printf("Collection Changed %s%n", collectionChanged);

        collection.forEach(System.out::println); // Iterate collection printing out elements

        String[] stringsToRemove = new String[]{element1, element2, element3};
        collection.removeAll(List.of(stringsToRemove)); // Remove single element

        System.out.println("\nElements after removal");
        collection.forEach(System.out::println); // Iterate collection printing out elements
    }
}
