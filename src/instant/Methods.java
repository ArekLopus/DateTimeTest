package instant;

import java.time.Duration;
import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalQueries;
import java.util.Set;

public class Methods {

	public Methods() {
		
		Instant now = Instant.now();
		System.out.println(now);
		Instant parsed = Instant.parse("2018-02-22T17:18:06.408Z");
		ZonedDateTime zonedNow = ZonedDateTime.now();
		
		// adjustInto(Temporal temporal) - method adjusts the specified temporal object to have this instant.
		ZonedDateTime adjustInto = (ZonedDateTime) parsed.adjustInto(zonedNow);
		System.out.println(adjustInto);
		
		// atOffset(ZoneOffset offset) - method combines this instant with an offset to create an OffsetDateTime.
	    ZoneOffset offset = ZoneOffset.ofHours(12);
	    OffsetDateTime date = now.atOffset(offset);
	    System.out.println(date);  
		
	    // atZone(ZoneId zone) - method combines this instant with a time-zone to create a ZonedDateTime.
	    Set<String> zones = ZoneId.getAvailableZoneIds();
	    ZoneId zone = ZoneId.of(zones.iterator().next());
	    ZonedDateTime date2 = now.atZone(zone);
	    System.out.println(date2); 
	    
	    // get(TemporalField field) - method gets the value of the specified field from this instant as an int.
	    System.out.println(now.get(ChronoField.MILLI_OF_SECOND));
	    
	    // toEpochMilli() - Converts this instant to the number of milliseconds from the epoch of 1970-01-01T00:00:00Z.
	    System.out.println(now.toEpochMilli());
	    
	    // getEpochSecond()- method gets the number of seconds from the Java epoch of 1970-01-01T00:00:00Z.
	    System.out.println(now.getEpochSecond());
	    
	    // getNano() - Gets the number of nanoseconds, later along the time-line, from the start of the second.
	    System.out.println(now.getNano());
	    
	    // isAfter(Instant otherInstant) - Checks if this instant is after the specified instant.
	    System.out.println(now.isAfter(parsed));
	    
	    // isBefore(Instant otherInstant) - Checks if this instant is before the specified instant.
	    System.out.println(parsed.isBefore(now));
	    
	    // isSupported(TemporalField field) - Checks if the specified field is supported.
	    System.out.println(now.isSupported(ChronoField.EPOCH_DAY));
	    
	    // isSupported(TemporalUnit unit) - Checks if the specified unit is supported.
	    System.out.println(now.isSupported(ChronoUnit.SECONDS));
	    
	    // minus(long amountToSubtract, TemporalUnit unit) - Returns a copy of this instant with the specified amount subtracted.
	    System.out.println(now.minus(10, ChronoUnit.DAYS));
	    
	    // minus(TemporalAmount amountToSubtract) - Returns a copy of this instant with the specified amount subtracted.
	    Duration duration = Duration.ofDays(9); 
	    System.out.println(now.minus(duration));
	    
		// minusMillis(long millisToSubtract) - Returns a copy of this instant with the specified duration in XXX subtracted.
	    // minusNanos(long nanosToSubtract)
	    // minusSeconds(long secondsToSubtract)
	    
	    // plus(long amountToAdd, TemporalUnit unit) - Returns a copy of this instant with the specified amount added.
	    System.out.println(now.plus(10, ChronoUnit.DAYS));
	    
	    // plus(TemporalAmount amountToAdd) - Returns a copy of this instant with the specified amount added.
	    System.out.println(now.plus(duration));
	    
	    // plusMillis(long millisToAdd) - Returns a copy of this instant with the specified duration in XXX added.
	    // plusNanos(long nanosToAdd)
	    // plusSeconds(long secondsToAdd)
	    
	    // query(TemporalQuery query) - Queries this instant using the specified query.
	    System.out.printf("Instant precision is %s%n", now.query(TemporalQueries.precision()));
	    
	    // range(TemporalField field) - Gets the range of valid values for the specified field.
	    System.out.println("Range : " + now.range(ChronoField.NANO_OF_SECOND ));
	    
	    // truncatedTo(TemporalUnit unit) - Returns a copy of this Instant truncated to the specified unit.
	    System.out.println(now.truncatedTo(ChronoUnit.HOURS));
	    
	    // until(Temporal endExclusive, TemporalUnit unit) -  Calculates the amount of time until another instant in terms of the specified unit.
	    System.out.println(parsed.until(now, ChronoUnit.DAYS));
	    
	    // with(TemporalAdjuster adjuster) - Returns an adjusted copy of this instant.
	    System.out.println(now.with(parsed));
	    
	    // with(TemporalField field, long newValue) - Returns a copy of this instant with the specified field set to a new value.
	    System.out.println(now.with(ChronoField.MILLI_OF_SECOND, 200));

	    
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new Methods();
	}
}

