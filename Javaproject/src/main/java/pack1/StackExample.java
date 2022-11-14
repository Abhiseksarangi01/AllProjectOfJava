package pack1;

import java.util.Stack;

public class StackExample {
public static void main(String[] args) {
	
	Stack<String> st=new Stack<>();
	st.add("A");
	st.add("B");
	st.add("C");
	st.add("D");
	
	
	System.out.println(st);
	System.out.println(st.pop());
	System.out.println(st);
	System.out.println(st.peek());
	st.add("E");
	System.out.println(st);
	System.out.println(st.search("B"));
}
}
