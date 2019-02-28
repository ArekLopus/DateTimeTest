package local_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class MethodsStatic {

	public MethodsStatic() {
		
		// from()
		LocalDate.from(ZonedDateTime.now());
		LocalDate.from(OffsetDateTime.now());
		LocalDate.from(LocalDateTime.now());
		//LocalDate.from(Instant.now());			//The rest dont work
		//LocalDate.from(LocalTime.now());
		
		// of()
		System.out.println(LocalDate.of(2018, 1, 11));
		System.out.println(LocalDate.of(2018, Month.DECEMBER, 24));
		
		// ofEpochDay() - Obtains an instance of LocalDate from the epoch day count.
		System.out.println(LocalDate.ofEpochDay(1));
		
		// ofYearDay() - Obtains an instance of LocalDate from a year and day-of-year.
		System.out.println(LocalDate.ofYearDay(2018, 100));
		
		// parse(CharSequence text)		- fromat: '2018-01-11'
		System.out.println(LocalDate.parse("2017-02-03"));
		
		// parse(CharSequence text, DateTimeFormatter formatter)
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.US);
		System.out.println(LocalDate.parse("23 Mar 2018", dateTimeFormatter));
		
		
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new MethodsStatic();
	}
}

