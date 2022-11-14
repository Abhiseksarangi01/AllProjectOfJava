package pack1;

import java.util.LinkedList;

public class LinkedListExample {
public static void main(String[] args) {
	LinkedList<Object> ll=new LinkedList<>();
	
	ll.add("A");
	ll.add("B");
	ll.add("C");
	ll.add("D");
	ll.add("E");
	ll.add(10);
	
	System.out.println(ll);
	
	System.out.println(ll.size());
	System.out.println(ll.contains("c"));
	System.out.println(ll.remove(1));
	System.out.println(ll);
	ll.addFirst(14);
	ll.addLast("z1");
	System.out.println(ll);
	ll.removeFirst();
	ll.removeLast();
	System.out.println(ll);
	ll.add(3 ,"w");
	System.out.println(ll);
	
}
}
