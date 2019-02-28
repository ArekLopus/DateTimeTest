package conversions.legacy;

import java.time.Instant;
import java.util.Date;

public class DateUtilAndInstant {

	public DateUtilAndInstant() {
		
		Date dateFromInstant = Date.from(Instant.now());
		Instant instant = dateFromInstant.toInstant();
		
		System.out.println(dateFromInstant);
		System.out.println(instant);
		
		
		System.out.println("\n\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new DateUtilAndInstant();
	}
}
