package com.java.DateApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

	public static void DateAndTime() {
		
		LocalDate date= LocalDate.now();
		System.out.println("local date is : "+ date);
		
		
		LocalTime time = LocalTime.now();
		System.out.println("local time is :" + time );
		
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("local date and time is : "+ current);
		
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy  HH-mm-ss");
		String FormattedDateAndTime = current.format(format);
		System.out.println("formatted date and time is : " + FormattedDateAndTime);
		
	}
	
	
	public static void main(String[] args) {
		DateAndTime();
	}
}
