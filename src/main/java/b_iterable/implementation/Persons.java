/**
 * @note This is an example class to demonstrate the implementation of the Iterable interface
 * @author David Kariuki
 * @since 11/01/2023
 */
package b_iterable.implementation;

import pojo.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Persons implements Iterable<Person> {

    private final List<Person> persons = new ArrayList<>();

    /**
     * Iterator method
     *
     * @return Iterator<Person>
     */
    public Iterator<Person> iterator() {
        return this.persons.iterator();
    }

    /**
     * Method to add to list
     *
     * @param person - Person
     */
    public void add(Person person) {
        this.persons.add(person); // Add to list
    }
}
