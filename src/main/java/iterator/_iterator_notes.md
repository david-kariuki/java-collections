# Java Iterator

The `Java Iterator` interface represents an object capable of iterating through a collection of Java objects, one object
at a time.

> The Iterator interface is one of the oldest mechanisms in Java for iterating collections of objects (although not the
> oldest - Enumerator predated Iterator).

To use a `Java Iterator` you will have to obtain an Iterator instance from the collection of objects you want to iterate
over.
The obtained Iterator keeps track of the elements in the underlying collection to make sure you iterate through all of
them.
If you modify the underlying collection while iterating through an Iterator pointing to that collection,
the Iterator will typically detect it, and throw an exception the next time you try to obtain the next element from the
Iterator.

# Java Iterator Core Methods

| Method | Description |
|-|-|
| hasNext() | Returns true if the Iterator has more elements, and false if not. |
| next() | Return the next element from the Iterator |
| remove() | Removes the latest element returned from next() from the Collection the Iterator is iterating over. |
| forEachRemaining() | Iterates over all remaining elements in the Iterator and calls a Java Lambda Expression passing
each remaining element as parameter to the lambda expression. |


<br>

### Reference 

Java Collections by `Jakob Jenkov`
<br>[Website](https://jenkov.com/tutorials/java-collections)
<br>[Iterator Topic Page](https://jenkov.com/tutorials/java-collections/iterator.html)