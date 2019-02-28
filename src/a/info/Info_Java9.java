package a.info;

//https://blog.joda.org/2017/02/java-time-jsr-310-enhancements-java-9.html

//	Main enhancements:
// • JDK-8146218 - Add LocalDate.datesUntil method producing Stream.
//-Adds two new methods - LocalDate.datesUntil(LocalDate) and LocalDate.datesUntil(LocalDate,Period) - returning a stream of dates.

// • JDK-8068730 - Increase precision of Clock.systemUTC().
//-The clock in Java - System.currentTimeMillis() - has ticked in milliseconds since Java was first released. With Java SE 9,
// users of Clock will see higher precision, depending on the available clock of the operating system.

// • JDK-8071919 - Clock.tickMillis(ZoneId zone) method.
// With the system clock now returning higher precision, a new method was added - Clock.tickMillis(ZoneId) - that chops off 
// the extra precision to restrore the millisecond ticking behaviour of Java SE 8.

// • JDK-8030864 - Add efficient getDateTimeMillis method to java.time.
//-This adds two methods named epochSecond to Chronology that have no object creation to convert date-time fields to an epoch-second.

// • JDK-8142936 - Duration methods for days, hours, minutes, seconds, etc.
//-The Java SE 8 API of Duration turned out to be incomplete for certain use cases. This change adds a slew of new methods
// that allow parts of the duration to be reliably returned.

// • JDK-8148849 - Truncating Duration.
//-Adds a method Duration.truncatedTo(TemporalUnit) to allow truncation, similar to the existing method on Instant.

// • JDK-8032510 - Add Duration.dividedBy(Duration).
//-A new method to allow a duration to be divided by another duration.

// • JDK-8133079 - LocalDate and LocalTime ofInstant() factory methods.
//-Add new factory methods in LocalDate and LocalTime to simplify conversion from Instant.

// • JDK-8143413 - Add toEpochSecond methods for efficient access.
//-Add methods to LocalDate, LocalTime and OffsetTime to optimize conversion to epoch-seconds.


//	Formatting:
/// • JDK-8148947 - DateTimeFormatter pattern letter 'g'.
//-This adds a pattern letter for modified Julian days.

// • JDK-8155823 - Add date-time patterns 'v' and 'vvvv'.
//-This adds support for the "generic non-location" format for time-zones as defined by CLDR, such as "Pacific Time" (the format 
// ignores daylight saving time). Methods were also added to the formatter builder - DateTimeFormatterBuilder.appendGenericZoneText().

// • JDK-8066806 - DateTimeFormatter cannot parse offset with single digit hour.
//-The formatter is extended to support 11 more time-zone offset formats, including single digit hours such as +2:00.

// • JDK-8031085 - DateTimeFormatter won't parse format "yyyyMMddHHmmssSSS".
//-This extends support for adjacent value parsing to fractions. Where in Java SE 8 a pattern like this looks like it should work,
// but doesn't, in Java SE 9 it just works.

// • JDK-8145633 - Adjacent value parsing for Localized Patterns .
//-This extends support for adjacent value parsing to localized patterns, such as week-based-year and week of year.

// • JDK-8148949 - DateTimeFormatter pattern letters 'A','n','N'.
//-These patterns were altered to be more flexible and produce less errors.


//	Performance:
// • JDK-8073394 - Clock.systemUTC() should return a constant.
//-This change avoids creating unecessary objects when using Clock.

// • JDK-8074003 - ZoneRules.getOffset(Instant) can be optimized.
//-This change reduces object churn when looking up time-zone data.

// • JDK-8074002 - ZoneId.systemDefault() should be faster.
//-This enhancement uses a clever approach to cache the time-zone while handling TimeZone.setDefault.

// • JDK-8068803 - Performance of LocalDate.plusDays could be better.
//-This optimizes LocalDate.plusDays for the common case of adding a small number of days.

// • JDK-8066291 - ZoneIdPrinterParser can be optimized.
//-The method ZoneRulesProvider.getAvailableZoneIds() now returns an immutable set, not a mutable one.
// Since most user code calls ZoneRules.getAvailableZoneIds(), it will be unaffected.


public class Info_Java9 {}
