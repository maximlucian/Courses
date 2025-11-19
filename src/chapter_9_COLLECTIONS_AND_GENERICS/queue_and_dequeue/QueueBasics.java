package chapter_9_COLLECTIONS_AND_GENERICS.queue_and_dequeue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueBasics {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();      //LinkedList and ArrayDeque both implement the Deque interface
        queue.add(10);                                              //which inherit Queue
        queue.add(4);                       //a LinkedList comes with the benefit that it implements both the
        System.out.println(queue.remove());   // 10                 List and Deque interfaces
        System.out.println(queue.peek());     // 4              //ArrayDeque can be used if you don't need the List methods
    }
}
