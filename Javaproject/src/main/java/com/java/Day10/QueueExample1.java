package com.java.Day10;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample1 {
public static void main(String[] args) {
	 /*
     * We cannot create instance of a Queue as it is an
     * interface, we can create instance of LinkedList or
     * PriorityQueue and assign it to Queue.
     */
    Queue<String> q = new LinkedList<String>();
	    
    //Adding elements to the Queue
    q.add("viajayaKathiwadi");
    q.add("MaggieChowmin"); 
    q.add("GlennMaxwell");
    q.add("SunilGupta");
    q.add("ViratKohli");
	    
    System.out.println("Elements in Queue: ");
    
    System.out.println(q);

    /*
     * We can remove element from Queue using remove() method,
     * this would remove the first element from the Queue 
     */
    System.out.println("Removed element: returns the first element of the queue that is head");
    
	System.out.println(q.remove());
    /*
     * element() method - this returns the head of the
     * Queue. Head is the first element of Queue
     */
    System.out.println("Head: is the first element of the queue ");
    
	System.out.println(q.element());    
    /*
     * poll() method - this removes and returns the 
     * head of the Queue. Returns null if the Queue is empty
     */
    System.out.println("poll: removes and returns the first element of the Queue ");
    
    System.out.println(q.poll());
	    
    /*
     * peek() method - it works same as element() method,
     * however it returns null if the Queue is empty
     */
    System.out.println("peek:returns the first element ie. the head of the Queue ");
    
    System.out.println(q.peek());
	    
    //Again displaying the elements of Queue
    System.out.println("Elements in Queue:"+q);
 }
}

