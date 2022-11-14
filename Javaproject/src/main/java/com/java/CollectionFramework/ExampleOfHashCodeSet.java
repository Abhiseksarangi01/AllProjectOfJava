package com.java.CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

class Player{
	String fullName;
	int RollNo;
	public Player(String fullName, int rollNo) {
		super();
		this.fullName = fullName;
		RollNo = rollNo;
	}
	@Override
	public String toString() {
		return "Player [fullName=" + fullName + ", RollNo=" + RollNo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(RollNo);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Player other = (Player) obj;
		return RollNo == other.RollNo;
	}
	
		/** 
		 * AFter this method there will be no players taken having the same roll number.
		 * but will take players having the same name . 
		 */
	}
	


public class ExampleOfHashCodeSet {
public static void main(String[] args) {
	
	
	Set<Player> PlayerSet = new HashSet<>();
	PlayerSet.add(new Player("abhisek", 22));
	PlayerSet.add(new Player("sunil", 34));
	PlayerSet.add(new Player("sumanth", 12));
	PlayerSet.add(new Player("kamesh", 22));
	PlayerSet.add(new Player("sumanth", 82));
	
	System.out.println(PlayerSet);
	
	Iterator<Player> itr = PlayerSet.iterator();
	while(itr.hasNext())
			System.out.println( " here the players having the same roll no are also printed " + itr.next());
		// now id want to have names and roll nos taken unique then we have to implement hashcode and equals method 
	
	
}
}

