package pack1;
import java.util.*;

public class ArrayListExample {
public static void main(String[] args) {
	ArrayList <Object>al=new ArrayList<>();
	
	al.add("A");
	al.add("B");
	al.add("C");
	al.add("D");
	al.add("A");
	al.add(10);
	
	System.out.println(al);
	
	System.out.println(al.size());
	System.out.println(al.contains("c"));
	System.out.println(al.remove(1));
	System.out.println(al);
	System.out.println(al.indexOf("A"));
	System.out.println(al.lastIndexOf("A"));
	
	
	
	
}
}
