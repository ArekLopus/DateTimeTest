package local_tiime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class MethodsStatic {

	public MethodsStatic() {
		
		// from()
		LocalTime.from(ZonedDateTime.now());
		LocalTime.from(OffsetDateTime.now());
		LocalTime.from(LocalDateTime.now());
		//LocalTime.from(Instant.now());			//The rest dont work
		//LocalTime.from(LocalDate.now());
		
		
		// of()
		System.out.println(LocalTime.of(12, 12));
		System.out.println(LocalTime.of(12, 13, 14));
		System.out.println(LocalTime.of(12, 13, 14, 1516));
		
		// ofNanoOfDay() - Obtains an instance of LocalTime from a nanos-of-day value.
		System.out.println(LocalTime.ofNanoOfDay(50000L));
		
		// ofSecondOfDay() - Obtains an instance of LocalTime from a second-of-day value.
		System.out.println(LocalTime.ofSecondOfDay(61));
		
		// parse(CharSequence text)		- fromat: at least hours and minutes
		System.out.println(LocalTime.parse("13:26:36.337"));
		System.out.println(LocalTime.parse("13:25"));

		// parse(CharSequence text, DateTimeFormatter formatter)
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("kk-mm-ss");
		System.out.println(LocalTime.parse("22-55-33", dateTimeFormatter));
		
		
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new MethodsStatic();
	}
}

