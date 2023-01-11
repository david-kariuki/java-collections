/**
 * @note This class demonstrates how to get iterator from a collection and loop it
 * @author David Kariuki
 * @since 11/01/2023
 */


package iterator;

import java.util.*;

@SuppressWarnings("WhileLoopReplaceableByForEach")
public class GetAndLoopIterator {


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

        Iterator<String> stringsListIterator = stringsList.iterator(); // Get lists' iterator

        // Iterate iterator
        while (stringsListIterator.hasNext()) {
            System.out.println(stringsListIterator.next());
        }


        // Create Set
        Set<String> stringsSet = new HashSet<>();
        stringsSet.add("Set Item One");
        stringsSet.add("Set Item Two");
        stringsSet.add("Set Item Three");

        // Get set iterator
        Iterator<String> stringsSetIterator = stringsSet.iterator(); // Get set iterator

        System.out.println(); // Separate outputs with a single line

        // Iterate iterator
        while (stringsSetIterator.hasNext()) {
            System.out.println(stringsSetIterator.next());
        }
    }
}
