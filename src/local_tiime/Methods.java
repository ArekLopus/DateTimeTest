package local_tiime;

import java.time.LocalTime;

public class Methods {

	public Methods() {
		
		LocalTime now = LocalTime.now();
		System.out.println(now);
				
		// adjustInto(Temporal temporal) - Adjusts the specified temporal object to have the same date and time as this object.
		
		// atDate(LocalDate date) - Combines this time with a date to create a LocalDateTime.
		
		// atOffset(ZoneOffset offset) - Combines this time with an offset time to create an OffsetDateTime.
		
		// format(DateTimeFormatter formatter) - Formats this time using the specified formatter.
		
		// get(TemporalField field) - Gets the value of the specified field from this time as an int.

		// getHour() - Gets the hour-of-day field.
		// getLong(TemporalField field) - Gets the value of the specified field from this time as a long.
		// getMinute() - Gets the minute-of-hour field.
		// getNano() - Gets the nano-of-second field.
		// getSecond() - Gets the second-of-minute field.
		
		// isAfter(LocalTime other) - Checks if this time is after the specified time.
		// isBefore(LocalTime other) - Checks if this time is before the specified time.
		
		// isSupported(TemporalField field) - Checks if the specified field is supported.
		// isSupported(TemporalUnit unit) - Checks if the specified unit is supported.
		
		// minus(long amountToSubtract, TemporalUnit unit) - Returns a copy of this time with the specified amount subtracted.
		// minus(TemporalAmount amountToSubtract) - Returns a copy of this time with the specified amount subtracted.
		// minusHours(long hoursToSubtract) - Returns a copy of this LocalTime with the specified number of hours subtracted.
		// minusMinutes(long minutesToSubtract) - Returns a copy of this LocalTime with the specified number of minutes subtracted.
		// minusNanos(long nanos) - Returns a copy of this LocalTime with the specified number of nanoseconds subtracted.
		// minusSeconds(long seconds) - Returns a copy of this LocalTime with the specified number of seconds subtracted.
		
		// plus(long amountToAdd, TemporalUnit unit) - Returns a copy of this time with the specified amount added.
		// plus(TemporalAmount amountToAdd) - Returns a copy of this time with the specified amount added.
		// plusHours(long hoursToAdd) - Returns a copy of this LocalTime with the specified number of hours added.
		// plusMinutes(long minutesToAdd) - Returns a copy of this LocalTime with the specified number of minutes added.
		// plusNanos(long nanos) - Returns a copy of this LocalTime with the specified number of nanoseconds added.
		// plusSeconds(long seconds) - Returns a copy of this LocalTime with the specified number of seconds added.
		
		// query(TemporalQuery<R> query) - Queries this time using the specified query.

		// range(TemporalField field) - Gets the range of valid values for the specified field.

		// toNanoOfDay() - Extracts the time as nanos of day, from 0 to 24 * 60 * 60 * 1,000,000,000 - 1.
		// toSecondOfDay() - Extracts the time as seconds of day, from 0 to 24 * 60 * 60 - 1.

		// truncatedTo(TemporalUnit unit) - Returns a copy of this LocalTime with the time truncated.

		// until(Temporal endExclusive, TemporalUnit unit) - Calculates the amount of time until another time in terms of the specified unit.

		// with(TemporalAdjuster adjuster) - Returns an adjusted copy of this time.
		// with(TemporalField field, long newValue) - Returns a copy of this time with the specified field set to a new value.
		// withHour(int hour) - Returns a copy of this LocalTime with the hour-of-day altered.
		// withMinute(int minute) - Returns a copy of this LocalTime with the minute-of-hour altered.
		// withNano(int nanoOfSecond) - Returns a copy of this LocalTime with the nano-of-second altered.
		// withSecond(int second) - Returns a copy of this LocalTime with the second-of-minute altered.
	    
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new Methods();
	}
}

