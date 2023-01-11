/**
 * @note This is an example class to demonstrate the implementation of the Iterable interface
 * @author David Kariuki
 * @since 11/01/2023
 */

package iterable.implementation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Person implements Iterable {

    private final List<Person> personList = new ArrayList<>();

    /**
     * Iterator method
     *
     * @return Iterator<PersonExample>
     */
    public Iterator<Person> iterator() {
        return this.personList.iterator();
    }
}
