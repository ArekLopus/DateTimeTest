package instant;

//		Instant		- class Instant implements Serializable, Comparable<Instant>, Temporal, TemporalAccessor, TemporalAdjuster
//-An instantaneous point on the time-line.
//-This class models a single instantaneous point on the time-line. This might be used to record event time-stamps in the application.
//-The instant is defined as an offset since the origin (called an epoch).
//-The origin is Jan. 1st 1970 - 00:00 - Greenwhich mean time (GMT).
//-Time is measured using 86.400 seconds per day, moving forward from the origin.

//-This is a value-based class; use of identity-sensitive operations (including reference equality (==), identity hash code,
// or synchronization) on instances of Instant may have unpredictable results and should be avoided.
//-The equals() should be used for comparisons.

//-Instant is LocalDateTime

//-A Duration is the amount of time between two instants.
//-To find out the difference between two instants, use the static Duration.between(). 
//-NOTE: The Instant and Duration classes are immutable, and all methods, such as multipliedBy or minus, return a new instance.

public class AnInfo {}