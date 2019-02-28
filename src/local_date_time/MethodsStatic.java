package local_date_time;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MethodsStatic {

	public MethodsStatic() {
		
		// from()
		LocalDateTime.from(ZonedDateTime.now());
		LocalDateTime.from(OffsetDateTime.now());
		//LocalDateTime.from(Instant.now());			//The rest dont work
		//LocalDate.from(LocalTime.now());
		//LocalDateTime.from(LocalDate.now());

		// of()
		System.out.println(LocalDateTime.of(LocalDate.now(), LocalTime.now()));
		System.out.println(LocalDateTime.of(2018, 12, 21, 12, 43));
		System.out.println(LocalDateTime.of(2018, Month.APRIL, 23, 12, 44));
		System.out.println(LocalDateTime.of(2018, 9, 12, 23, 32, 12));
		System.out.println(LocalDateTime.of(2018, Month.JULY, 21, 12, 22, 32));
		System.out.println(LocalDateTime.of(2017, 11, 21, 11, 22, 33, 44));
		System.out.println(LocalDateTime.of(2018, Month.MAY, 11, 1, 1, 1, 1));
		
		// ofEpochSecond()
		System.out.println(LocalDateTime.ofEpochSecond(1, 1, ZoneOffset.UTC));
		
		// ofInstant()
		System.out.println(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
		
		// parse(CharSequence text)		- fromat: '2018-12-21T12:43'
		System.out.println(LocalDateTime.parse("2015-12-21T12:43"));
		
		// parse(CharSequence text, DateTimeFormatter formatter)
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy kk-mm-ss", Locale.US);
		System.out.println(LocalDateTime.parse("23-Mar-2010 22-11-12", dateTimeFormatter));
		
		
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new MethodsStatic();
	}
}

