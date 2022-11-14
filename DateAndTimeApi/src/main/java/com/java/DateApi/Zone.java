package com.java.DateApi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Zone {
	//use it when time zones are to be considered : ZonedDateTimeApi
	
	public static void ZonedtimeAndDate() {
		
		LocalDateTime date1= LocalDateTime.now();
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd-MM-yyyy : HH:mm:ss ");
		String formattedDateAndTime = date1.format(format1);
		System.out.println("formatted date and time : " + formattedDateAndTime);
		
		
		ZonedDateTime currentZone = ZonedDateTime.now();
		
		System.out.println(" getting the current zone : " + currentZone.getZone());
		
		ZoneId tokyo = ZoneId.of("Asia/Tokyo");
		
		 ZonedDateTime tokyoZone = currentZone.withZoneSameInstant(tokyo);
		                   
		    System.out.println("tokyo time zone is " +
		                        tokyoZone);
		
		
		    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY : HH:mm:ss");
		    
		    String formattedDateAndTime1 = tokyoZone.format(format);
		    System.out.println(" formatted tokyo time zone : " + formattedDateAndTime);
	}
	
	
	
	
	
	public static void main(String[] args) {
		ZonedtimeAndDate();
	}
}
