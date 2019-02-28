package temporals;

//		TemporalQuery<R>	interface

//-This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference.

//-Strategy for querying a temporal object.
//-Queries are a key tool for extracting information from temporal objects.
//-They exist to externalize the process of querying, permitting different approaches, as per the strategy design pattern.
//-Examples might be a query that checks if the date is the day before February 29th in a leap year,
// or calculates the number of days to your next birthday.

//-The TemporalField interface provides another mechanism for querying temporal objects.
// That interface is limited to returning a long. By contrast, queries can return any type.

//-There are two equivalent ways of using a TemporalQuery.
//-The first is to invoke the method on this interface directly.
//-The second is to use TemporalAccessor.query(TemporalQuery):
//   temporal = thisQuery.queryFrom(temporal);					// these two lines are equivalent, but the second approach is recommended
//   temporal = temporal.query(thisQuery);
//-It is recommended to use the second approach, query(TemporalQuery), as it is a lot clearer to read in code.

//-The most common implementations are method references, such as LocalDate::from and ZoneId::from.
// Additional common queries are provided as static methods in TemporalQueries.

//	Implementation Requirements:
//-This interface places no restrictions on the mutability of implementations, however immutability is strongly recommended.
// • queryFrom​(TemporalAccessor temporal)		- Queries the specified temporal object.

public class AnInfo_TemporalQuery {}
