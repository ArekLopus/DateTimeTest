package conversions.legacy;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;

public class TimeStampAndLocalDTOrInstant {

	public TimeStampAndLocalDTOrInstant() {
		
		Timestamp timestampFromInstant = Timestamp.from(Instant.now());
		Timestamp timestampFromLocalDateTime = Timestamp.valueOf(LocalDateTime.now());
		
		System.out.println(timestampFromInstant);
		System.out.println(timestampFromLocalDateTime);
		
		
		LocalDateTime localDateTime = timestampFromInstant.toLocalDateTime();
		Instant instant = timestampFromLocalDateTime.toInstant();
		
		System.out.println(instant);
		System.out.println(localDateTime);
		
		
		System.out.println("\n\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new TimeStampAndLocalDTOrInstant();
	}
}
