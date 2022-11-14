package com.java.DateApi;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date {
	
     //LocalDate/LocatTime and LocalDateTime API : Use it when time zones are NOT required
	public static void LocalDateTimeApi() {
		
		//current date 
		
		LocalDate date = LocalDate.now();
		System.out.println("the current date is : " + date );
		
		//current time 
		LocalTime time = LocalTime.now();
		System.out.println(" the current time is : " + time);
		
		
		//current time and date 
		LocalDateTime current = LocalDateTime.now();
		System.out.println("the current Date and time is : " + current);
		
		//to print in a formatted manner  
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy : HH-mm-ss")	;
		String formattedDateTime = current.format(format);
		System.out.println("date time in a formatted manner : " + formattedDateTime );
				
		
		
		
		//printing months ,days and seconds 
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int sec = current.getSecond();
		System.out.println("months ,days ,seconds : " + month + day + sec );
		
		
		//printing some specified date 
		
		LocalDate date2 = LocalDate.of(2022, 11, 14);
		System.out.println(" children's day : " + date2);
		
		 //printing date with current time 
	    LocalDateTime specificDate=current.withDayOfMonth(14).withYear(2022);
	    System.out.println(" date with current time is : " + specificDate);

	}
	
	   
	
	public static void main(String[] args) {
		
		LocalDateTimeApi();
	}
}
