package a.info;

//		The Time Line
//-The Java Date and Time API specification requires that Java uses a time scale that 
// • Has 86,400 seconds per day
// • Exactly matches the official time at noon each day
// • Closely matches it elsewhere, in a precisely defined way
//That gives Java the flexibility to adjust to future changes in the official time.

//-In Java, an Instant represents a point on the time line. An origin, called the epoch, is arbitrarily set
// at midnight of January 1, 1970 at the prime meridian that passes through the Greenwich Royal Observatory in London.
//-This is the same convention used in the Unix/POSIX time.

//-Starting from that origin, time is measured in 86,400 seconds per day, forwards and backwards, in nanosecond precision.
//-The Instant values go back as far as a billion years (Instant.MIN). That’s not quite enough to express the age of the universe
// (around 13.5 billion years), but it should be enough for all practical purposes. After all, a billion years ago, the earth was covered
// in ice and populated by microsocopic ancestors of today’s plants and animals.
//-The largest value, Instant.MAX, is December 31 of the year 1,000,000,000.

//-The static method call Instant.now() gives the current instant.
//-You can compare two instants with the equals and compareTo methods in the usual way, so you can use instants as timestamps.

//-To find out the difference between two instants, use the static Duration.between(). 
//-For example, here is how you can measure the running time of an algorithm:
//	Instant start = Instant.now();
//	runAlgorithm();
//	Instant end = Instant.now();
//	Duration timeElapsed = Duration.between(start, end);
//	long millis = timeElapsed.toMillis();

//-A Duration is the amount of time between two instants.
//-You can get the length of a Duration in conventional units by calling toNanos, toMillis, toSeconds, toMinutes, toHours, or toDays.
//-Durations require more than a long value for their internal storage. The number of seconds is stored in a long, and the number of nanoseconds in an additional int. If you want to make computations in nanosecs accuracy, and you need the entire range of a Duration, then you can use one of the methods in Table 5–1. Otherwise, you can just call toNanos and do your calculations with long values.

//Arithmetic Operations for Time Instants and Durations
//	plus, minus								- Adds a duration to, or subtracts a duration from, this Instant or Duration.
//	plusNanos, plusMillis, plusSeconds,		- Adds a number of the given time units to this Instant or Duration.
//	plusMinutes, plusHours, plusDays
//	minusNanos, minusMillis, minusSeconds,	- Subtracts a number of the given time units from this Instant or Duration.
//	minusMinutes, minusHours, minusDays
//	multipliedBy, dividedBy, negated		- Returns a duration that is obtained by multiplying or dividing this Duration by a
//											  given long, or by –1. Note that you can scale only durations, not instants.
//isZero, isNegative						- Checks whether this Duration is zero or negative.

//-For example, if you want to check whether an algorithm is at least ten times faster than another, you can compute
//	Duration timeElapsed2 = Duration.between(start2, end2);
//	boolean overTenTimesFaster = timeElapsed.multipliedBy(10).minus(timeElapsed2).isNegative();
// Or timeElapsed.toNanos() * 10 < timeElapsed2.toNanos()

//NOTE: The Instant and Duration classes are immutable, and all methods, such as multipliedBy or minus, return a new instance.




public class Info_Time_Absolute {}