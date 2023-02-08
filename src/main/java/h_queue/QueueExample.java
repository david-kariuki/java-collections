package h_queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @note A class to demonstrate how to implement and use a queue
 * @author David Kariuki
 * @since 08/02/2023
 */
public class QueueExample {

  /**
   * Main Method
   *
   * @param args - String array
   */
  public static void main(String[] args) {

    Queue<String> linkedList = new LinkedList<>();
    Queue<String> priorityQueue = new PriorityQueue<>();

    // Add element to queue
    linkedList.add("David Kariuki");
    linkedList.add("Caroline Wanja"); // Throws exception if queue is full
    linkedList.offer("John Doe"); // return s false if queue is full

    // Add element to queue
    priorityQueue.add("Jane doe");
    priorityQueue.add("Martin Doe");
    priorityQueue.offer("Milly Joe");

    // Take elements from the queue
    System.out.printf("%nBefore poll()/remove()%n");
    linkedList.forEach(System.out::println);
    System.out.println();

    String linkedListElement1WithPoll = linkedList.poll();
    System.out.printf("%nAfter poll() %s %n", linkedListElement1WithPoll);
    linkedList.forEach(System.out::println);
    System.out.println();

    String linkedListElement1WithRemove = linkedList.remove();
    System.out.printf("%nAfter remove() %s %n", linkedListElement1WithRemove);
    linkedList.forEach(System.out::println);
    System.out.println();

    Queue<String> queue = new LinkedList<>();
    queue.add("element 1");
    queue.add("element 2");
    queue.add("element 3");

    // Peek at a queue using element() method
    String firstElement1 = queue.element(); // Throws exception if queue empty
    String firstElement2 = queue.peek(); // Does not throw exception if
    // queue empty

    System.out.println();
    System.out.println("First 1 : " + firstElement1);
    System.out.println("First 2 : " + firstElement2);

    // Remove all elements from a queue
    System.out.println();
    System.out.println("Before clearing priority queue");
    priorityQueue.forEach(System.out::println);
    priorityQueue.clear();
    System.out.println("After clearing priority queue");
    priorityQueue.forEach(System.out::println);
    System.out.println("Priority queue size : " + priorityQueue.size());
  }
}
