package zoned;

//		ZonedDateTime	 - ZonedDateTime class implements Serializable, Comparable<ChronoZonedDateTime<?>>,
//														  ChronoZonedDateTime<LocalDate>, Temporal, TemporalAccessor

//-A date-time with a time-zone in the ISO-8601 calendar system, such as 2007-12-03T10:15:30+01:00 Europe/Paris.
//-ZonedDateTime is an immutable representation of a date-time with a time-zone.
//-This class stores all date and time fields, to a precision of nanoseconds, and a time-zone, with a zone offset used to handle ambiguous
// local date-times. Fe, the value "2nd Oct 2007 at 13:45.30.123456789 +02:00 in the Europe/Paris time-zone" can be stored in a ZonedDateTime.
//
//-This class handles conversion from the local time-line of LocalDateTime to the instant time-line of Instant.
// The difference between the two time-lines is the offset from UTC/Greenwich, represented by a ZoneOffset.
//
//-Converting between the two time-lines involves calculating the offset using the rules accessed from the ZoneId. Obtaining the offset for an instant is simple, as there is exactly one valid offset for each instant. By contrast, obtaining the offset for a local date-time is not straightforward. There are three cases:
// • Normal, with one valid offset. For the vast majority of the year, the normal case applies, where there is a single valid offset for the local date-time.
// • Gap, with zero valid offsets. This is when clocks jump forward typically due to the spring daylight savings change from "winter" to "summer". In a gap there are local date-time values with no valid offset.
// • Overlap, with two valid offsets. This is when clocks are set back typically due to the autumn daylight savings change from "summer" to "winter". In an overlap there are local date-time values with two valid offsets.
//-Any method that converts directly or implicitly from a local date-time to an instant by obtaining the offset
// has the potential to be complicated.
//
//-For Gaps, the general strategy is that if the local date-time falls in the middle of a Gap, then the resulting zoned date-time will have
// a local date-time shifted forwards by the length of the Gap, resulting in a date-time in the later offset, typically "summer" time.
//
//-For Overlaps, the general strategy is that if the local date-time falls in the middle of an Overlap, then the previous offset will
// be retained. If there is no previous offset, or the previous offset is invalid, then the earlier offset is used, typically "summer" time.
// Two additional methods, withEarlierOffsetAtOverlap() and withLaterOffsetAtOverlap(), help manage the case of an overlap.
//
//-In terms of design, this class should be viewed primarily as the combination of a LocalDateTime and a ZoneId. The ZoneOffset is a vital,
// but secondary, piece of information, used to ensure that the class represents an instant, especially during a daylight savings overlap.
//
//-This is a value-based class; use of identity-sensitive operations (including reference equality (==), identity hash code,
// or synchronization) on instances of ZonedDateTime may have unpredictable results and should be avoided.
//-The equals method should be used for comparisons.
//
//-A ZonedDateTime holds state equivalent to three separate objects, a LocalDateTime, a ZoneId and the resolved ZoneOffset. The offset and
// local date-time are used to define an instant when necessary. The zone ID is used to obtain the rules for how and when the offset changes.
// The offset cannot be freely set, as the zone controls which offsets are valid.
//-This class is immutable and thread-safe.

public class Info_ZonedDateTime {}