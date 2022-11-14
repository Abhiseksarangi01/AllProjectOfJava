package com.java.demo;

import java.util.Scanner;

public class Character_String {
    public static char
    getCharFromString(String str, int index)
    {
        return str.charAt(index);
    }
  
    public static void main(String[] args)
    {
    	System.out.println("enter a string");
       Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println("enter the index to be extracted");
        int index=sc.nextInt();
  
        char ch = getCharFromString(str, index);
  
        System.out.println("Character from " + str
                           + " at index " + index
                           + " is " + ch);
        sc.close();
    }
}

