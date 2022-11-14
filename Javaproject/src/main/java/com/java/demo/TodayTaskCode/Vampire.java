package com.java.demo.TodayTaskCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class VampireQ{
	int id;
	String typeVamp;
	String colorVamp;
	String addressVamp;
	public VampireQ(int id, String typeVamp, String colorVamp, String addressVamp) {
		super();
		this.id = id;
		this.typeVamp = typeVamp;
		this.colorVamp = colorVamp;
		this.addressVamp = addressVamp;
	}
	@Override
	public String toString() {
		return "VampireQ [id=" + id + ", typeVamp=" + typeVamp + ", colorVamp=" + colorVamp + ", addressVamp="
				+ addressVamp + "]";
	}
	
}


public class Vampire {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	List<VampireQ> detailsOfVamps=new ArrayList<VampireQ> ();
	
	System.out.println("Enter the number of vampires you want to input");
	int numberOfInputs=sc.nextInt();{
		
	
	for(int i=0;i<numberOfInputs;i++)
	{
		System.out.println("Enter the id of the Vampire");
		int id=sc.nextInt();
		System.out.println("Enter the type of the Vampire");
		String typeVamp=sc.next();
		System.out.println("Enter the color of the Vampire");
		String colorVamp=sc.next();
		System.out.println("Enter the address of the Vampire");
		String addressVamp=sc.next();
		
		VampireQ v1=new VampireQ(id, typeVamp, colorVamp, addressVamp);
		detailsOfVamps.add(v1);
		
	
	

	}
	System.out.println(detailsOfVamps);
	}
		
		
	
	
	
}
}
