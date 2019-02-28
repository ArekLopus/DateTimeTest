package offset;

//		OffsetDateTime		- class OffsetDateTimei mplements Serializable, Comparable<OffsetDateTime>, Temporal, TemporalAccessor, TemporalAdjuster

//-A date-time with an offset from UTC/Greenwich in the ISO-8601 calendar system, such as 2007-12-03T10:15:30+01:00.
//-OffsetDateTime is an immutable representation of a date-time with an offset.
//-This class stores all date and time fields, to a precision of nanoseconds, as well as the offset from UTC/Greenwich.
// For example, the value "2nd October 2007 at 13:45:30.123456789 +02:00" can be stored in an OffsetDateTime.
//
//-OffsetDateTime, ZonedDateTime and Instant all store an instant on the time-line to nanosecond precision.
//Instant is the simplest, simply representing the instant.
// OffsetDateTime adds to the instant the offset from UTC/Greenwich, which allows the local date-time to be obtained.
// ZonedDateTime adds full time-zone rules.
//
//-It is intended that ZonedDateTime or Instant is used to model data in simpler applications.
// This class may be used when modeling date-time concepts in more detail, or when communicating to a database or in a network protocol.
//
//-This is a value-based class; use of identity-sensitive operations (including reference equality (==), identity hash code,
// or synchronization) on instances of OffsetDateTime may have unpredictable results and should be avoided.
//-The equals method should be used for comparisons.
//
//-This class is immutable and thread-safe.

public class Info_OffsetDateTime {}