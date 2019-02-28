package durations;

import java.time.Duration;
import java.time.Instant;

public class DurationTest {

	public DurationTest() {
		
		Instant epoch = Instant.EPOCH;
		Instant now = Instant.now();
		
		Duration between = Duration.between(epoch, now);
		System.out.println(between);
		System.out.println(between.toDays());
		System.out.println(between.toHours());
		System.out.println(between.toMinutes());
		System.out.println(between.toNanos());
		
		System.out.println("\n\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new DurationTest();
	}
}
