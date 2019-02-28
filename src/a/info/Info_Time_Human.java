package a.info;

//		Human Time.

//-There are two kinds of human time in the new Java API, local date/time and zoned time. 

//-Local date/time has a date and/or time of day, but no associated time zone information. A local date is, fe, June 14, 1903.
// Since that date has neither a time of day nor time zone information, it does not correspond to a precise instant of time.

//-In contrast, July 16, 1969, 09:32:00 EDT is a zoned date/time, representing a precise instant on the time line.

//-There are many calculations where time zones are not required, and in some cases they can even be a hindrance.
// Suppose you schedule a meeting every week at 10:00. If you add 7 days (that is, 7 × 24 × 60 × 60 seconds) to the last zoned time,
// and you happen to cross the daylight savings time boundary, the meeting will be an hour too early or too late!

//-For that reason, the API designers recommend to not use zoned time unless you really want to represent absolute time instances.

//-Birthdays, holidays, schedule times, and so on are usually best represented as local dates or times. 


//	Local Date
//-A LocalDate is a date, with a year, month, and day of the month. To construct one, you can use the now or of static methods:
//-Unlike the irregular conventions in Unix and java.util.Date, where months are zero-based and years are counted from 1900,
// you supply the usual numbers for the month of year. Alternatively, you can use the Month enumeration.
//	LocalDate today = LocalDate.now(); // Today’s date
//	LocalDate alonzosBirthday = LocalDate.of(1903, 6, 14);
//	alonzosBirthday = LocalDate.of(1903, Month.JUNE, 14);	// Uses the Month enumeration


//	LocalTime
//-A LocalTime represents a time of day, such as 15:30:00. You can create an instance with the now or of methods:
//	LocalTime rightNow = LocalTime.now();
//	LocalTime bedtime = LocalTime.of(22, 30); // or LocalTime.of(22, 30, 0)


//	LocalDateTime
//-There is a LocalDateTime class, representing a date and time. That class is suitable for storing points in time in a fixed time zone,
// for example, for a schedule of classes or events.
//-However, if you need to make calculations that span the daylight savings time, or if you need to deal with users in different time zones,
// you should use the ZonedDateTime.


//	Zoned Time
//-Time zones, perhaps because they are an human creation, are even messier than the complications caused by the earth’s irregular rotation.
// In a rational world, we’d all follow the clock in Greenwich, and some of us would eat our lunch at 02:00, others at 22:00.
// Our stomachs would figure it out. This is actually done in China, which spans four conventional time zones.
//-Elsewhere, we have time zones with irregular and shifting boundaries, and, to make matters worse, the daylight savings time.
//
//-As capricious as the time zones may appear to the enlightened, they are a fact of life. When you implement a calendar application,
// it needs to work for people who fly from one country to another. When you have a conference call at 10:00 in New York,
/// but happen to be in Berlin, you expect to be alerted at the correct local time.
//
//-The IANA keeps a database of all known time zones around the world, which is updated several times per year.
// The bulk of the updates deals with the changing rules for daylight savings time. Java uses the IANA database.
//
//-Each time zone has an ID, such as America/New_York or Europe/Berlin. 
//
//-To find out all available time zones, call ZoneId.getAvailableIds. At the time of this writing, there were almost 600 IDs.
//-Given a time zone ID, the static method ZoneId.of(id) yields a ZoneId object. 
//-You can use that object to turn a LocalDateTime object into a ZonedDateTime object by calling local.atZone(zoneId),
// or you can construct a ZonedDateTime by calling the static method ZonedDateTime.of(year, month, day, hour, minute, second, nano, zoneId).
//	ZonedDateTime apollo11launch = ZonedDateTime.of(1969, 7, 16, 9, 32, 0, 0,
//		ZoneId.of("America/New_York"));		// 1969-07-16T09:32-04:00[America/New_York]
//-This is a specific instant in time. Call apollo11launch.toInstant() to get the Instant. 
//-Conversely, if you have an instant in time, call instant.atZone(ZoneId.of("UTC")) to to get it elsewhere on the planet.


//	OffsetDateTime
//-OffsetDateTime class represents times with an offset from UTC, but without time zone rules.
//-That class is intended for specialized apps that specifically require the absence of those rules, such as certain network protocols.
//-For human time, use ZonedDateTime.


//	Period
//-Difference between two time instants is a Duration.
// The equivalent for local dates is a Period, which expresses a number of elapsed years, months, or days.

//-You can call birthday.plus(Period.ofYears(1)), to get the birthday next year. Of course, you can also just call birthday.plusYears(1).
// But birthday.plus(Duration.ofDays(365)) won’t produce the correct result in a leap year.

//-The until() yields the difference between two local dates. Fe, independenceDay.until(christmas) yields a period of 5 months and 21 days.
// That is actually not terribly useful because the number of days per month varies. To find the number of days, use
//	independenceDay.until(christmas, ChronoUnit.DAYS) // 174 days

//-The getDayOfWeek() yields the weekday, as a value of the DayOfWeek enumeration.
//-DayOfWeek.MONDAY has the numerical value 1, and DayOfWeek.SUNDAY has the value 7. For example,
//	LocalDate.of(1900, 1, 1).getDayOfWeek().getValue()	//yields 1
//-The DayOfWeek enumeration has convenience methods plus and minus to compute weekdays modulo 7.
// For example, 	DayOfWeek.SATURDAY.plus(3) yields DayOfWeek.TUESDAY.

//-NOTE: The weekend days actually come at the end of the week. This is different from java.util.Calendar,
// 		 where Sunday has value 1 and Saturday value 7



//	Date Adjusters

//Method										Description
//next(weekday), previous(weekday)				Next or previous date that falls on the given weekday
//nextOrSame(weekday),							Next or previous date that falls on the given weekday, starting from the given date
//previousOrSame(weekday)
//dayOfWeekInMonth(n, weekday)					The nth weekday in the month
//lastInMonth(weekday)							The last weekday in the month
//firstDayOfMonth(), firstDayOfNextMonth(), 	The date described in the method name
//firstDayOfNextYear(), lastDayOfMonth(),
//lastDayOfPreviousMonth(), lastDayOfYear()


public class Info_Time_Human {}