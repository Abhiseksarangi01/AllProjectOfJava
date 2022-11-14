package com.java.CollectionFramework;

import java.util.ArrayDeque;

public class ExampleOfArrayDeque {
public static void main(String[] args) {
	
	/** Array is double ended queue in which you can insert,remove and peek elements from both front and back
	 * reason why it is known as the doublye ended queue 
	 * basically used in sliding techniques where you check the queue from both the ends at a time
	 * Arraydeque is a class which implements queue
	 */
	
	ArrayDeque<Integer> ad = new ArrayDeque<>();
	ad.offer(23);
	ad.offer(27);
	ad.offer(78);
	ad.offer(56);
	
	System.out.println(ad);
	
	//some other functions used in arrayDeque
	//offerFirst() adds the element at the head of the queue
	
	ad.offerFirst(11);
	
	System.out.println(ad);
	
	//offerLast() adds the element at the tail of the queue
	
	ad.offerLast(67);
	
	System.out.println(ad);
	
	ad.offer(89);
	
	//will add element at the last 
	
	System.out.println(ad);
	
	//peek() - will give you the element which is going to leave out,that is the element present in the front as in queue
	//peekFirst() - same as peek
	//peekLast() - will give you the element which is going to be removed at last 
	
	System.out.println(ad.peek());
	System.out.println(ad.peekFirst());
	System.out.println(ad.peekLast());
	
	//poll() - will remove the element present in the front
	//pollFirst() - same as poll
	//pollLast() - removes the element from last 
	
	System.out.println(ad.poll());
	System.out.println(ad.pollFirst());
	System.out.println(ad.pollLast());
	
	/**Using ArrayDeque you can implement queue and stack both 
	 * like if you dont want to make a seperate class for stack 
	 * you can use the add,offer function and for removing you can use the pollLast() function
	 * as it will remove the element in the last ,ie what stack does 
	 * 
	 * 
	 */
	
}
}
