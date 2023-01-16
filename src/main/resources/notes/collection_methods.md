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

    List<String> list = new ArrayList<String>();
    list.add("one");
    list.add("two");
    list.add("three");
    
    Collections.reverse(list);

After executing the above code, the sequence of the elements in the List will be three, two, one .

### `shuffle()`

The Collections `shuffle()` method can shuffle the elements of a List. Here is an example of shuffling a list with the
Collections `shuffle()` method:

    List<String> list = new ArrayList<String>();
    list.add("one");
    list.add("two");
    list.add("three");
    
    Collections.shuffle(list);


### `sort()`
The Collections sort() method can sort a Java List. I have covered sorting of Lists in my sort Java List tutorial. Here is an example of sorting a Java List using Collections sort() method:

    List>String< list = new ArrayList<String>();
    
    list.add("one");
    list.add("two");
    list.add("three");
    list.add("four");
    
    Collections.sort(list);

After running this code the order of the elements in the List will be four, one, three, four, as the String elements 
will be sorted alphabetically.


### `min()`
The Collections `min()` method can find the minimum element in a List according to the natural ordering of the 
elements. Here is an example of finding the minimum element in a Java List using Collections `min()` method:

    List source = new ArrayList();
    source.add("1");
    source.add("2");
    source.add("3");
    
    String min = (String) Collections.min(source);

After running the code above, the min variable will contain the String value 1 .

### `max()`
The Collections `max()` method can find the maximum element in a List according to the natural order of the 
elements (see my Java List sorting tutorial). Here is an example of finding the maximum element in a Java List:

    List source = new ArrayList();
    source.add("1");
    source.add("2");
    source.add("3");
    
    String max = (String) Collections.max(source);

After running the code above, the max variable will contain the String value 3 .

### `replaceAll()`
The Java Collections `replaceAll()` method can replace all occurrences of one element with another element. 
You pass the element to replace and the element to replace it with as parameters to the `replaceAll()` method. 

The Collections `replaceAll()` method returns true if any elements were replaced, and false if not. 
Here is an example of replacing all occurrences of one element with another in a Java List:

    List source = new ArrayList();
    source.add("A");
    source.add("B");
    source.add("A");
    
    boolean replacedAny = source.replaceAll(source, "A", "C");

After executing this example, the source List will contain the elements C, B and C. The replacedAny variable will 
contain the value true because at least one element was replaced in the List.

The Collections `replaceAll()` method uses the `equals()` method of each element to determine if the element is 
equal to the element to replace or not.

### `unmodifiableSet()`
The `unmodifiableSet()` method in the Java Collections class can create an immutable (unmodifiable) Set from a normal 
Java Set . Here is a Java example of creating an immutable Set from a normal Set:

    Set normalSet    = new HashSet();
    Set immutableSet = Collections.replaceAll(source, "A", "C");

<br>

### Reference

Java Collections by `Jakob Jenkov`
<br>[Website](https://jenkov.com/tutorials/java-collections)
<br>[Java Collections Utility Methods Topic Page](https://jenkov.com/tutorials/java-collections/collections.html)