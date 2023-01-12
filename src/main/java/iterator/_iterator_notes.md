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

### Obtaining an Iterator

Most often that is how you will interact with an Iterator by obtaining it from some Java object that contains multiple
nested objects. The standard Java collection interface Collection contains a method called iterator().
By calling iterator() you can obtain an iterator from the given Collection.

You can also obtain an Iterator from many of the Java Collection data structures, e.g. a List, Set, Map, Queue, Deque
or Map. Here are a few examples of obtaining a Java Iterator from various Java collection types:

    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");
    
    Iterator<String> iterator = list.iterator();

    Set<String> set = new HashSet<>();
    set.add("one");
    set.add("two");
    set.add("three");
    
    Iterator<String> iterator2 = set.iterator();

### Iterating an Iterator

You iterate the objects in an Iterator using a while loop. Here is an example of iterating the elements of a Java
Iterator using a while loop:

    Iterator iterator = list.iterator();
    
    while(iterator.hasNext()) {
    Object nextObject = iterator.next();
    
    }

There are two methods to pay attention to in the above Java example. The first method is the Iterator hasNext() method
which returns true if the Iterator contains more elements. In other words, if the Iterator has not yet iterated over
all the elements in the collection the Iterator was obtained from - the hasNext() method will return true. If the
Iterator has iterated over all elements in the underlying collection - the hasNext() method returns false.

The second method to pay attention to is the next() method. The next() method returns the next element of the collection
the Iterator is iterating over.

### Iteration Order

The order in which the elements contained in a Java Iterator are traversed depends on the object that supplies the
Iterator. For instance, an iterator obtained from a List will iterate through the elements of that List in the same
order the elements are stored internally in the List.

An Iterator obtained from a Set, on the other hand, does not make any guarantees about the exact sequence the elements
in the Set are iterated in.

### Java List Iterator

Here is an example of obtaining a Java Set Iterator from a List instance:

    List list = new ArrayList();
    
    list.add("123");
    list.add("456");
    list.add("789");
    
    Iterator iterator = list.iterator();

### Java Set Iterator

Here is an example of obtaining a Java Set Iterator from a Set instance:

    Set set = new HashSet();
    
    set.add("123");
    set.add("456");
    set.add("789");
    
    Iterator iterator = set.iterator();

### Modification During Iteration

Some collections do not allow you to modify the collection while you are iterating it via an Iterator. In that case you
will get a ConcurrentModificationException the next time you call the Iterator next() method.

The following example results in a ConcurrentModificationException when executed:

    List<String> list = new ArrayList<>();
    
    list.add("123");
    list.add("456");
    list.add("789");
    
    Iterator<String> iterator = list.iterator();
    
    while(iterator.hasNext()) {
    String value = iterator.next();
    
        if(value.equals("456")){
            list.add("999");
        }
    }

The ConcurrentModificationException is thrown because the Iterator gets out of sync with the collection, if you modify
the collection while iterating it via the Iterator.

### Remove Elements During Iteration

The Java Iterator interface has a remove() method which lets you remove the element just returned by next() from the
underlying collection. Calling remove() does not cause a ConcurrentModificationException to be thrown. Here is an
example of removing an element from a collection during iteration of its Iterator:

    List<String> list = new ArrayList<>();
    
    list.add("123");
    list.add("456");
    list.add("789");
    
    Iterator<String> iterator = list.iterator();
    
    while(iterator.hasNext()) {
    String value = iterator.next();
    
        if(value.equals("456")){
            iterator.remove();
        }
    }

### `forEachRemaining()`

The Java Iterator forEachRemaining() method can iterate over all the elements remaining in the Iterator internally,
and for each element call a Java Lambda Expression passed as parameter to `forEachRemaining()`.

Here is an example of using the Java Iterator forEachRemaining() method:

    List<String> list = new ArrayList<>();
    list.add("Jane");
    list.add("Heidi");
    list.add("Hannah");
    
    Iterator<String> iterator = list.iterator();
    
    iterator.forEachRemaining((element) -> {
    System.out.println(element);
    });

### ListIterator

Java also contains an interface called ListIterator which extends the Iterator interface. The Java ListIterator
interface which represents a bi-directional iterator - meaning an iterator where you can navigate the elements both
forward and backwards. I won't cover the ListIterator interface in detail here, but I will show you a quick example
of how it can be used:

    List<String> list = new ArrayList<>();
    list.add("Jane");
    list.add("Heidi");
    list.add("Hannah");
    
    ListIterator<String> listIterator = list.listIterator();
    
    while(listIterator.hasNext()) {
        System.out.println(listIterator.next());
    }
    
    while(listIterator.hasPrevious()) {
        System.out.println(listIterator.previous());
    }

As you can see, the example first iterates the ListIterator forward through all the elements, and then backwards again
through all the elements back to the first element.

### Implement the Iterator Interface in Your Own Class

If you have a special, custom-made type of collection, you can implement the Java Iterator interface yourself to create
an Iterator that can iterate through the elements of your custom collection. In this section I will show you a super
simple custom implementation of the Java Iterator interface that will give you an impression of how implementing the
Iterator interface yourself looks.

The collection I will implement an Iterator for is a standard Java List . It won't be a fully perfect implementation as
it will not be able to detect changes to the contents of the List during iteration, but it is enough to give you an
idea about how an Iterator implementation could look. Here it is:

    import java.util.Iterator;
    import java.util.List;
    
    public class ListIterator <T> implements Iterator<T> {
    
        private List<T> source = null;
        private int index = 0;
    
        public ListIterator(List<T> source){
            this.source = source;
        }
    
    
        @Override
        public boolean hasNext() {
            return this.index < this.source.size();
        }
    
        @Override
        public T next() {
            return this.source.get(this.index++);
        }
    
    }

Here is an example of how it looks during iteration of the above ListIterator:

    import java.util.ArrayList;
    import java.util.List;
    
    public class ListIteratorExample {
    
        public static void main(String[] args) {
            List<String> list = new ArrayList();
    
            list.add("one");
            list.add("two");
            list.add("three");
    
            ListIterator<String> iterator = new ListIterator<>(list);
            while(iterator.hasNext()) {
                System.out.println( iterator.next() );
            }
    
        }
    }

<br>

### Reference 

Java Collections by `Jakob Jenkov`
<br>[Website](https://jenkov.com/tutorials/java-collections)
<br>[Iterator Topic Page](https://jenkov.com/tutorials/java-collections/iterator.html)