package com.java.sumanthTask;

import java.util.Scanner;

interface oddOrEven{
	void oddEven();
}

class Myclass implements oddOrEven{

	@Override
	public void oddEven() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the NUmber ");
		int number = sc.nextInt();
		if(number%2==0) {
			System.out.println("The Entered Number is Even Number");
		}else {
			System.out.println("The Entered Number is Odd number");
		}
		
	}
	
}

public class TraditionlaWayForEvenOrOdd {
	public static void main(String[] args) {
		Myclass obj = new Myclass();
		obj.oddEven();
		
	}

}
