/**
 * @note CustomIterator implementation
 * @author David Kariuki
 * @see a_iterator.CustomListIterator
 * @since 11/01/2023
 */


package iterator;

import java.util.ArrayList;
import java.util.List;

public class CustomIteratorImplementation {


    /**
     * MAin Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {

        // Create List
        List<String> stringsList = new ArrayList<>();
        stringsList.add("List Item One");
        stringsList.add("List Item Two");
        stringsList.add("List Item Three");

        // Get lists' iterator using CustomIterator
        CustomListIterator<String> customStringsListIterator = new CustomListIterator<>(stringsList);

        // Iterate iterator
        while (customStringsListIterator.hasNext()) {
            System.out.println(customStringsListIterator.next());
        }

    }
}
