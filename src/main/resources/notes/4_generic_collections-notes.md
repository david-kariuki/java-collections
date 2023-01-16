# Java Generic Collections

Generic Collection Example
When you set a generic type for a Java Collection, you do so when you declare the variable referencing it.
Here is an example of setting the generic type of `Collection` and `HashSet` to a Java `String` - meaning it can only
contain String instances:

    Collection<String> stringCollection = new HashSet<String>();

This `String` Collection can now only contain `String instances`. If you try to add anything else, or cast the elements
in the collection to any other type than String, the compiler will complain.

Actually, it is possible to insert other objects than String objects, if you cheat a little (or is just plain stupid),
but this is not recommended.

You can specify a generic type for a List's, Set's etc.

### Generic Iterator

When you have specified a generic type for a Java collection, that generic type also works for the Iterator returned by
the `iterator()` method. Here is an example of how obtaining an Iterator with a generic type set on it looks:

    Iterator<String> iterator = stringCollection.iterator();
    collection.add("Element 1");
    collection.add("Element 2");
    collection.add("Element 3");

You can iterate the elements of this Iterator like this:

    while(iterator.hasNext()) {
        String element = iterator.next();
        System.out.println(element);
    }

Notice how it is not necessary to cast the String returned from the `iterator.next()` method call. Because the Iterator
has its generic type set to String, the Java compiler already knows that `next()` will return a String.

### Generic Iteration Using for Loop

You can also iterate the above collection using the new `for-loop`, like this:

    Collection<String> collection = new HashSet<String>();
    
    for(String element : collection) {
        System.out.println(element);
    }

Notice how it is possible to specify the type of the variable of each element (stringElement) as String.
This is possible because the generic type of the Collection is set to String.


<br>

### Reference

Java Collections by `Jakob Jenkov`
<br>[Website](https://jenkov.com/)
<br>[Java Generic Collections Topic Page](https://jenkov.com/tutorials/java-collections/generic-collections.html)