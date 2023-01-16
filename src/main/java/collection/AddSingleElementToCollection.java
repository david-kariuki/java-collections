package collection;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author David Kariuki
 * @note Class to demonstrate how to add an element to a collection
 * @since 12/01/2023
 */

public class AddSingleElementToCollection {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {


        String anElement = "an element";
        Collection<String> collection = new HashSet<>();

        boolean collectionChanged = collection.add(anElement);

        System.out.printf("Collection Changed %s%n", collectionChanged);
    }
}
