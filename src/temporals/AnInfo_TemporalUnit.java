package temporals;

//		TemporalUnit	interface
//All Known Implementing Classes:	ChronoUnit

//-A unit of date-time, such as Days or Hours.
//-Measurement of time is built on units, such as years, months, days, hours, minutes and seconds.
// Implementations of this interface represent those units.

//-An instance of this interface represents the unit itself, rather than an amount of the unit.
// See Period for a class that represents an amount in terms of the common units.

//-The most commonly used units are defined in ChronoUnit.
//-Further units are supplied in IsoFields.
//-Units can also be written by application code by implementing this interface.

//-The unit works using double dispatch. Client code calls methods on a date-time like LocalDateTime which check if the unit is a ChronoUnit.
// If it is, then the date-time must handle it. Otherwise, the method call is re-dispatched to the matching method in this interface.

//	Implementation Requirements:
//-This interface must be implemented with care to ensure other classes operate correctly. All implementations that can be instantiated must be final, immutable and thread-safe. It is recommended to use an enum where possible.

//	Method Summary
// • addTo​(R temporal, long amount)										- Returns a copy of the specified temporal object with the specified period added.
// • between​(Temporal temporal1Inclusive, Temporal temporal2Exclusive)	- Calculates the amount of time between two temporal objects.
// • getDuration()														- Gets the duration of this unit, which may be an estimate.
// • isDateBased()														- Checks if this unit represents a component of a date.
// • isDurationEstimated()												- Checks if the duration of the unit is an estimate.
// • isSupportedBy​(Temporal temporal)									- Checks if this unit is supported by the specified temporal object.
// • isTimeBased()														- Checks if this unit represents a component of a time.

public class AnInfo_TemporalUnit {}
