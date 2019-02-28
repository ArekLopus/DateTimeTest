package instant;

import java.time.Duration;
import java.time.Instant;

//NOTE: The Instant and Duration classes are immutable, and all methods, such as multipliedBy or minus, return a new instance.
// • plus, minus							Adds a duration to, or subtracts a duration from, this Instant or Duration.
// • plusNanos, plusMillis, plusSeconds,
//   plusMinutes, plusHours, plusDays		Adds a number of the given time units to this Instant or Duration.
// • minusNanos, minusMillis, minusSeconds,
//	 minusMinutes, minusHours, minusDays	Subtracts a number of the given time units from this Instant or Duration.
// • multipliedBy, dividedBy, negated		Returns a duration that is obtained by multiplying or dividing this Duration by a
//											given long, or by –1. Note that you can scale only durations, not instants.
// • isZero, isNegative						Checks whether this Duration is zero or negative.

public class DurationOperations {

	public DurationOperations() throws InterruptedException {
		
		Instant date1 = Instant.parse("2019-03-22T10:34:13.619Z");
		Instant date2 = Instant.parse("2020-03-22T10:34:13.619Z");
		
		Duration between = Duration.between(date1, date2);
		System.out.println("Days between the dates:\t" + between.toDays());
		
		Duration plusDays = between.plusDays(1);
		System.out.println("between.plusDays(1): " + plusDays.toDays());
		System.out.println("between.minusDays(2): " + between.minusDays(2).toDays());
		System.out.println("between.multipliedBy(2): " + between.multipliedBy(2).toDays());
		System.out.println("between.dividedByBy(2): " + between.dividedBy(2).toDays());
		System.out.println("between.negated(): " + between.negated().toDays());
		
		System.out.println("isZero: " + between.isZero());
		
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) throws InterruptedException {
		new DurationOperations();
	}
}

