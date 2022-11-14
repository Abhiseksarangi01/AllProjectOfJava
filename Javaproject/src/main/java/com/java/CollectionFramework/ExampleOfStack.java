package com.java.CollectionFramework;

import java.util.Stack;

// STACK basically follows LIFO ie LAST IN FIRST OUT , the element added up at the last leaves out first.
public class ExampleOfStack {
public static void main(String[] args) {
	Stack<String> st=new Stack<>();
	//adding elements into the stack using push method 
	
	st.push("elephant");
	st.push("lion");
	st.push("peacock");
	st.push("Tiger");
	st.push("Koala");
	
	 System.out.println(st);
	 //peek() return you the topmost element present in the stack tht is the last element u added .
	 System.out.println(st.peek());
	 
	 //pop() it removes the topmost element present in the stack 
	 st.pop();
	 System.out.println(st.peek());
	 
	 System.out.println(st);
	 
	 
}
}
