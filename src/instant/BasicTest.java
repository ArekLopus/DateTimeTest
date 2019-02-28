package instant;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.List;

public class BasicTest {

	public BasicTest() {
		
		// Current time
		Instant now = Instant.now();
		System.out.println(now);
		
		// Built-in constants
		System.out.println("\n" + Instant.EPOCH);
		System.out.println(Instant.MIN);
		System.out.println(Instant.MAX);
		
		// Instant is LocalDateTime
		LocalDateTime ldt = LocalDateTime.ofInstant(now, ZoneId.systemDefault());
		System.out.println("\n" + ldt);
		
		// equals()
		Instant now2 = Instant.parse(now.toString());
		System.out.println("equals?: " + now2.equals(now));
		
		// Comparing
		List<Instant> list = Arrays.asList(Instant.parse("2018-02-22T10:34:13.619Z"), Instant.parse("2019-02-22T10:34:13.619Z"), Instant.parse("2017-02-22T10:34:13.619Z"));
		System.out.println(list);
		list.sort(Instant::compareTo);
		System.out.println(list);
		
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new BasicTest();
	}
}

