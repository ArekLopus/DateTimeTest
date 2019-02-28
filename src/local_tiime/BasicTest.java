package local_tiime;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class BasicTest {

	public BasicTest() {
		
		// Current date
		LocalTime now = LocalTime.now();
		System.out.println(now);
		
		// Built-in constants		
		System.out.println("\n" + LocalTime.MIN);
		System.out.println(LocalTime.MAX);
		System.out.println(LocalTime.NOON);
		System.out.println(LocalTime.MIDNIGHT);
		
		// equals()
		LocalTime now2 = LocalTime.parse(now.toString());
		System.out.println("\nequals?: " + now2.equals(now));
				
		// Comparing
		List<LocalTime> list = Arrays.asList(LocalTime.parse("12:10:30"), LocalTime.parse("14:10:30"), LocalTime.parse("13:10:30"));
		System.out.println(list);
		list.sort(LocalTime::compareTo);
		System.out.println(list);
		
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new BasicTest();
	}
}

