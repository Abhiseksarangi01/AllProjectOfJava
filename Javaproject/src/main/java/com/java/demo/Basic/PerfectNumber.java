package com.java.demo.Basic;

import java.util.Scanner;

class SoltionOfPerfectNumber{
	public static void getNumber(){

        int i ;

        do {

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the valid Number");

            int givenNumber1 = sc.nextInt();

            int sum1 = 0;

            // int k=1;

            if(givenNumber1>10 && givenNumber1<100){

                for (i = 1; i < givenNumber1; i++) {

                    if (givenNumber1 % i == 0) {

                        sum1 = sum1 + i;

                    }

                }

                if (sum1 == givenNumber1) {

                    System.out.format("\n% d is a Perfect Number", givenNumber1);

                    break;

                } else {

                    System.out.format("\n% d is NOT a Perfect Number", givenNumber1);
                    break;

                }

            }

        } while (i!=0);

    }
}
public class PerfectNumber {
	public static void main(String[] args) {
		SoltionOfPerfectNumber sol = new SoltionOfPerfectNumber();
		sol.getNumber();
		
	}

}
