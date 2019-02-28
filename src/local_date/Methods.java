package local_date;

import java.time.LocalDate;

public class Methods {

	public Methods() {
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
				
		// adjustInto(Temporal temporal) - Adjusts the specified temporal object to have the same date as this object.

		// atStartOfDay() - Combines this date with the time of midnight to create a LocalDateTime at the start of this date.
		
		// atStartOfDay(ZoneId zone) - Returns a zoned date-time from this date at the earliest valid time according to the rules in the time-zone.

		// atTime(int hour, int minute) - Combines this date with a time to create a LocalDateTime.
		// atTime(int hour, int minute, int second) - Combines this date with a time to create a LocalDateTime.
		// atTime(int hour, int minute, int second, int nanoOfSecond) - Combines this date with a time to create a LocalDateTime.
		// atTime(LocalTime time) - Combines this date with a time to create a LocalDateTime.
		// atTime(OffsetTime time) - Combines this date with an offset time to create an OffsetDateTime.

		// format(DateTimeFormatter formatter) - Formats this date using the specified formatter.
		
		// get(TemporalField field) - Gets the value of the specified field from this date as an int.

		// getChronology() - Gets the chronology of this date, which is the ISO calendar system.

		// getDayOfMonth() - Gets the day-of-month field.
		// getDayOfWeek() - Sets the day-of-week field, which is an enum DayOfWeek.
		// getDayOfYear() - Gets the day-of-year field.
		// getEra() - Gets the era applicable at this date.
		// getLong(TemporalField field) - Gets the value of the specified field from this date as a long.
		// getMonth() - Gets the month-of-year field using the Month enum.
		// getMonthValue() - Gets the month-of-year field from 1 to 12.
		// getYear() - Gets the year field.
		
		// isAfter(ChronoLocalDate other) - Checks if this date is after the specified date.
		// isBefore(ChronoLocalDate other) - Checks if this date is before the specified date.
		
		// isEqual(ChronoLocalDate other) - Checks if this date is equal to the specified date.
		
		// isLeapYear() - Checks if the year is a leap year, according to the ISO proleptic calendar system rules.

		// isSupported(TemporalField field) - Checks if the specified field is supported.
		// isSupported(TemporalUnit unit) - Checks if the specified unit is supported.

		// lengthOfMonth() - Returns the length of the month represented by this date.
		// lengthOfYear() - Returns the length of the year represented by this date.

		// minus(long amountToSubtract, TemporalUnit unit) - Returns a copy of this date with the specified amount subtracted.
		// minus(TemporalAmount amountToSubtract) - Returns a copy of this date with the specified amount subtracted.
		// minusDays(long daysToSubtract) - Returns a copy of this LocalDate with the specified number of days subtracted.
		// minusMonths(long monthsToSubtract) - Returns a copy of this LocalDate with the specified number of months subtracted.
		// minusWeeks(long weeksToSubtract) - Returns a copy of this LocalDate with the specified number of weeks subtracted.
		// minusYears(long yearsToSubtract) - Returns a copy of this LocalDate with the specified number of years subtracted.

		// plus(long amountToAdd, TemporalUnit unit) - Returns a copy of this date with the specified amount added.
		// plus(TemporalAmount amountToAdd) - Returns a copy of this date with the specified amount added.
		// plusDays(long daysToAdd) - Returns a copy of this LocalDate with the specified number of days added.
		// plusMonths(long monthsToAdd) - Returns a copy of this LocalDate with the specified number of months added.
		// plusWeeks(long weeksToAdd) - Returns a copy of this LocalDate with the specified number of weeks added.
		// plusYears(long yearsToAdd) - Returns a copy of this LocalDate with the specified number of years added.

		// query(TemporalQuery<R> query) - Queries this date using the specified query.

		// range(TemporalField field) - Gets the range of valid values for the specified field.

		// toEpochDay() - Converts this date to the Epoch Day.

		// until(ChronoLocalDate endDateExclusive) - Calculates the period between this date and another date as a Period.
		// until(Temporal endExclusive, TemporalUnit unit) - Calculates the amount of time until another date in terms of the specified unit.

		// with(TemporalAdjuster adjuster) - Returns an adjusted copy of this date.
		// with(TemporalField field, long newValue) - Returns a copy of this date with the specified field set to a new value.
		// withDayOfMonth(int dayOfMonth) - Returns a copy of this LocalDate with the day-of-month altered.
		// withDayOfYear(int dayOfYear) - Returns a copy of this LocalDate with the day-of-year altered.
		// withMonth(int month) - Returns a copy of this LocalDate with the month-of-year altered.
		// withYear(int year) - Returns a copy of this LocalDate with the year altered.

	    
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new Methods();
	}
}

