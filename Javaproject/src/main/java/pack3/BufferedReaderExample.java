package pack3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderExample {
public static void main(String[] args) throws Exception {
	
	int a,b,c;
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
	System.out.println("Enter two values");
	a=Integer.parseInt(br.readLine());
	b=Integer.parseInt(br.readLine());
	c=a+b;
	
	System.out.println("sum = "+ c);
}
}
