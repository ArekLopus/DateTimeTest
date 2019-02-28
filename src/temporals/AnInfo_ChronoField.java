package temporals;

//		ChronoField		enum
//All Implemented Interfaces:	Serializable, Comparable<ChronoField>, TemporalField

//-A standard set of fields.
//-This set of fields provide field-based access to manipulate a date, time or date-time.
//-The standard set of fields can be extended by implementing TemporalField.

//-These fields are intended to be applicable in multiple calendar systems. For example, most non-ISO calendar systems define dates
// as a year, month and day, just with slightly different rules. The documentation of each field explains how it operates.

//Implementation Requirements:
//-This is a final, immutable and thread-safe enum.

//	Enum Constant Summary
// • ALIGNED_DAY_OF_WEEK_IN_MONTH	- The aligned day-of-week within a month.
// • ALIGNED_DAY_OF_WEEK_IN_YEAR		- The aligned day-of-week within a year.
// • ALIGNED_WEEK_OF_MONTH			- The aligned week within a month.
// • ALIGNED_WEEK_OF_YEAR			- The aligned week within a year.
// • AMPM_OF_DAY						- The am-pm-of-day.
// • CLOCK_HOUR_OF_AMPM				- The clock-hour-of-am-pm.
// • CLOCK_HOUR_OF_DAY				- The clock-hour-of-day.
// • DAY_OF_MONTH					- The day-of-month.
// • DAY_OF_WEEK						- The day-of-week, such as Tuesday.
// • DAY_OF_YEAR						- The day-of-year.
// • EPOCH_DAY						- The epoch-day, based on the Java epoch of 1970-01-01 (ISO).
// • ERA								- The era.
// • HOUR_OF_AMPM					- The hour-of-am-pm.
// • HOUR_OF_DAY						- The hour-of-day.
// • INSTANT_SECONDS					- The instant epoch-seconds.
// • MICRO_OF_DAY					- The micro-of-day.
// • MICRO_OF_SECOND					- The micro-of-second.
// • MILLI_OF_DAY					- The milli-of-day.
// • MILLI_OF_SECOND					- The milli-of-second.
// • MINUTE_OF_DAY					- The minute-of-day.
// • MINUTE_OF_HOUR					- The minute-of-hour.
// • MONTH_OF_YEAR					- The month-of-year, such as March.
// • NANO_OF_DAY						- The nano-of-day.
// • NANO_OF_SECOND					- The nano-of-second.
// • OFFSET_SECONDS					- The offset from UTC/Greenwich.
// • PROLEPTIC_MONTH					- The proleptic-month based, counting months sequentially from year 0.
// • SECOND_OF_DAY					- The second-of-day.
// • SECOND_OF_MINUTE				- The second-of-minute.
// • YEAR							- The proleptic year, such as 2012.
// • YEAR_OF_ERA						- The year within the era.

//	Method Summary
// • checkValidIntValue​(long value)	- Checks that the specified value is valid and fits in an int.
// • checkValidValue​(long value)	- Checks that the specified value is valid for this field.
// • isDateBased()					- Checks if this field represents a component of a date.
// • isTimeBased()					- Checks if this field represents a component of a time.
// • range()						- Gets the range of valid values for the field.
// • static valueOf​(String name)	- Returns the enum constant of this type with the specified name.
// • static values()				- Returns an array containing the constants of this enum type, in the order they are declared.

public class AnInfo_ChronoField {}
