package temporals;

//		TemporalField	interface
//All Known Implementing Classes:	ChronoField

//-A field of date-time, such as month-of-year or hour-of-minute.
//-Date and time is expressed using fields which partition the time-line into something meaningful for humans.
//-Implementations of this interface represent those fields.

//-The most commonly used units are defined in ChronoField.
//-Further fields are supplied in IsoFields, WeekFields and JulianFields.
//-Fields can also be written by application code by implementing this interface.

//-The field works using double dispatch. Client code calls methods on a date-time like LocalDateTime which check if the field is a ChronoField.
// If it is, then the date-time must handle it. Otherwise, the method call is re-dispatched to the matching method in this interface.

//	Implementation Requirements:
//-This interface must be implemented with care to ensure other classes operate correctly. All implementations that can be instantiated must
// be final, immutable and thread-safe. Implementations should be Serializable where possible. An enum is as effective implementation choice.

//	Method Summary
// • adjustInto​(R temporal, long newValue)			- Returns a copy of the specified temporal object with the value of this field set.
// • getBaseUnit()									- Gets the unit that the field is measured in.
// • getDisplayName​(Locale locale)					- Gets the display name for the field in the requested locale.
// • getFrom​(TemporalAccessor temporal)				- Gets the value of this field from the specified temporal object.
// • getRangeUnit()									- Gets the range that the field is bound by.
// • isDateBased()									- Checks if this field represents a component of a date.
// • isSupportedBy​(TemporalAccessor temporal)		- Checks if this field is supported by the temporal object.
// • isTimeBased()									- Checks if this field represents a component of a time.
// • range()										- Gets the range of valid values for the field.
// • rangeRefinedBy​(TemporalAccessor temporal)		- Get the range of valid values for this field using the temporal object to refine the result.
// • resolve​(Map<TemporalField,​Long> fieldValues, TemporalAccessor partialTemporal, ResolverStyle resolverStyle)	
//													- Resolves this field to provide a simpler alternative or a date.

public class AnInfo_TemporalField {}
