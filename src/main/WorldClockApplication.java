package main;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class WorldClockApplication {
	
	// In this exercise, we are going to be using ZonedDateTime from the java.time package.  Like LocalDate and LocalDateTime,
	// starting from Java 8 onwards, we can easily add in timezones to our date to get the correct time information
	// from different countries.  If you chose your own countries, you may need to do a quick google search on your country
	// zone id.  The format is usually <Continent>/<City>
	
	private final static ZoneId BRISBANE = ZoneId.of("Australia/Brisbane");
	private final static ZoneId DUBLIN = ZoneId.of("Europe/Dublin");
	private final static ZoneId Chicago=ZoneId.of("America/Chicago");

	public static void main(String[] args) {
		

		// first we need to capture what the time is at this exact moment...
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime.withZoneSameInstant(BRISBANE).format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)));
		
		ZonedDateTime zonedDateTime1=ZonedDateTime.now();
		System.out.println(zonedDateTime1.withZoneSameInstant(DUBLIN).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

		ZonedDateTime zonedDateTime2=ZonedDateTime.now();
		System.out.println(zonedDateTime2.withZoneSameInstant(Chicago).format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
		System.out.println(zonedDateTime2.withZoneSameInstant(Chicago).format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a")));
		// from here you will need to create three system outs to print out the times and dates
		
		// ZonedDateTime has a method called withZoneSameInstant(<ZoneId>) which gives you the exact date time in the
		// time zone you put in using tbe zone id.  Try putting in zonedDateTime.withZoneSameInstant(BRISBANE)...
		
		// after we grabbed the time in our coutnry, we need to format the output using our DateTimeFormatter...
		
		// we need to format it in a way that is easily readable, for this assignment, use FormatStyle.MEDIUM
		
		// ... .format(DateTImeFormatter.ofLocalizedDateTIme(FormatStyle.MEDIUM));
		
		

	}

}
