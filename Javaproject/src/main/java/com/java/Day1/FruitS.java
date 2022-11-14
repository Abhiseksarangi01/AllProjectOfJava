package com.java.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Fruit{
	int numberOf;
	String seasonName;
	public Fruit(int numberOf, String seasonName) {
		this.numberOf = numberOf;
		this.seasonName = seasonName;
		
		
		
	}
	@Override
	public String toString() {
		return "Fruit [numberOf=" + numberOf + ", seasonName=" + seasonName + "]";
	}
	
	
}


public class FruitS {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	List<Fruit> listOfFruits=new ArrayList<Fruit>();
	
	System.out.println("enter the number of fruits you want to enter ");
	int input=sc.nextInt();
	{
	
	for(int i=0;i<input;i++)
	{
		System.out.println("enter numberOf");
		int numberOf=sc.nextInt();
		System.out.println("Season type");
		String seasonName=sc.next();
		
		Fruit F1=new Fruit(numberOf, seasonName);
		listOfFruits.add(F1);
	}
		System.out.println(listOfFruits);
		
	}
	
	
}
}

