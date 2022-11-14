package pack1;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
    int a,b,c;
    Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers");
	 a =sc.nextInt();
	 b =sc.nextInt();
	 c=a + b;
	System.out.println("Result  is "+ c);
	sc.close();
}
}
