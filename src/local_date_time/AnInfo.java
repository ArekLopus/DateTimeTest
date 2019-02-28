package local_date_time;

//		LocalDateTime	- class LocalDateTime implements Serializable, Comparable<ChronoLocalDateTime<?>>, ChronoLocalDateTime<LocalDate>,
//														 Temporal, TemporalAccessor, TemporalAdjuster
//
//-A date-time without a time-zone in the ISO-8601 calendar system, such as 2007-12-03T10:15:30.
//-LocalDateTime is an immutable date-time object that represents a date-time, often viewed as year-month-day-hour-minute-second.
//-Other date and time fields, such as day-of-year, day-of-week and week-of-year, can also be accessed.
//-Time is represented to nanosecond precision. Fe, the value "2nd October 2007 at 13:45.30.123456789" can be stored in a LocalDateTime.
//
//-This class does not store or represent a time-zone.
//-Instead, it is a description of the date, as used for birthdays, combined with the local time as seen on a wall clock.
//-It cannot represent an instant on the time-line without additional information such as an offset or time-zone.
//
//-The ISO-8601 calendar system is the modern civil calendar system used today in most of the world.
//-It is equivalent to the proleptic Gregorian calendar system, in which today's rules for leap years are applied for all time.
//-For most applications written today, the ISO-8601 rules are entirely suitable. However, any application that makes use of historical dates,
// and requires them to be accurate will find the ISO-8601 approach unsuitable.
//
//-This is a value-based class; use of identity-sensitive operations (including reference equality (==), identity hash code,
// or synchronization) on instances of LocalDateTime may have unpredictable results and should be avoided.
//-The equals method should be used for comparisons.
//
//-This class is immutable and thread-safe.

public class AnInfo {}