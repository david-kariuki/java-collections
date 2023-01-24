/**
 * @note You can iterate the elements of a Java Iterable via its forEach() method. The forEach()
 *     method takes a Java Lambda Expression as parameter. This lambda expression is called once for
 *     each element in the Iterable.
 * @author David Kariuki
 * @since 11/01/2023
 */
package b_iterable;

import java.util.ArrayList;
import java.util.List;

public class IterateViaItsForEachMethod {

    /**
     * Main Method
     *
     * @param args - String array
     */
    @SuppressWarnings("Convert2MethodRef")
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); // Create list

        // Add to List
        list.add("one");
        list.add("two");
        list.add("three");

        // Iterate List
        list.forEach(element -> System.out.println(element));
    }
}
