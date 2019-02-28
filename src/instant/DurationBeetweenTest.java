package instant;

import java.time.Duration;
import java.time.Instant;

//-A Duration is the amount of time between two instants.
//-To find out the difference between two instants, use the static Duration.between().
//-You can get the length of a Duration in conventional units by calling toNanos, toMillis, toSeconds, toMinutes, toHours, or toDays.
public class DurationBeetweenTest {

	public DurationBeetweenTest() throws InterruptedException {
		
		Instant date1 = Instant.parse("2019-03-22T10:34:13.619Z");
		Instant date2 = Instant.parse("2020-03-22T10:34:13.619Z");
		
		Duration between = Duration.between(date1, date2);
		System.out.println("Days between the dates:\t" + between.toDays());
		
		
		Instant start = Instant.now();
		Thread.sleep(500);
		Instant end = Instant.now();
		Duration timeElapsed = Duration.between(start, end);
		long millis = timeElapsed.toMillis();
		System.out.println("Elapsed Time (ms):\t" + millis);
		
		
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) throws InterruptedException {
		new DurationBeetweenTest();
	}
}

