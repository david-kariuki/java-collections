# Java List

The Java List interface, java.util.List, represents an ordered sequence of objects. The elements contained in a Java
List can be inserted, accessed, iterated and removed according to the order in which they appear internally in the
Java List. The ordering of the elements is why this data structure is called a List.

Each element in a Java List has an index. The first element in the List has index 0, the second element has index
1 etc. The index means "how many elements away from the beginning of the list". The first element is thus 0 elements
away from the beginning of the list - because it is at the beginning of the list.

You can add any Java object to a List. If the List is not typed, using Java Generics, then you can even mix objects
of different types (classes) in the same List. Mixing objects of different types in the same List is not often
done in practice, however.

The Java List interface is a standard Java interface, and it is a subtype of the Java Collection interface,
meaning List inherits from Collection.

### List vs. Set

The Java List and Java Set interfaces are quite similar in that they both represent a collection of elements.
However, there are some significant differences. These differences are reflected in the methods the List and Set
interfaces offer.

- The same element can occur more than once in a Java List. This is different from a Java Set where each element can
  occur only once.
- The elements in a List has an order, and the elements can be iterated in that order. A Java Set does not make any
  promises about the order of the elements kept internally.

### List Implementations

Being a Collection subtype all methods in the Collection interface are also available in the List interface.

Since `List` is an interface you need to instantiate a concrete implementation of the interface in order to use it.
You can choose between the following List implementations in the Java Collections API:

- `java.util.ArrayList`
- `java.util.LinkedList`
- `java.util.Vector`
- `java.util.Stack`

Of these implementations, the ArrayList is the most commonly used. There are also concurrent List implementations in
the `java.util.concurrent` package.

### Create a List

You create a List instance by creating an instance of one of the classes that implements the List interface.
Here are a few examples of how to create a List instance:

    List listA = new ArrayList();
    List listB = new LinkedList();
    List listC = new Vector();
    List listD = new Stack();

Remember, most often you will use the ArrayList class, but there can be cases where using one of the other
implementations might make sense.

### Generic Lists

By default, you can put any Object into a List, but from Java 5, Java Generics makes it possible to limit the types
of object you can insert into a List. Here is an example:

    List<MyObject> list = new ArrayList<MyObject>();

This List can now only have MyObject instances inserted into it. You can then access and iterate its elements
without casting them. Here is how it looks:

    List<MyObject> list = new ArrayList<MyObject>();
    
    list.add(new MyObject("First MyObject"));
    
    MyObject myObject = list.get(0);
    
    for(MyObject anObject : list){
        // do someting to anObject...
    }

Without generics the example above would have looked like this:

    List list = new ArrayList();   //no generic type specified
    list.add(new MyObject("First MyObject"));
    
    MyObject myObject = (MyObject) list.get(0);  // Cast needed
    
    for(Object anObject : list){
        //cast needed
        MyObject theMyObject = (MyObject) anObject;
    
        //do someting to anObject...
    }

Notice how it is necessary to cast the MyObject instances retrieved from the List to MyObject.
Without a generic type set on the List variable declaration the Java compiler only knows that the List contains
Object instances. Thus, you need to cast them to the concrete class (or interface) that you know the object to be of.

It is a good practice to specify a generic type for your List variables whenever you can.

It helps you avoid inserting the wrong types of objects into the List. It enables you to retrieve the objects from
the List without having to cast them their real type. And - it helps the reader of your code see what type of
objects the List is supposed to contain. You should only omit a generic type if you have very good reasons to do so.

### Insert Elements in a Java List

You insert elements (objects) into a Java List using its add() method. Here is an example of adding elements
to a Java List using the add() method:

    List<String> listA = new ArrayList<>();
    listA.add("element 1");
    listA.add("element 2");
    listA.add("element 3");

The first three `add()` calls add a String instance to the end of the list.

#### Insert null Values

It is actually possible to insert null values into a Java List. Here is an example of inserting a null value
into a Java List:

    Object element = null;
    List<Object> list = new ArrayList<>();
    list.add(element);

#### Insert Elements at Specific Index

It is possible to insert an element into a Java List at a specific index. The List interface has a version of the
`add()` method that takes an index as first parameter, and the element to insert as the second parameter.

Here is an example of inserting an element at index 0 into a Java List:

    list.add(0, "element 4");

If the List already contained elements, these elements will now get pushed further down in the List's internal
sequence. The element that had index 0 before the new element was inserted at index 0, will get pushed to index 1 etc.

#### Insert All Elements From One List Into Another

