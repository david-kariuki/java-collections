/**
 * @note
 * @author David Kariuki
 * @since /01/2023
 */

package iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {

        // Create List
        List<String> namesList = new ArrayList<>();
        namesList.add("David");
        namesList.add("Kariuki");
        namesList.add("Kamau");

        ListIterator<String> namesListIteratorExample = namesList.listIterator(); // Get list's ListIterator

        // Iterate iterator forward
        while (namesListIteratorExample.hasNext()) {
            System.out.println(namesListIteratorExample.next());
        }

        System.out.println("\n\n"); // Add line separator

        // Iterate iterator backward
        while (namesListIteratorExample.hasPrevious()) {
            System.out.println(namesListIteratorExample.previous());
        }
    }
}
