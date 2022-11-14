package com.java.Day6;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

class Fruits{
	String colorF;
	String nameF;
	String cityF;
	public Fruits(String colorF, String nameF, String cityF) {
		super();
		this.colorF = colorF;
		this.nameF = nameF;
		this.cityF = cityF;
	}
	@Override
	public String toString() {
		return "Fruits [colorF=" + colorF + ", nameF=" + nameF + ", cityF=" + cityF + "]";
	}
	
}

class Vegetables{
	String colorV;
	String namev;
	String cityV;
	public Vegetables(String colorV, String namev, String cityV) {
		super();
		this.colorV = colorV;
		this.namev = namev;
		this.cityV = cityV;
	}
	@Override
	public String toString() {
		return "Vegetables [colorV=" + colorV + ", namev=" + namev + ", cityV=" + cityV + "]";
	}
	
}


class Drinks{
	String colorD;
	String nameD;
	String cityD;
	public Drinks(String colorD, String nameD, String cityD) {
		super();
		this.colorD = colorD;
		this.nameD = nameD;
		this.cityD = cityD;
	}
	@Override
	public String toString() {
		return "Drinks [colorD=" + colorD + ", nameD=" + nameD + ", cityD=" + cityD + "]";
	}
	
}






public class Formula {
public static void main(String[] args) throws FileNotFoundException {
	
	
	Fruits F1=new Fruits("orange", "orange", "maharastra");
	Fruits F2=new Fruits("apple", "red", "mysore");
	
	Vegetables V1=new Vegetables("cucumber", "green", "cuttack");
	Vegetables V2=new Vegetables("carrot", "red", "gujarat");
	
	Drinks D1=new Drinks("soda", "white", "rourkela");
	Drinks D2=new Drinks("cola", "black", "karnataka");
	
	
	System.out.println("until this ");
	
	FileOutputStream fos=new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\Formula\\Fruits.txt");
	FileOutputStream fos1=new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\Formula\\Vegetables.txt");
	FileOutputStream fos2=new FileOutputStream("C:\\Users\\abhiseks\\Desktop\\Sample\\Formula\\Drinks.txt");
	
	
	
}
}
