package pack2;

public class StringExample2 {
public static void main(String[] args) {
	
	String first=new String("HELLO");
	String second=new String("HELLO");
	String third=new String("hELLO");
	String fourth=new String("Hello");
	String fifth="HI";
	
	System.out.println(first.equals(second));//true
	System.out.println(second.equals(third));//false
	
	System.out.println(first.hashCode());
	System.out.println(second.hashCode());
	System.out.println(third.hashCode());
	System.out.println(fourth.hashCode());
	
	System.out.println(first==third);
	System.out.println(second==fifth);
	System.out.println(third==fifth);
	
	System.out.println(first.equalsIgnoreCase(third));
	System.out.println(second.equalsIgnoreCase(fifth));
	
	System.out.println(first.compareTo(second));
	System.out.println(second.compareTo(fourth));
	
	
	}
}
