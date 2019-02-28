package conversions.legacy;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

//https://www.baeldung.com/java-date-to-localdate-and-localdatetime
public class DateToLocalDate {

	public DateToLocalDate() {
		
		LocalDate converted = convertToLocalDateViaInstant(new Date());
		System.out.println(converted);
		
		
		System.out.println("\n\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new DateToLocalDate();
	}
	
	
	public LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
	    return dateToConvert.toInstant()
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
	}
	
	
	public LocalDate convertToLocalDateViaMilisecond(Date dateToConvert) {
	    return Instant.ofEpochMilli(dateToConvert.getTime())
	      .atZone(ZoneId.systemDefault())
	      .toLocalDate();
	}
	
	
	public LocalDate convertToLocalDateViaSqlDate(Date dateToConvert) {
	    return new java.sql.Date(dateToConvert.getTime()).toLocalDate();
	}
}
