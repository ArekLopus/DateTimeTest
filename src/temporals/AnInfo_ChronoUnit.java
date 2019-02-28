package temporals;

//		ChronoUnit		enum
//All Implemented Interfaces:	Serializable, Comparable<ChronoUnit>, TemporalUnit

//-A standard set of date periods units.
//-This set of units provide unit-based access to manipulate a date, time or date-time. 
// The standard set of units can be extended by implementing TemporalUnit.

//-These units are intended to be applicable in multiple calendar systems.
//-For example, most non-ISO calendar systems define units of years, months and days, just with slightly different rules.
// The documentation of each unit explains how it operates.

//	Implementation Requirements:
//-This is a final, immutable and thread-safe enum.

//	Enum Constant Summary
// • CENTURIES	- Unit that represents the concept of a century.
// • DAYS		- Unit that represents the concept of a day.
// • DECADES	- Unit that represents the concept of a decade.
// • ERAS		- Unit that represents the concept of an era.
// • FOREVER	- Artificial unit that represents the concept of forever.
// • HALF_DAYS	- Unit that represents the concept of half a day, as used in AM/PM.
// • HOURS		- Unit that represents the concept of an hour.
// • MICROS		- Unit that represents the concept of a microsecond.
// • MILLENNIA	- Unit that represents the concept of a millennium.
// • MILLIS		- Unit that represents the concept of a millisecond.
// • MINUTES	- Unit that represents the concept of a minute.
// • MONTHS		- Unit that represents the concept of a month.
// • NANOS		- Unit that represents the concept of a nanosecond, the smallest supported unit of time.
// • SECONDS	- Unit that represents the concept of a second.
// • WEEKS		- Unit that represents the concept of a week.
// • YEARS		- Unit that represents the concept of a year.

//	Method Summary
// • getDuration()					- Gets the estimated duration of this unit in the ISO calendar system.
// • isDateBased()					- Checks if this unit is a date unit.
// • isDurationEstimated()			- Checks if the duration of the unit is an estimate.
// • isTimeBased()					- Checks if this unit is a time unit.
// • static valueOf​(String name)	- Returns the enum constant of this type with the specified name.
// • static values()				- Returns an array containing the constants of this enum type, in the order they are declared.

public class AnInfo_ChronoUnit {}
