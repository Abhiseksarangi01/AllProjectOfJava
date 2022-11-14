package com.java.CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ExampleOfPriorityQueue {
public static void main(String[] args) {
	
	PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
	//Comparator.reverseOrder- max heap is implemented ,it asks to show the max element at the top ,the order remains hapazzard 
	//after the first though.
	
	//we can change the priority any time 
	// we can use all the functions of queue as pq implements queue 
	
	pq.offer(23);
	pq.offer(11);
	pq.offer(87);
	pq.offer(56);
	
	//under the hood a mean heap is implemented ,which basically the smallest element is in the top .
	
	System.out.println(pq);
	
	System.out.println(pq.poll());
	
	System.out.println(pq);
	
	System.out.println(pq.peek());
	
}
}
