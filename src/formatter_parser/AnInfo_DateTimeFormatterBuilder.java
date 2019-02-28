package formatter_parser;

//		DateTimeFormatterBuilder	- final class DateTimeFormatterBuilder

//-Builder to create date-time formatters.
//-This allows a DateTimeFormatter to be created. All date-time formatters are created ultimately using this builder.

//-The basic elements of date-time can all be added:
// • Value - a numeric value
// • Fraction - a fractional value including the decimal place. Always use this when outputting fractions to ensure that the fraction is parsed correctly
// • Text - the textual equivalent for the value
// • OffsetId/Offset - the zone offset
// • ZoneId - the time-zone id
// • ZoneText - the name of the time-zone
// • ChronologyId - the chronology id
// • ChronologyText - the name of the chronology
// • Literal - a text literal
// • Nested and Optional - formats can be nested or made optional
//-In addition, any of the elements may be decorated by padding, either with spaces or any other character.

//-Finally, a shorthand pattern, mostly compatible with java.text.SimpleDateFormat SimpleDateFormat can be used,
// see appendPattern(String). In practice, this simply parses the pattern and calls other methods on the builder.

//Implementation Requirements:
//-This class is a mutable builder intended for use from a single thread.


//Method Summary
//	append​(DateTimeFormatter formatter)					- Appends all the elements of a formatter to the builder.
//	appendChronologyId()								- Appends the chronology ID, such as 'ISO' or 'ThaiBuddhist', to the formatter.
//	appendChronologyText​(TextStyle textStyle)			- Appends the chronology name to the formatter.
//	appendFraction​(TemporalField field, int minWidth, int maxWidth, boolean decimalPoint)
//														- Appends the fractional value of a date-time field to the formatter.
//	appendGenericZoneText​(TextStyle textStyle)			- Appends the generic time-zone name, such as 'Pacific Time', to the formatter.
//	appendGenericZoneText​(TextStyle textStyle, Set<ZoneId> preferredZones)
//														- Appends the generic time-zone name, such as 'Pacific Time', to the formatter.
//	appendInstant()										- Appends an instant using ISO-8601 to the formatter, formatting fractional digits in groups of three.
//	appendInstant​(int fractionalDigits)					- Appends an instant using ISO-8601 to the formatter with control over the number of fractional digits.
//	appendLiteral​(char literal)							- Appends a character literal to the formatter.
//	appendLiteral​(String literal)						- Appends a string literal to the formatter.
//	appendLocalized​(FormatStyle dateStyle, FormatStyle timeStyle)
//														- Appends a localized date-time pattern to the formatter.
//	appendLocalizedOffset​(TextStyle style)				- Appends the localized zone offset, such as 'GMT+01:00', to the formatter.
//	appendOffset​(String pattern, String noOffsetText)	- Appends the zone offset, such as '+01:00', to the formatter.
//	appendOffsetId()									- Appends the zone offset, such as '+01:00', to the formatter.
//	appendOptional​(DateTimeFormatter formatter)			- Appends a formatter to the builder which will optionally format/parse.
//	appendPattern​(String pattern)						- Appends the elements defined by the specified pattern to the builder.
//	appendText​(TemporalField field)						- Appends the text of a date-time field to the formatter using the full text style.
//	appendText​(TemporalField field, TextStyle textSt)	- Appends the text of a date-time field to the formatter.
//	appendText​(TemporalField field, Map<Long,​String> textLookup)
//														- Appends the text of a date-time field to the formatter using the specified map to supply the text.
//	appendValue​(TemporalField field)					- Appends the value of a date-time field to the formatter using a normal output style.
//	appendValue​(TemporalField field, int width)			- Appends the value of a date-time field to the formatter using a fixed width, zero-padded approach.
//	appendValue​(TemporalField field, int minWidth, int maxWidth, SignStyle signStyle)
//														- Appends the value of a date-time field to the formatter providing full control over formatting.
//	appendValueReduced​(TemporalField field, int width, int maxWidth, int baseValue)
//														- Appends the reduced value of a date-time field to the formatter.
//	appendValueReduced​(TemporalField field, int width, int maxWidth, ChronoLocalDate baseDate)
//														- Appends the reduced value of a date-time field to the formatter.
//	appendZoneId()										- Appends the time-zone ID, such as 'Europe/Paris' or '+02:00', to the formatter.
//	appendZoneOrOffsetId()								- Appends the time-zone ID, such as 'Europe/Paris' or '+02:00', to the formatter, using the best available zone ID.
//	appendZoneRegionId()								- Appends the time-zone region ID, such as 'Europe/Paris', to the formatter, rejecting the zone ID if it is a ZoneOffset.
//	appendZoneText​(TextStyle textStyle)					- Appends the time-zone name, such as 'British Summer Time', to the formatter.
//	appendZoneText​(TextStyle textStyle, Set<ZoneId> preferredZones)
//														- Appends the time-zone name, such as 'British Summer Time', to the formatter.
//	static getLocalizedDateTimePattern​(FormatStyle dateStyle, FormatStyle timeStyle, Chronology chrono, Locale locale)
//														- Gets the formatting pattern for date and time styles for a locale and chronology.
//	optionalEnd()										- Ends an optional section.
//	optionalStart()										- Mark the start of an optional section.
//	padNext​(int padWidth)								- Causes the next added printer/parser to pad to a fixed width using a space.
//	padNext​(int padWidth, char padChar)					- Causes the next added printer/parser to pad to a fixed width.
//	parseCaseInsensitive()								- Changes the parse style to be case insensitive for the remainder of the formatter.
//	parseCaseSensitive()								- Changes the parse style to be case sensitive for the remainder of the formatter.
//	parseDefaulting​(TemporalField field, long value)	- Appends a default value for a field to the formatter for use in parsing.
//	parseLenient()										- Changes the parse style to be lenient for the remainder of the formatter.
//	parseStrict()										- Changes the parse style to be strict for the remainder of the formatter.
//	toFormatter()										- Completes this builder by creating the DateTimeFormatter using the default locale.
//	toFormatter​(Locale locale)							- Completes this builder by creating the DateTimeFormatter using the specified locale.

public class AnInfo_DateTimeFormatterBuilder {}