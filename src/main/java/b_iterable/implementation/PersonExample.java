/**
 * @note An instance of {@link b_iterable.implementation.Persons Person} can be used with the Java
 *     for-each loop like below:
 * @author David Kariuki
 * @since 11/01/2023
 */
package b_iterable.implementation;

import pojo.Person;

public class PersonExample {

    /**
     * Main Method
     *
     * @param args - String array
     */
    public static void main(String[] args) {

        Persons persons = new Persons();
        persons.add(new Person("David Kariuki", "22,10,1997", Person.Gender.MALE));
        persons.add(new Person("John Doe", "02,02,1920", Person.Gender.MALE));
        persons.add(new Person("Jane Doe", "03,03,1930", Person.Gender.FEMALE));

        // Iterate Persons
        for (Person person : persons) {
            System.out.println(person.toString());
        }
    }
}
