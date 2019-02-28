package date_classes_other;

//		YearMonth	- YearMonth class implements Serializable, Comparable<YearMonth>, Temporal, TemporalAccessor, TemporalAdjuster

//-A year-month in the ISO-8601 calendar system, such as 2007-12.
//-YearMonth is an immutable date-time object that represents the combination of a year and month.
//-Any field that can be derived from a year and month, such as quarter-of-year, can be obtained.
//
//-This class does not store or represent a day, time or time-zone. For example, the value "October 2007" can be stored in a YearMonth.
//
//-The ISO-8601 calendar system is the modern civil calendar system used today in most of the world. It is equivalent to the proleptic
//Gregorian calendar system, in which today's rules for leap years are applied for all time. For most applications written today,
//the ISO-8601 rules are entirely suitable. However, any application that makes use of historical dates, and requires them to be accurate
//will find the ISO-8601 approach unsuitable.
//
//-This is a value-based class; use of identity-sensitive operations (including reference equality (==), identity hash code,
//or synchronization) on instances of YearMonth may have unpredictable results and should be avoided.
//-The equals method should be used for comparisons.
//
//-This class is immutable and thread-safe.

public class YearMonth {}