package collection.methodsofthejavacollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @note Class to demonstrate the addAll() collection method
 * @note The Java Collections addAll() method can add a variable number of
 * elements to a Collection (typically either a List or a Set .
 * @author David Kariuki
 * @since 16/01/2023
 */

public class AddAll {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        Collections.addAll(list, "element 1", "element 2", "element 3");

        list.forEach(System.out::println); // Iterate list
    }
}
