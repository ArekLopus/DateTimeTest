package conversions.legacy;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class LocalDateToDate {

	public LocalDateToDate() {
		
		Date converted = convertToDateViaInstant(LocalDate.now());
		System.out.println(converted);
		
		
		System.out.println("\n\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new LocalDateToDate();
	}
	
	
	public Date convertToDateViaInstant(LocalDate dateToConvert) {
	    return java.util.Date.from(dateToConvert.atStartOfDay()
	      .atZone(ZoneId.systemDefault())
	      .toInstant());
	}
	
	public Date convertToDateViaSqlDate(LocalDate dateToConvert) {
	    return java.sql.Date.valueOf(dateToConvert);
	}
}
