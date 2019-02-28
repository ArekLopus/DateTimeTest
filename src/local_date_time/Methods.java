package local_date_time;

import java.time.LocalDateTime;

public class Methods {

	public Methods() {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
				
		// adjustInto(Temporal temporal) - Adjusts the specified temporal object to have the same date and time as this object.

		// atOffset(ZoneOffset offset) - Combines this date-time with an offset time to create an OffsetDateTime.

		// atZone(ZoneId zone) - Combines this date-time with a timezone to create a ZonedDateTime.

		//format(DateTimeFormatter formatter) - Formats this date-time using the specified formatter.

		// from(TemporalAccessor temporal) - Obtains an instance of LocalDateTime from a temporal object.

		// get(TemporalField field) - Gets the value of the specified field from this date-time as an int.

		// getDayOfMonth() - Gets the day-of-month field.
		// getDayOfWeek() - Gets the day-of-week field, which is an enum DayOfWeek.
		// getDayOfYear() - Gets the day-of-year field.
		// getHour() - Gets the hour-of-day field.
		// getLong(TemporalField field) - Gets the value of the specified field from this date-time as a long.
		// getMinute() - Gets the minute-of-hour field.
		// getMonth() - Gets the month-of-year field using the Month enum.
		// getMonthValue() - Gets the month-of-year field from 1 to 12.
		// getNano() - Gets the nano-of-second field.
		// getSecond() - Gets the second-of-minute field.
		// getYear() - Gets the year field.
		
		// isAfter(ChronoLocalDateTime<?> other) - Checks if this date-time is after the specified date-time.
		// isBefore(ChronoLocalDateTime<?> other) - Checks if this date-time is before the specified date-time.
		// isEqual(ChronoLocalDateTime<?> other) - Checks if this date-time is equal to the specified date-time.

		// isSupported(TemporalField field) - Checks if the specified field is supported.
		// isSupported(TemporalUnit unit) - Checks if the specified unit is supported.

		// minus(long amountToSubtract, TemporalUnit unit) - Returns a copy of this date-time with the specified amount subtracted.
		// minus(TemporalAmount amountToSubtract) - Returns a copy of this date-time with the specified amount subtracted.
		// minusDays(long daysToSubtract) - Returns a copy of this LocalDateTime with the specified number of days subtracted.
		// minusHours(long hoursToSubtract) - Returns a copy of this LocalDateTime with the specified number of hours subtracted.
		// minusMinutes(long minutesToSubtract) - Returns a copy of this LocalDateTime with the specified number of minutes subtracted.
		// minusMonths(long monthsToSubtract) - Returns a copy of this LocalDateTime with the specified number of months subtracted.
		// minusNanos(long nanos) - Returns a copy of this LocalDateTime with the specified number of nanoseconds subtracted.
		// minusSeconds(long seconds) - Returns a copy of this LocalDateTime with the specified number of seconds subtracted.
		// minusWeeks(long weeksToSubtract) - Returns a copy of this LocalDateTime with the specified number of weeks subtracted.
		// minusYears(long yearsToSubtract) - Returns a copy of this LocalDateTime with the specified number of years subtracted.

	
		// plus(long amountToAdd, TemporalUnit unit) - Returns a copy of this date-time with the specified amount added.
		// plus(TemporalAmount amountToAdd) - Returns a copy of this date-time with the specified amount added.
		// plusDays(long daysToAdd) - Returns a copy of this LocalDateTime with the specified number of days added.
		// plusHours(long hoursToAdd) - Returns a copy of this LocalDateTime with the specified number of hours added.
		// plusMinutes(long minutesToAdd) - Returns a copy of this LocalDateTime with the specified number of minutes added.
		// plusMonths(long monthsToAdd) - Returns a copy of this LocalDateTime with the specified number of months added.
		// plusNanos(long nanos) - Returns a copy of this LocalDateTime with the specified number of nanoseconds added.
		// plusSeconds(long seconds) - Returns a copy of this LocalDateTime with the specified number of seconds added.
		// plusWeeks(long weeksToAdd) - Returns a copy of this LocalDateTime with the specified number of weeks added.
		// plusYears(long yearsToAdd) - Returns a copy of this LocalDateTime with the specified number of years added.
		
		// query(TemporalQuery<R> query) - Queries this date-time using the specified query.

		// range(TemporalField field) - Gets the range of valid values for the specified field.

		// toLocalDate() - Gets the LocalDate part of this date-time.
		// toLocalTime() - Gets the LocalTime part of this date-time.

		// truncatedTo(TemporalUnit unit) - Returns a copy of this LocalDateTime with the time truncated.

		// until(Temporal endExclusive, TemporalUnit unit) - Calculates the amount of time until another date-time in terms of the specified unit.

		// with(TemporalAdjuster adjuster) - Returns an adjusted copy of this date-time.
		// with(TemporalField field, long newValue) - Returns a copy of this date-time with the specified field set to a new value.
		// withDayOfMonth(int dayOfMonth) - Returns a copy of this LocalDateTime with the day-of-month altered.
		// withDayOfYear(int dayOfYear) - Returns a copy of this LocalDateTime with the day-of-year altered.
		// withHour(int hour) - Returns a copy of this LocalDateTime with the hour-of-day altered.
		// withMinute(int minute) - Returns a copy of this LocalDateTime with the minute-of-hour altered.
		// withMonth(int month) - Returns a copy of this LocalDateTime with the month-of-year altered.
		// withNano(int nanoOfSecond) - Returns a copy of this LocalDateTime with the nano-of-second altered.
		// withSecond(int second) - Returns a copy of this LocalDateTime with the second-of-minute altered.
		// withYear(int year) - Returns a copy of this LocalDateTime with the year altered.

	    
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new Methods();
	}
}

