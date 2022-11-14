package com.java.strings;

public class Strings {
	public static void main(String[] args) {
		int c = 0;
		String rev=" ";
		String str = "ABCD";
//		for(int i=0;i<str.length()-1 ;i++)
//		{
//			c += 1;
//		}
//		System.out.println("the length of the string is " + c);
//		
		for(int r=str.length()-1;r>=0;r--)
		{
			System.out.print(str.charAt(r));
		}
		
	}
	
	
}
