package conversions.legacy;

//		Interoperating with Legacy Code

//-As a brand-new creation, the Java Date and Time API will have to interoperate with existing classes, in particular, the ubiquitous
// java.util.Date, java.util. GregorianCalendar, and java.sql.Date/Time/Timestamp.

//	Date
//-The Instant class is a close analog to java.util.Date.
//-In Java 8, that class has two added methods:
// toInstant() - that converts a Date to an Instant
// static from() - that converts in the other direction.

//	GregorianCalendar
//-Similarly, ZonedDateTime is a close analog to java.util.GregorianCalendar, and that class has gained conversion methods in Java 8.
// toZonedDateTime() converts a GregorianCalendar to a ZonedDateTime
// static from() does the opposite conversion.

//-Another set of conversions is available for the date and time classes in the java.sql package.
//-You can also pass a DateTimeFormatter to legacy code that uses java.text.Format.

//Conversions between java.time Classes and Legacy Classes
//	Classes											To Legacy Class								From Legacy Class
//	Instant ↔ java.util.Date						Date.from(instant)							date.toInstant()
//	ZonedDateTime ↔ java.util.GregorianCalendar		GregorianCalendar.from(zonedDateTime)		cal.toZonedDateTime()
//	Instant ↔ java.sql.Timestamp					TimeStamp.from(instant)						timestamp.toInstant()
//	LocalDateTime ↔ java.sql.Timestamp				Timestamp.valueOf(localDateTime)			timeStamp.toLocalDateTime()
//	LocalDate ↔ java.sql.Date						Date.valueOf(localDate)						date.toLocalDate()
//	LocalTime ↔ java.sql.Time						Time.valueOf(localTime)						time.toLocalTime()
//	DateTimeFormatter → java.text.DateFormat		formatter.toFormat()						None
//	java.util.TimeZone → ZoneId						Timezone.getTimeZone(id)					timeZone.toZoneId()
//	java.nio.file.attribute.FileTime → Instant		FileTime.from(instant)						fileTime.toInstant()









public class AnInfo {}