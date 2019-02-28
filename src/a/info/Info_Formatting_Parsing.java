package a.info;

//		Formatting and Parsing
//https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/time/format/DateTimeFormatter.html
//NOTE: The java.time.format.DateTimeFormatter class is intended as a replacement for java.util.DateFormat.
//      If you need an instance of the latter for backwards compatibility, call formatter.toFormat().

//-The DateTimeFormatter class provides 3 kinds of formatters to print a date/time value:
// • Predefined standard formatters (see Table 5–6)
// • Locale-specific formatters
// • Formatters with custom patterns

//-To use one of the standard formatters, simply call its format method:
//	String formatted = DateTimeFormatter.ISO_DATE_TIME.format(apollo11launch);		// 1969-07-16T09:32:00-05:00[America/New_York]
//-The standard formatters are mostly intended for machine-readable timestamps.

//-To present dates and times to human readers, use a locale-specific formatter.
// There are four styles, SHORT, MEDIUM, LONG, and FULL, for both date and time — see Table below.
//-The static methods ofLocalizedDate, ofLocalizedTime, and ofLocalizedDateTime create such a formatter. For example:
//	DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
//	String formatted = formatter.format(apollo11launch);		// July 16, 1969 9:32:00 AM EDT
//-These methods use the default locale. To change to a different locale, simply use the withLocale method.
//	formatted = formatter.withLocale(Locale.FRENCH).format(apollo11launch);           // 16 juillet 1969 09:32:00 EDT

//Predefined Formatters
//	Formatter				Description												Example
//	BASIC_ISO_DATE			Year, month, day, zone offset without separators		19690716-0500
//	ISO_LOCAL_DATE, 		Separators -, :, T 										1969-07-16, 09:32:00, 1969-07-16T09:32:00
//	ISO_LOCAL_TIME,
//	ISO_LOCAL_DATE_TIME
//	ISO_OFFSET_DATE,		Like ISO_LOCAL_XXX, but with zone offset				1969-07-16-05:00, 09:32:00-05:00,
//	ISO_OFFSET_TIME,																1969-07-16T09:32:00-05:00
//	ISO_OFFSET_DATE_TIME
//	ISO_ZONED_DATE_TIME		With zone offset  and zone ID							1969-07-16T09:32:00-05:00[America/New_York]
//	ISO_INSTANT				In UTC, denoted by the Z zone ID						1969-07-16T14:32:00Z
//	ISO_DATE, ISO_TIME,		Like ISO_OFFSET_DATE, ISO_OFFSET_TIME,					1969-07-16-05:00, 09:32:00-05:00,
//	ISO_DATE_TIME			ISO_ZONED_DATE_TIME, but the zone info is optional		1969-07-16T09:32:00-05:00[America/New_York]
//	ISO_ORDINAL_DATE		The year and day of year, for LocalDate					1969-197
//	ISO_WEEK_DATE			The year, week, and day of week, for LocalDate			1969-W29-3
//	RFC_1123_DATE_TIME		The standard for email timestamps, codified in RFC 822	Wed, 16 Jul 1969 09:32:00 -0500
//							and updated to four digits for the year in RFC 1123

//Locale-Specific Formatting Styles
//	Style		Date						Time
//	SHORT		7/16/69						9:32 AM
//	MEDIUM		Jul 16, 1969				9:32:00 AM
//	LONG		July 16, 1969				9:32:00 AM EDT
//	FULL		Wednesday, July 16, 1969	9:32:00 AM EDT


//-Finally, you can roll your own date format by specifying a pattern. For example,
//	formatter = DateTimeFormatter.ofPattern("E yyyy-MM-dd HH:mm");
// formats a date in the form Wed 1969-07-16 09:32. Each letter denotes a different time field, and the number of times the letter
// is repeated selects a particular format, according to rules that are arcane and seem to have organically grown over time.
//
//Commonly Used Formatting Symbols for Date/Time Formats
//	ChronoField or Purpose		Examples
//	ERA							G: AD, GGGG: Anno Domini, GGGGG: A
//	YEAR_OF_ERA					yy: 69, yyyy: 1969
//	MONTH_OF_YEAR				M: 7, MM: 07, MMM: Jul, MMMM: July, MMMMM: J
//	DAY_OF_MONTH				d: 6, dd: 06
//	DAY_OF_WEEK					e: 3, E: Wed, EEEE: Wednesday, EEEEE: W
//	HOUR_OF_DAY					H: 9, HH: 09
//	CLOCK_HOUR_OF_AM_PM			K: 9, KK: 09
//	AMPM_OF_DAY					a: AM
//	MINUTE_OF_HOUR				mm: 02

//Commonly Used Formatting Symbols for Date/Time Formats (Continued)
//	ChronoField or Purpose		Examples
//	SECOND_OF_MINUTE			ss: 00
//	NANO_OF_SECOND				nnnnnn: 000000
//	Time zone ID				VV: America/New_York
//	Time zone name				z: EDT, zzzz: Eastern Daylight Time
//	Zone offset					x: -04, xx: -0400, xxx: -04:00, XXX: same, but use Z for zero
//	Localized zone offset		O: GMT-4, OOOO: GMT-04:00


//	Parsing
//-To parse a date/time value from a string, use one of the static parse methods. For example,
//	LocalDate churchsBirthday = LocalDate.parse("1903-06-14");
//	ZonedDateTime apollo11launch =
//		ZonedDateTime.parse("1969-07-16 03:32:00-0400",	DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ssxx"));
//-The first call uses the standard ISO_LOCAL_DATE formatter, the second one a custom formatter.

public class Info_Formatting_Parsing {}