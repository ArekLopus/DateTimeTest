package date_classes_other;

//		MonthDay 	- class MonthDay implements Serializable, Comparable<MonthDay>, TemporalAccessor, TemporalAdjuster

//-A month-day in the ISO-8601 calendar system, such as --12-03.
//-MonthDay is an immutable date-time object that represents the combination of a month and day-of-month.
//-Any field that can be derived from a month and day, such as quarter-of-year, can be obtained.
//
//-This class does not store or represent a year, time or time-zone. For example, the value "December 3rd" can be stored in a MonthDay.
//
//-Since a MonthDay does not possess a year, the leap day of February 29th is considered valid.
//
//-This class implements TemporalAccessor rather than Temporal. This is because it is not possible to define whether February 29th
// is valid or not without external information, preventing the implementation of plus/minus.
// Related to this, MonthDay only provides access to query and set the fields MONTH_OF_YEAR and DAY_OF_MONTH.
//
//-The ISO-8601 calendar system is the modern civil calendar system used today in most of the world. It is equivalent to the proleptic
// Gregorian calendar system, in which today's rules for leap years are applied for all time. For most applications written today,
// the ISO-8601 rules are entirely suitable. However, any application that makes use of historical dates, and requires them to be accurate
// will find the ISO-8601 approach unsuitable.
//
//-This is a value-based class; use of identity-sensitive operations (including reference equality (==), identity hash code,
// or synchronization) on instances of MonthDay may have unpredictable results and should be avoided.
//-The equals method should be used for comparisons.
//
//-This class is immutable and thread-safe.

public class MonthDay {}