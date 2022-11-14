package com.java.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class CollectionCars{
	int id ;
	String purchaseDate;
	String modelName;
	public CollectionCars(int id, String purchaseDate, String modelName) {
		super();
		this.id = id;
		this.purchaseDate = purchaseDate;
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "CollectionCars [id=" + id + ", purchaseDate=" + purchaseDate + ", modelName=" + modelName + "]";
	}
	
	
}

class idSort implements Comparator<CollectionCars>{

	@Override
	public int compare(CollectionCars o1, CollectionCars o2) {
		if(o1.id==o2.id) {
			return 0;
		}else if(o1.id>o2.id) {
			return 1;
		}else {
			return -1;
		}
	}
	
	
	
}

	class modelNameSort implements Comparator<CollectionCars>{

		@Override
		public int compare(CollectionCars o1, CollectionCars o2) {
			return o1.modelName.compareTo(o2.modelName);
		}
		
	}

public class CarsC  {
public static void main(String[] args) {
	
	List<CollectionCars> listOfCars= new ArrayList<CollectionCars>();
	CollectionCars c1=new CollectionCars(12, "12-12-2022", "buggaati");
	listOfCars.add(c1);
	CollectionCars c2=new CollectionCars(89, "14-12-2022", "porche");
	listOfCars.add(c2);
	System.out.println(listOfCars);
	
	Iterator itr=listOfCars.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
		Collections.sort(listOfCars, new idSort());
		System.out.println("aFTER sorting by id ");
		System.out.println(listOfCars);
	
		Collections.sort(listOfCars, new modelNameSort());
		System.out.println("After sorting the model name we have : " + listOfCars);
	}
}
}
