package com.java.CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

// It basically follows FIRST IN FIRST OUT ,it means if you add elements from the rear end,the elements 
//in the front come out

public class ExampleOfQueue {
public static void main(String[] args) {
	

	/**YOu have basically two ways to implement a queue
	1:  by using array 
	2:  by using LinkedList
	**/
	
	//Creating a queue implemented by a LinkedList
	
	Queue<String> queue= new LinkedList<>();
	//add() adding the elements in the queue ,if its false it throws an exception
	//offer() adding elements in the queue 
	
	queue.add("kiwi");
	queue.offer("orange");
	queue.offer("apple");
	queue.offer("bananas");
	queue.offer("grapes");
	
	System.out.println(queue);
	
	// poll() is used removing elements from the queue and returning that element
	//remove() is used removing elements from head of the queue.throws exception if its empty
	System.out.println(queue.poll());//returns null if the queue is empty
	System.out.println(queue.remove());
	
	// peek() is used to check which element is going to be out next in the queue ie NEXT PLEASE ,as well as returns the element
	//element() return the head of the element ,throws an exception if the queue is empty
	System.out.println(queue.peek());//returns null if queue is empty
	System.out.println(queue.element());
	
	
	 
	
}

}
