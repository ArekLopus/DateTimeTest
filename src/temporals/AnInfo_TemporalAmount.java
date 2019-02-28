package temporals;

//		TemporalAmount	interface
//All Known Subinterfaces:			ChronoPeriod
//All Known Implementing Classes:	Duration, Period

//-Framework-level interface defining an amount of time, such as "6 hours", "8 days" or "2 years and 3 months".
//-This is the base interface type for amounts of time. 
//-An amount is distinct from a date or time-of-day in that it is not tied to any specific point on the time-line.

//-The amount can be thought of as a Map of TemporalUnit to long, exposed via getUnits() and get(TemporalUnit).
//-A simple case might have a single unit-value pair, such as "6 hours".
//-A more complex case may have multiple unit-value pairs, such as "7 years, 3 months and 5 days".

//-There are two common implementations.
//-Period is a date-based implementation, storing years, months and days.
//-Duration is a time-based implementation, storing seconds and nanoseconds, but providing some access using other duration based units
// such as minutes, hours and fixed 24-hour days.

//-This interface is a framework-level interface that should not be widely used in application code.
// Instead, applications should create and pass around instances of concrete types, such as Period and Duration.

//Implementation Requirements:
//-This interface places no restrictions on the mutability of implementations, however immutability is strongly recommended.

//	Method Summary
// • addTo​(Temporal temporal)			- Adds to the specified temporal object.
// • get​(TemporalUnit unit)			- Returns the value of the requested unit.
// • getUnits()						- Returns the list of units uniquely defining the value of this TemporalAmount.
// • subtractFrom​(Temporal temporal)	- Subtracts this object from the specified temporal object.

public class AnInfo_TemporalAmount {}
