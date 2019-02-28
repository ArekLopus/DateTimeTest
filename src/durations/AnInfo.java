package durations;

//		Duration
//-A Duration is the amount of time between two instants.
//-You can get the length of a Duration in conventional units by calling toNanos, toMillis, toSeconds, toMinutes, toHours, or toDays.
//-NOTE: The Instant and Duration classes are immutable, and all methods, such as multipliedBy or minus, return a new instance.

//-A time-based amount of time, such as '34.5 seconds'.
//-This class models a quantity or amount of time in terms of seconds and nanoseconds.
//-It can be accessed using other duration-based units, such as minutes and hours.
//-In addition, the DAYS unit can be used and is treated as exactly equal to 24 hours, thus ignoring daylight savings effects.
//-See Period for the date-based equivalent to this class.
//
//-A physical duration could be of infinite length. For practicality, the duration is stored with constraints similar to Instant.
// The duration uses nanosecond resolution with a maximum value of the seconds that can be held in a long.
// This is greater than the current estimated age of the universe.
//
//-The range of a duration requires the storage of a number larger than a long. To achieve this, the class stores a long representing
//seconds and an int representing nanosecond-of-second, which will always be between 0 and 999,999,999. The model is of a directed duration,
// meaning that the duration may be negative.
//
//-The duration is measured in "seconds", but these are not necessarily identical to the scientific "SI second" definition based
// on atomic clocks. This difference only impacts durations measured near a leap-second and should not affect most applications.
// See Instant for a discussion as to the meaning of the second and time-scales.
//
//-This is a value-based class; use of identity-sensitive operations (including reference equality (==), identity hash code,
// or synchronization) on instances of Duration may have unpredictable results and should be avoided.
//-The equals method should be used for comparisons.

//Field Summary
//	static ZERO		- Constant for a duration of zero.

//Method Summary
// abs()								- Returns a copy of this duration with a positive length.
// addTo​(Temporal temporal)				- Adds this duration to the specified temporal object.
// static between​(Temporal startInclusive, Temporal endExclusive)
//										- Obtains a Duration representing the duration between two temporal objects.
// dividedBy​(long divisor)				- Returns a copy of this duration divided by the specified value.
// dividedBy​(Duration divisor)			- Returns number of whole times a specified Duration occurs within this Duration.
// static from​(TemporalAmount amount)	- Obtains an instance of Duration from a temporal amount.
// get​(TemporalUnit unit)				- Gets the value of the requested unit.
// getNano()							- Gets the number of nanoseconds within the second in this duration.
// getSeconds()							- Gets the number of seconds in this duration.
// getUnits()							- Gets the set of units supported by this duration.
// hashCode()							- A hash code for this duration.
// isNegative()							- Checks if this duration is negative, excluding zero.
// isZero()								- Checks if this duration is zero length.
// minus​(long amountToSubtract, TemporalUnit unit)
//										- Returns a copy of this duration with the specified duration subtracted.
// minus​(Duration duration)				- Returns a copy of this duration with the specified duration subtracted.
// minusDays​(long daysToSubtract)		- Returns a copy of this duration with the specified duration in standard 24 hour days subtracted.
// minusHours​(long hoursToSubtract)		- Returns a copy of this duration with the specified duration in hours subtracted.
// minusMillis​(long millisToSubtract)	- Returns a copy of this duration with the specified duration in milliseconds subtracted.
// minusMinutes​(long minutesToSubtract)	- Returns a copy of this duration with the specified duration in minutes subtracted.
// minusNanos​(long nanosToSubtract)		- Returns a copy of this duration with the specified duration in nanoseconds subtracted.
// minusSeconds​(long secondsToSubtract)	- Returns a copy of this duration with the specified duration in seconds subtracted.
// multipliedBy​(long multiplicand)	 	- Returns a copy of this duration multiplied by the scalar.
// negated()							- Returns a copy of this duration with the length negated.
// static of​(long amt, TemporalUnit u) 	- Obtains a Duration representing an amount in the specified unit.
// static ofDays​(long days)				- Obtains a Duration representing a number of standard 24 hour days.
// static ofHours​(long hours)	 		- Obtains a Duration representing a number of standard hours.
// static ofMillis​(long millis)			- Obtains a Duration representing a number of milliseconds.
// static ofMinutes​(long minutes)		- Obtains a Duration representing a number of standard minutes.
// static ofNanos​(long nanos)			- Obtains a Duration representing a number of nanoseconds.
// static ofSeconds​(long seconds)		- Obtains a Duration representing a number of seconds.
// static ofSeconds​(long seconds, long nanoAdjustment)
//										- Obtains a Duration representing a number of seconds and an adjustment in nanoseconds.
// static parse​(CharSequence text)		- Obtains a Duration from a text string such as PnDTnHnMn.nS.
// plus​(long amToAdd, TemporalUnit u)	- Returns a copy of this duration with the specified duration added.
// plus​(Duration duration)				- Returns a copy of this duration with the specified duration added.
// plusDays​(long daysToAdd)				- Returns a copy of this duration with the specified duration in standard 24 hour days added.
// plusHours​(long hoursToAdd)			- Returns a copy of this duration with the specified duration in hours added.
// plusMillis​(long millisToAdd)			- Returns a copy of this duration with the specified duration in milliseconds added.
// plusMinutes​(long minutesToAdd)		- Returns a copy of this duration with the specified duration in minutes added.
// plusNanos​(long nanosToAdd)			- Returns a copy of this duration with the specified duration in nanoseconds added.
// plusSeconds​(long secondsToAdd)		- Returns a copy of this duration with the specified duration in seconds added.
// subtractFrom​(Temporal temporal)		- Subtracts this duration from the specified temporal object.
// toDays()								- Gets the number of days in this duration.
// toDaysPart()							- Extracts the number of days in the duration.
// toHours()							- Gets the number of hours in this duration.
// toHoursPart()						- Extracts the number of hours part in the duration.
// toMillis()							- Converts this duration to the total length in milliseconds.
// toMillisPart()						- Extracts the number of milliseconds part of the duration.
// toMinutes()							- Gets the number of minutes in this duration.
// toMinutesPart()						- Extracts the number of minutes part in the duration.
// toNanos()							- Converts this duration to the total length in nanoseconds expressed as a long.
// toNanosPart()						- Get the nanoseconds part within seconds of the duration.
// toSeconds()							- Gets the number of seconds in this duration.
// toSecondsPart()						- Extracts the number of seconds part in the duration.
// toString()							- A string representation of this duration using ISO-8601 seconds based representation, such as PT8H6M12.345S.
// truncatedTo​(TemporalUnit unit)		- Returns a copy of this Duration truncated to the specified unit.
// withNanos​(int nanoOfSecond)			- Returns a copy of this duration with the specified nano-of-second.
// withSeconds​(long seconds)			- Returns a copy of this duration with the specified amount of seconds.


public class AnInfo {}
