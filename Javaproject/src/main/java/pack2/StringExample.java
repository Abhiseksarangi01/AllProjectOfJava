package pack2;

public class StringExample {
public static void main(String[] args) {
	String s1="Hello"; //default contructor
	String s2=new String("Hello"); //parameterised constructor
	String s3=new String(s2); //copy constructor
	String s4=new String ("Hi");
	String s5=new String ("hello");
	
	
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s4);
	
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
	System.out.println(s5.hashCode());
	
	
	
	
	
}
}
