package local_date_time;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class BasicTest {

	public BasicTest() {
		
		// Current date
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		// Built-in constants		
		System.out.println("\n" + LocalDateTime.MIN);
		System.out.println(LocalDateTime.MAX);
		
		// equals()
		LocalDateTime now2 = LocalDateTime.parse(now.toString());
		System.out.println("\nequals?: " + now2.equals(now));
		
		// Comparing
		List<LocalDateTime> list = Arrays.asList(LocalDateTime.parse("2018-02-23T15:18:10.133"), LocalDateTime.parse("2019-02-23T15:18:10.133"), LocalDateTime.parse("2017-02-23T15:18:10.133"));
		System.out.println(list);
		list.sort(LocalDateTime::compareTo);
		System.out.println(list);
		
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new BasicTest();
	}
}

