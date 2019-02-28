package temporals;

//		TemporalAdjuster	interface extends TemporalAccessor
//All Known Subinterfaces:			ChronoLocalDate, ChronoLocalDateTime<D>, Era
//All Known Implementing Classes:	DayOfWeek, HijrahDate, HijrahEra, Instant, IsoEra, JapaneseDate, JapaneseEra, LocalDate, LocalDateTime, LocalTime, MinguoDate, MinguoEra, Month, MonthDay, OffsetDateTime, OffsetTime, ThaiBuddhistDate, ThaiBuddhistEra, Year, YearMonth, ZoneOffset

//-This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

//-Strategy for adjusting a temporal object.
//-Adjusters are a key tool for modifying temporal objects. They exist to externalize the process of adjustment, permitting different approaches,
// as per the strategy design pattern. Examples might be an adjuster that sets the date avoiding weekends,
// or one that sets the date to the last day of the month.

//-There are two equivalent ways of using a TemporalAdjuster.
//-The first is to invoke the method on this interface directly.
//-The second is to use Temporal.with(TemporalAdjuster):
//   temporal = thisAdjuster.adjustInto(temporal);		   // these two lines are equivalent, but the second approach is recommended
//   temporal = temporal.with(thisAdjuster);

//-It is recommended to use the second approach, with(TemporalAdjuster), as it is a lot clearer to read in code.

//-The TemporalAdjusters class contains a standard set of adjusters, available as static methods. These include:
// • finding the first or last day of the month
// • finding the first day of next month
// • finding the first or last day of the year
// • finding the first day of next year
// • finding the first or last day-of-week within a month, such as "first Wednesday in June"
// • finding the next or previous day-of-week, such as "next Thursday"

//	Implementation Requirements:
//-This interface places no restrictions on the mutability of implementations, however immutability is strongly recommended.

//	Method Summary
// • adjustInto​(Temporal temporal)		- Adjusts the specified temporal object.

public class AnInfo_TemporalAdjuster {}
