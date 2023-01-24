package c_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * @author David Kariuki
 * @note Class to demonstrate how to retain all elements from a collection in another collection
 * @since 12/01/2023
 */

public class RetainAllElementsFromACollectionInAnotherCollection {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {

        Collection<String> collectionA = new ArrayList<>();
        Collection<String> collectionB = new ArrayList<>();

        collectionA.add("A");
        collectionA.add("B");
        collectionA.add("C");

        collectionB.add("1");
        collectionB.add("2");
        collectionB.add("3");


        Collection<String> targetCollection = new HashSet<>(); // Create collection from a Set
        targetCollection.addAll(collectionA); // Target now contains [A,B,C]
        targetCollection.addAll(collectionB); // Target now contains [A,B,C,1,2,3]

        targetCollection.forEach(System.out::println);

        targetCollection.retainAll(collectionB); // Retain collectionB

        System.out.println("After retainAll() -> collectionB ");

        targetCollection.forEach(System.out::println); // Traverse collection

    }
}
