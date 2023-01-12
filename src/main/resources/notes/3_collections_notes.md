# Java Collection

The Java Collection interface (java.util.Collection) is one of the root interfaces of the Java Collection API.
Though you do not instantiate a Collection directly, but rather a subtype of Collection, you may often treat these
subtypes uniformly as a Collection.

### Create a Collection

You do not create a Collection instance directly, but an instance of one of the subtypes of Collection.
Here is an example of creating a List which is a subtype of Collection:

    Collection collection = new ArrayList();

The above example works for every subtype of Collection.

### Collection Subtypes

The following interfaces (collection types) extends the Java Collection interface:

- List
- Set
- SortedSet
- NavigableSet
- Queue
- Deque

Java does not come with a usable implementation of the Collection interface, so you will have to use one of the listed
subtypes. The Collection interface just defines a set of methods (behaviour) that each of these Collection subtypes
share.

This makes it possible ignore what specific type of Collection you are using, and just treat it as a Collection.
This is standard inheritance,

### Methods that operates on a Collection:

    public class MyCollectionUtil{
    
        public static void doSomething(Collection collection) {
        
            Iterator iterator = collection.iterator();
            while(iterator.hasNext()){
              Object object = iterator.next();
        
              //do something to object here...
            }
        }
    }

And here are a few ways to call this method with different Collection subtypes:

    Set  set  = new HashSet();
    List list = new ArrayList();
    
    MyCollectionUtil.doSomething(set);
    MyCollectionUtil.doSomething(list);    

### Add Element to Collection

Regardless of what Collection subtype you are using there are a few standard methods to add elements to a Collection.
Adding an element to a Collection is done via the add() method. Here is an example of adding an element to a Java
Collection:

    String     anElement  = "an element";
    Collection collection = new HashSet();
    
    boolean didCollectionChange = collection.add(anElement);

The `add()` method adds the given element to the collection, and returns true if the Collection changed as a result of
calling the `add()` method. A Set for instance may not have changed. If the Set already contained that element, it is
not added again. On the other hand, if you called add() on a List and the List already contained that element,
the element would then exist twice in the List.

### Add Collection of Objects to Collection

You can also add a collection of objects to a Java Collection using the addAll(). Here is an example of adding a
collection of objects to a Java Collection:

    Set  aSet  = ... // get Set  with elements from somewhere

    Collection collection = new HashSet();

    collection.addAll(aSet);    //returns boolean too, but ignored here

The Java Collection addAll() adds all elements found in the Collection passed as parameter to the method.
The Collection object itself is not added. Only its elements. If you had called add() with the Collection as parameter
instead, the Collection object itself would have been added, not its elements.

Exactly how the addAll() method behaves depends on the Collection subtype. Some Collection subtypes allows the same
element to be added more than once, and others don't.

### Remove Element From Collection

The remove() method removes the given element from the Collection and returns true if the removed element was present
in the Collection, and was removed. If the element was not present, the remove() method returns false.
Here is an example of removing an element from a Java Collection:

    boolean wasElementRemoved = collection.remove("an element");

### Remove Collection of Elements From Collection

The Java Collection `removeAll()` removes all elements found the Collection passed as parameter to the method.
If the Collection parameter contains any elements not found the target collection, these are just ignored.
Here is an example of removing a collection of elements from a Java Collection:

    Collection objects = //... get a collection of objects from somewhere.
    
    collection.removeAll(objects);

### Retain All Elements From a Collection in Another Collection

The Java Collection `retainAll()` does the opposite of `removeAll()`. Instead of removing all the elements found in the
parameter Collection, it keeps all these elements, and removes all other elements. Keep in mind, that only if the
elements were already contained in the target collection, are they retained.

Any new elements found in the parameter Collection which are not in the target collection, are not automatically added.
They are just ignored. Here is an example of retaining all elements from one Collection in another Java Collection:

    Collection colA = new ArrayList();
    Collection colB = new ArrayList();
    
    colA.add("A");
    colA.add("B");
    colA.add("C");
    
    colB.add("1");
    colB.add("2");
    colB.add("3");
    
    Collection target = new HashSet();
    
    target.addAll(colA);     //target now contains [A,B,C]
    target.addAll(colB);     //target now contains [A,B,C,1,2,3]
    
    target.retainAll(colB);  //target now contains [1,2,3]

### Checking if a Collection Contains a Certain Element

The Collection interface has two methods to check if a Collection contains one or more certain elements.
These are the `contains()` and `containsAll()` methods. They are illustrated here:

    Collection collection   = new HashSet();
    boolean containsElement = collection.contains("an element");
    
    Collection elements     = new HashSet();
    boolean containsAll     = collection.containsAll(elements);

`contains()` returns true if the collection contains the element, and false if not.
`containsAll()` returns true if the collection contains all the elements in the parameter collection, and false if not.

### Collection Size

You can check the size of a collection using the size() method. By "size" is meant the number of elements in the
collection. Here is an example:

    int numberOfElements = collection.size();    

### Iterate a Collection

You can iterate all elements of a collection. This is done by obtaining a Java Iterator from the collection,
and iterate through that. Here is how it looks:

    Collection collection = new HashSet();

    //... add elements to the collection
    
    Iterator iterator = collection.iterator();
    while(iterator.hasNext()){
        Object object = iterator.next();
        System.out.println(object);
    }

You can also iterate a Java Collection using the Java for-each loop :

    Collection collection = new HashSet();
    collection.add("A");
    collection.add("B");
    collection.add("C");
    
    for(Object object : collection) {
        System.out.println(object);
    }

<br>

### Reference

Java Collections by `Jakob Jenkov`
<br>[Website](https://jenkov.com/tutorials/java-collections)
<br>[Collection Topic Page](https://jenkov.com/tutorials/java-collections/collection.html)