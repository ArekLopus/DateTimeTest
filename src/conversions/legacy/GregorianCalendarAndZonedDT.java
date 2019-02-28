package conversions.legacy;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public class GregorianCalendarAndZonedDT {

	public GregorianCalendarAndZonedDT() {
		
		GregorianCalendar cal = GregorianCalendar.from(ZonedDateTime.now());
		ZonedDateTime zonedDateTime = cal.toZonedDateTime();
		
		System.out.println(Instant.ofEpochMilli(cal.getTimeInMillis()));
		System.out.println(zonedDateTime);
		
		System.out.println("\n\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new GregorianCalendarAndZonedDT();
	}
}
