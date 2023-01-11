# Java Iterator

The `Java Iterable` interface represents a collection of objects which is `iterable` - meaning which can be `iterated`.
This means, that a class that implements the Java Iterable interface can have its elements iterated.
You can iterate the objects of a Java Iterable in three ways: Via the `,` by obtaining a Java Iterator from the
Iterable,
or by calling the Java Iterable `forEach()` method.

<br>

### Iterable Interface Definition

The Java Iterable interface has three methods of which only one needs to be implemented.
The other two have default implementations. Here is the the definition of the Iterable interface:

    public interface Iterable<T> {

        Iterator<T>    iterator();

        Spliterator<T> spliterator();

        void           forEach(Consumer<? super T> action);

    }

The method you must implement is named `iterator()`. This method must return a Java Iterator which can be used to
iterate the elements of the object implementing the Iterable interface.

Obtaining the Iterator happens behind the scenes, so you don't see that done. The Java compiler takes care of generating
the code for that, when you use a Iterable with the `for-each` loop.

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



<br>
### Reference 

Java Collections by `Jakob Jenkov`
<br>[Website](https://jenkov.com/tutorials/java-collections)
<br>[Iterable Topic Page](https://jenkov.com/tutorials/java-collections/iterable.html)