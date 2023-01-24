/**
 * @note Spliterator example class
 * @author David Kariuki
 * @since 12/01/2023
 */
package b_iterable;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {


    public static void main(String[] args) {

        // Create list
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");

        Spliterator<String> spliteratorExample = list.spliterator(); // Get list spliterator

        spliteratorExample.forEachRemaining(System.out::println); // Iterate Spliterator
    }
}