It is possible to add all elements from one Java List into another List. You do so using the List `addAll()` method.
The resulting List is the union of the two lists. Here is an example of adding all elements from one List into another:

    List<String> listSource = new ArrayList<>();
    listSource.add("123");
    listSource.add("456");
    
    List<String> listDest = new ArrayList<>();
    
    listDest.addAll(listSource);

This example adds all elements from listSource into listDest. The `addAll()` method takes a Collection as parameter,
so you can pass either a List or Java Set as parameter. In other words, you can add all elements from a List or
Set into a List with addAll() .

### Get Elements From a Java List

You can get the elements from a Java List using the index of the elements. You can do so using either the
get(int index) method. Here is an example of accessing the elements of a Java List using the element indexes:

    List<String> listA = new ArrayList<>();

    listA.add("element 0");
    listA.add("element 1");
    listA.add("element 2");
    
    //access via index
    String element0 = listA.get(0);
    String element1 = listA.get(1);
    String element3 = listA.get(2);

It is also possible to iterate the elements of a Java List in the order they are stored in internally.

### Find Elements in a List

You can find elements in a Java List using one of these two methods:

- indexOf()
- lastIndexOf()

The `indexOf()` method finds the index of the first occurrence in the List of the given element.
Here is an example finding the index of two elements in a Java List:

    List<String> list = new ArrayList<>();
    
    String element1 = "element 1";
    String element2 = "element 2";
    
    list.add(element1);
    list.add(element2);
    
    int index1 = list.indexOf(element1);
    int index2 = list.indexOf(element2);
    
    System.out.println("index1 = " + index1);
    System.out.println("index2 = " + index2);

Running this code will result in this output:

> index1 = 0
>
> index2 = 1

#### Find Last Occurrence of Element in a List

The `lastIndexOf()` method finds the index of the last occurrence in the List of a given element. Here is an
example showing how to find the index of the last occurrence of a given element in a Java List:

    List<String> list = new ArrayList<>();
    
    String element1 = "element 1";
    String element2 = "element 2";
    
    list.add(element1);
    list.add(element2);
    list.add(element1);
    
    int lastIndex = list.lastIndexOf(element1);
    System.out.println("lastIndex = " + lastIndex);

The output printed from running the above Java example will be:

> lastIndex = 2

The element 1 occurs 2 times in the List. The index of the last occurrence is 2.

### Checking if List Contains Element

You can check if a Java List contains a given element using the List `contains()` method. Here is an example of
checking if a Java List contains an element using the contains() method:

    List<String> list = new ArrayList<>();
    String element1 = "element 1";
    list.add(element1);

    boolean containsElement = list.contains("element 1");
    System.out.println(containsElement);

The output from running this Java List example will be: `true` because the List does actually contain the element.
To determine if the List contains the element, the List will internally iterate its elements and compare each element
to the object passed as parameter. The comparison uses the Java equals method of the element to check if the element
is equal to the parameter.

Since it is possible to add null values to a List, it is actually possible to check if the List contains a null
value. Here is how you check if a List contains a null value:

    list.add(null);
    
    containsElement = list.contains(null);
    System.out.println(containsElement);

Obviously, if the input parameter to contains() is null, the contains() method will not use the equals() method to
compare against each element, but rather use the == operator.

### Remove Elements From a Java List

You can remove elements from a Java List via these two methods:

1. remove(Object element)
2. remove(int index)

remove(Object element) removes that element in the list, if it is present. All subsequent elements in the list are then
moved up in the list. Their index thus decreases by 1. Here is an example of removing an element from a Java List based
on the element itself:

    List<String> list = new ArrayList<>();
    
    String element = "first element";
    list.add(element);
    
    list.remove(element);

This example first adds an element to a List and then removes it again.

After running the example code below, the List would contain the Java String elements element 1 and element 2
at index 0 and 1. The first element (element 0) has been removed from the List.

    List<String> list = new ArrayList<>();
    
    list.add("element 0");
    list.add("element 1");
    list.add("element 2");
    
    list.remove(0);

#### Remove All Elements From a Java List

The Java List interface contains a `clear()` method which removes all elements from the list when called.

Removing all elements from a List is also referred to as clearing a List. Here is simple example of removing
all elements from a List (clearing) with the `clear()` method:

    List<String> list = new ArrayList<>();
    
    list.add("object 1");
    list.add("object 2");

    list.clear();

First, a new List is created. Second, two elements are added to the List. Third, the `clear()` method is called.
After the `clear()` method has been called, the List will be completely empty.






<br>

### Reference

Java Collections by `Jakob Jenkov`
<br>[Website](https://jenkov.com/tutorials/java-collections)
<br>[Java List Topic Page](https://jenkov.com/tutorials/java-collections/list.html)