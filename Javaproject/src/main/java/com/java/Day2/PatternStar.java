package com.java.Day2;

class Star{
	public void starPrint() {
		for(int i=0;i<4;i++){

	        for(int j=0;j<4;j++){

	            if(i>j){

	                System.out.print(" ");

	            }else{

	                System.out.print("*");

	            }

	        }

	        System.out.println();

	}
}
}


public class PatternStar extends Star{
public static void main(String[] args) {
	Star pattern=new Star();
	pattern.starPrint();
       

    }
}

