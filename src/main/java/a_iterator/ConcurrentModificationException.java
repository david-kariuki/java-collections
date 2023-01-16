/**
 * @note Some collections do not allow you to modify the collection while you are iterating it via
 *     an Iterator. In that case you will get a ConcurrentModificationException the next time you
 *     call the Iterator next() method. The following example results in a
 *     ConcurrentModificationException when executed:
 * @author David Kariuki
 * @since 11/01/2023
 */
package a_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings({"WhileLoopReplaceableByForEach"})
public class ConcurrentModificationException {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {

        // Create List
        List<Integer> numberList = new ArrayList<>();
        numberList.add(123);
        numberList.add(456);
        numberList.add(789);

        Iterator<Integer> numberListIterator = numberList.iterator(); // Get lists' iterator

        // Iterate iterator
        while (numberListIterator.hasNext()) {

            Integer value = numberListIterator.next();

            if (value.equals(456)) {
                numberList.add(111);
            }
        }
    }
}
