package temporals;

//		java.time.temporal
//-Access to date and time using fields and units, and date time adjusters.
//
//-This package expands on the base package to provide additional functionality for more powerful use cases. Support is included for:
// • Units of date-time, such as years, months, days and hours
// • Fields of date-time, such as month-of-year, day-of-week or hour-of-day
// • Date-time adjustment functions
// • Different definitions of weeks

//	Fields and Units
//-Dates and times are expressed in terms of fields and units. A unit is used to measure an amount of time, such as years, days or minutes.
//-All units implement TemporalUnit.
//-The set of well known units is defined in ChronoUnit, such as DAYS.
//-The unit interface is designed to allow application defined units.
//
//-A field is used to express part of a larger date-time, such as year, month-of-year or second-of-minute.
//-All fields implement TemporalField.
//-The set of well known fields are defined in ChronoField, such as HOUR_OF_DAY.
//-Additional fields are defined by JulianFields, WeekFields and IsoFields.
//-The field interface is designed to allow application defined fields.
//
//-This package provides tools that allow the units and fields of date and time to be accessed in a general way most suited for frameworks.
//-Temporal provides the abstraction for date time types that support fields. Its methods support getting the value of a field, creating a new
// date time with the value of a field modified, and querying for additional information, typically used to extract the offset or time-zone.
//
//-One use of fields in application code is to retrieve fields for which there is no convenience method.
// For example, getting the day-of-month is common enough that there is a method on LocalDate called getDayOfMonth().
//-However for more unusual fields it is necessary to use the field. Fe, date.get(ChronoField.ALIGNED_WEEK_OF_MONTH).
// The fields also provide access to the range of valid values.

//	Adjustment and Query
//-A key part of the date-time problem space is adjusting a date to a new, related value, such as the "last day of the month",
// or "next Wednesday". These are modeled as functions that adjust a base date-time. The functions implement TemporalAdjuster and operate
// on Temporal. A set of common functions are provided in TemporalAdjusters. For example, to find the first occurrence of a day-of-week
// after a given date, use TemporalAdjusters.next(DayOfWeek), such as date.with(next(MONDAY)).
//-Applications can also define adjusters by implementing TemporalAdjuster.
//
//-The TemporalAmount interface models amounts of relative time.
//
//-In addition to adjusting a date-time, an interface is provided to enable querying via TemporalQuery.
//-The most common implementations of the query interface are method references.
//-The from(TemporalAccessor) methods on major classes can all be used, such as LocalDate::from or Month::from.
//-Further implementations are provided in TemporalQueries as static methods.
//-Applications can also define queries by implementing TemporalQuery.

//Weeks
//-Different locales have different definitions of the week.
// Fe, in Europe the week typically starts on a Monday, while in the US it starts on a Sunday. The WeekFields class models this distinction.
//
//-The ISO calendar system defines an additional week-based division of years.
// This defines a year based on whole Monday to Monday weeks. This is modeled in IsoFields.

//	Package specification
//-Unless otherwise noted, passing a null argument to a constructor or method in any class or interface in this package will cause
// a NullPointerException to be thrown.
//-The Javadoc "@param" definition is used to summarise the null-behavior.
// The "@throws NullPointerException" is not explicitly documented in each method.
//
//-All calculations should check for numeric overflow and throw either an ArithmeticException or a DateTimeException.


public class AnInfo_Basiscs {}
