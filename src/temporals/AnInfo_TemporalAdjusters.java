package temporals;

//		TemporalAdjusters		- class TemporalAdjusters 

//-Common and useful TemporalAdjusters.
//-Adjusters are a key tool for modifying temporal objects. They exist to externalize the process of adjustment, permitting different
// approaches, as per the strategy design pattern.
//-Examples might be an adjuster that sets the date avoiding weekends, or one that sets the date to the last day of the month.

//-There are two equivalent ways of using a TemporalAdjuster.
//-The first is to invoke the method on the interface directly.
//-The second is to use Temporal.with(TemporalAdjuster):
//   temporal = thisAdjuster.adjustInto(temporal);				// these two lines are equivalent, but the second approach is recommended
//   temporal = temporal.with(thisAdjuster);

//-It is recommended to use the second approach, with(TemporalAdjuster), as it is a lot clearer to read in code.

//-This class contains a standard set of adjusters, available as static methods. These include:
// • finding the first or last day of the month
// • finding the first day of next month
// • finding the first or last day of the year
// • finding the first day of next year
// • finding the first or last day-of-week within a month, such as "first Wednesday in June"
// • finding the next or previous day-of-week, such as "next Thursday"

//	Implementation Requirements:
//-All the implementations supplied by the static methods are immutable.

//	Method Summary (all statics)
// • dayOfWeekInMonth​(int ordinal, DayOfWeek dayOfWeek)		- Returns the day-of-week in month adjuster, which returns a new date with the ordinal day-of-week based on the month.
// • firstDayOfMonth()										- Returns the "first day of month" adjuster, which returns a new date set to the first day of the current month.
// • firstDayOfNextMonth()									- Returns the "first day of next month" adjuster, which returns a new date set to the first day of the next month.
// • firstDayOfNextYear()									- Returns the "first day of next year" adjuster, which returns a new date set to the first day of the next year.
// • firstDayOfYear()										- Returns the "first day of year" adjuster, which returns a new date set to the first day of the current year.
// • firstInMonth​(DayOfWeek dayOfWeek)						- Returns the first in month adjuster, which returns a new date in the same month with the first matching day-of-week.
// • lastDayOfMonth()										- Returns the "last day of month" adjuster, which returns a new date set to the last day of the current month.
// • lastDayOfYear()										- Returns the "last day of year" adjuster, which returns a new date set to the last day of the current year.
// • lastInMonth​(DayOfWeek dayOfWeek)						- Returns the last in month adjuster, which returns a new date in the same month with the last matching day-of-week.
// • next​(DayOfWeek dayOfWeek)								- Returns the next day-of-week adjuster, which adjusts the date to the first occurrence of the specified day-of-week after the date being adjusted.
// • nextOrSame​(DayOfWeek dayOfWeek)						- Returns the next-or-same day-of-week adjuster, which adjusts the date to the first occurrence of the specified day-of-week after the date being adjusted unless it is already on that day in which case the same object is returned.
// • ofDateAdjuster​(UnaryOperator<LocalDate> dateBasedAdj)	- Obtains a TemporalAdjuster that wraps a date adjuster.
// • previous​(DayOfWeek dayOfWeek)							- Returns the previous day-of-week adjuster, which adjusts the date to the first occurrence of the specified day-of-week before the date being adjusted.
// • previousOrSame​(DayOfWeek dayOfWeek)					- Returns the previous-or-same day-of-week adjuster, which adjusts the date to the first occurrence of the specified day-of-week before the date being adjusted unless it is already on that day in which case the same object is returned.

public class AnInfo_TemporalAdjusters {}
