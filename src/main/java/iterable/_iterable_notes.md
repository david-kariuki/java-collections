# Java Iterator

The `Java Iterable` interface represents a collection of objects which is `iterable` - meaning which can be `iterated`.
This means, that a class that implements the Java Iterable interface can have its elements iterated.
You can iterate the objects of a Java Iterable in three ways: Via the `,` by obtaining a Java Iterator from the
Iterable,
or by calling the Java Iterable `forEach()` method.

<br>

### Iterate an Iterable With the for-each Loop

The first way to iterate the elements of a Java Iterable is via the Java for-each loop.
Below is an example showing how to iterate the elements of a Java List via the Java for-each loop.
Since the Java List interface extends the Collection interface, and the Collection interface extends the Iterable
interface, a List object can be used with the for-each loop.

    List<String> list = new ArrayList><();
    
    list.add("one");
    list.add("two");
    list.add("three");
    
    for( String element : list ){
        System.out.println( element.toString() );
    }

This example first creates a new List and adds 3 elements to it. Then it uses a for-each loop to iterate the elements
of the List, and print out the toString() value of each element.

### Iterate an Iterable via an Iterator

The second way you can iterate the elements of a Java Iterable is by obtaining a Java Iterator from it by calling the
Iterable iterator() method. You can then iterate through that Iterator like you would with any other Iterator. You can
read more about the Java Iterator in my Java Iterator tutorial . Here is an example of iterating the elements of a Java
Iterable (a Java List in this example):

    List<String> list = new ArrayList><();
    
    list.add("one");
    list.add("two");
    list.add("three");
    
    Iterator<String> iterator = list.iterator();
    
    while(iterator.hasNext()) {
        String element = iterator.next();
        System.out.println( element );
    }

### Iterate an Iterable via its forEach() Method

The third way to iterate the elements of a Java Iterable is via its forEach() method. The forEach() method takes a Java
Lambda Expression as parameter. This lambda expression is called once for each element in the Iterable. Here is an
example of iterating the elements of an Iterable via its forEach() method:

    List<String> list = new ArrayList><();
    
    list.add("one");
    list.add("two");
    list.add("three");
    
    list.forEach( (element) -> {
        System.out.println( element );
    });

### Iterable Interface Definition

The Java Iterable interface has three methods of which only one needs to be implemented.
The other two have default implementations. Here is the the definition of the Iterable interface:

    public interface Iterable<T> {

        Iterator<T>    iterator();

        Spliterator<T> spliteratorExample();

        void           forEach(Consumer<? super T> action);

    }

The method you must implement is named `iterator()`. This method must return a Java Iterator which can be used to
iterate the elements of the object implementing the Iterable interface.

Obtaining the Iterator happens behind the scenes, so you don't see that done. The Java compiler takes care of generating
the code for that, when you use an Iterable with the `for-each` loop.

### Implementations of Iterable in Java

The Java Iterable interface (java.lang.Iterable) is one of the root interfaces of the Java Collections API. Therefore,
there are several classes in Java that implements the Java Iterable interface. These classes can thus have their
internal elements iterated.

There are also several Java interfaces that extends the Iterable interface. Classes implementing an interface which
extends the Iterable interface thus also implement the Iterable interface. Such classes can also have their elements
iterated.

The Collection interface extends Iterable, so all subtypes of Collection also implement the Iterable interface.
For instance, both the Java List and Set interfaces extend the Collection interface, and thereby also the Iterable
interface.

### Implementing the Iterable Interface

How you implement this Iterable interface so that you can use it with the for-each loop, is explained in the text
Implementing the Iterable Interface, in my Java Generics tutorial.

    public class Persons implements Iterable {
    private List<Person> persons = new ArrayList<Person>();
    
        public Iterator<Person> iterator() {
            return this.persons.iterator();
        }
    }

An instance of Persons can be used with the Java for-each loop like this:

    Persons persons = ... //obtain Persons instance with Person objects inside.
    
    for(Person person : persons) {
        // do something with person object.
    }

### Obtaining a Spliterator

You can obtain a Java Spliterator from a Java Iterable via its spliterator() method. I won't go into the Spliterator
interface here - just show how to obtain a Spliterator from an Iterable:

    List<String> list = new ArrayList><();
    
    list.add("one");
    list.add("two");
    list.add("three");
    
    Spliterator<String> spliterator = list.spliterator();

### Iterable Performance

If you are writing some code that needs to iterate a collection lots of times in a tight loop, let's say iterate a Java
List thousands of times per second, iterating the List via the Java for-each loop is slower than iterating the list via
a standard for-loop.

    for(int i=0; i<list.size(); i++) {
        Object obj = list.get(i);
    }

The reason the for-each loop is slower is, that each iteration will call the List iterator() method, which will create a
new Iterator object. Creating a new object thousands, perhaps even millions of times per second does have a small
performance penalty compared to just iterating the List using a standard for-loop.



<br>
### Reference 

Java Collections by `Jakob Jenkov`
<br>[Website](https://jenkov.com/tutorials/java-collections)
<br>[Iterable Topic Page](https://jenkov.com/tutorials/java-collections/iterable.html)