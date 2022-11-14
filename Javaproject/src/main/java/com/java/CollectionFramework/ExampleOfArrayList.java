package com.java.CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Student{
	int id;

	public Student(int id) {
		super();
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + "]";
	}
	
}


public class ExampleOfArrayList {
public static void main(String[] args) {
	
//creating a list 
	List<Integer> idList = new ArrayList();
	
	//adding the id's into the list 
	idList.add(1);
	idList.add(2);
	idList.add(32);
	idList.add(4);
// displaying the list 
	
	System.out.println(idList);
	
	//adding a element at a particular position
	
	idList.add(2, 3);//this will add 3 into the 2nd index position
	
	System.out.println(idList);
	
	//adding a new list into a list using addAll ,which will add the elements of the list in the end of first list.
	
	List<Integer> idList1= new ArrayList();// creating a new list 
	idList1.add(34);
	idList1.add(54);
	idList1.add(67);
	
	System.out.println(idList1);
	// now adding the new list into the old list 
	
	idList.addAll(idList1);
	System.out.println(idList);
	
	//to get the elements at any position we use get()
	
	System.out.println(idList.get(3));
	
	//removing a element from a particular position
	
	idList.remove(3);
	System.out.println(idList);
	
	//removing the element by directly providing the element
	
	idList.remove(Integer.valueOf(4));
	
	System.out.println(idList);
	
	// if want to clear the whole list 
	//list.clear(); this will remove all the elements inside the list and provide you a empty list 
	
	/**time complexity ==========
	if you are removing any element from the middle ,then the other elements will shift left 
	SO the time complexity will be O(n) - Big O Of n
	And if you are inserting any element in the middle ,
	the the other elements after that will shift to the right.
	SO the time complexity will be O(n) - Big O Of n
	**/
	
	//set function is used ,is you want to update any element at the particular index 
	
	idList.set(2,1000);
	// time complexity == O(1);
	
	System.out.println(idList);
	
	//Contains is a function used to check if an element is present or not 
	
	System.out.println(idList.contains(34));
	//if 34 is present it will return true or else will return false
	
	//this will check the number of elements present in the list 
	//it is also called as iterating over the list 
	
	for(int i=0;i < idList.size();i++)
	{
		System.out.println("The Element is :" + idList.get(i));
	}
		
	//now using for each loop
	for(Integer i:idList) //for every integer i present in idList
	{
		System.out.println("The Element is :"+ i);
	}
	
	//Iterating the list using Itertor
	Iterator<Integer> itr=idList.iterator();
	
	while(itr.hasNext()) { // hasNext function CHECKS iF next element is present or not
		System.out.println(itr.next()); //the next function prints the next element present. 
	}
	
	
	
	
	

	
	
}
}
