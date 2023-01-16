# Java Collections methods

The Java Collections class, java.util.Collections, contains a long list of utility methods for working with collections
in Java.

### `addAll()`

The Java Collections `addAll()` method can add a variable number of elements to a Collection (typically either a
List or a Set . Here is a java code example of calling the Collections addAll() method:

    List<String> list = new ArrayList<>();
    Collections.addAll(list, "element 1", "element 2", "element 3");

### `binarySearch()`

The Collections `binarySearch()` method can search a Java List for an element using a binary search algorithm.
The List must be sorted in `ascending order` before you search it using `binarySearch()`.  
Here is an example of searching a List using the Collections binarySearch() method:

    List<String> list = new ArrayList<>();
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");
    list.add("five");
    
    Collections.sort(list);
    
    int index = Collections.binarySearch(list, "four");
    
    System.out.println(index);

### `copy()`

The Collections `copy()` method can copy all elements of a List into another List. Here is a Java example of calling the
Collections `copy()` method:

    List<String> source = new ArrayList<>();
    Collections.addAll(source, "e1", "e2", "e3");
    
    List<String> destination = new ArrayList<>();
    Collections.copy(destination, source);

### `reverse()`

The Collections `reverse()` method can reverse the elements in a Java List. Here is an example of reversing the
elements of a List:

    List>String< list = new ArrayList<String>();
    list.add("one");
    list.add("two");
    list.add("three");
    
    Collections.reverse(list);

After executing the above code, the sequence of the elements in the List will be three, two, one .

### `shuffle()`

The Collections `shuffle()` method can shuffle the elements of a List. Here is an example of shuffling a list with the
Collections `shuffle()` method:

    List>String< list = new ArrayList<String>();
    list.add("one");
    list.add("two");
    list.add("three");
    
    Collections.shuffle(list);

<br>

### Reference

Java Collections by `Jakob Jenkov`
<br>[Website](https://jenkov.com/tutorials/java-collections)
<br>[Java Collections Utility Methods Topic Page](https://jenkov.com/tutorials/java-collections/collections.html)