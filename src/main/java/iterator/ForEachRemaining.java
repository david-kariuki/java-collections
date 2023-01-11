/**
 * @note The Java Iterator forEachRemaining() method can iterate over all the elements remaining in the Iterator
 * internally, and for each element call a Java Lambda Expression passed as parameter to forEachRemaining() .
 * Here is an example of using the Java Iterator forEachRemaining() method:
 * @author David Kariuki
 * @since 11/01/2023
 */

package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachRemaining {

    /**
     * Main Method
     *
     * @param args - String array
     */
    @SuppressWarnings("Convert2MethodRef")
    public static void main(String[] args) {

        // Create a list of names
        List<String> namesList = new ArrayList<>();
        namesList.add("David");
        namesList.add("Kariuki");
        namesList.add("Kamau");

        Iterator<String> namesListIterator = namesList.iterator(); // Get list iterator

        // Call forEachRemaining() method on iterator
        namesListIterator.forEachRemaining((element) -> System.out.println(element));
    }
}
