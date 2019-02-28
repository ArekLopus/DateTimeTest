package local_date;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class BasicTest {

	public BasicTest() {
		
		// Current date
		LocalDate now = LocalDate.now();
		System.out.println(now);
		
		// Built-in constants		
		System.out.println("\n" + LocalDate.MIN);
		System.out.println(LocalDate.MAX);
		
		// equals()
		LocalDate now2 = LocalDate.parse(now.toString());
		System.out.println("\nequals?: " + now2.equals(now));
				
		// Comparing
		List<LocalDate> list = Arrays.asList(LocalDate.parse("2018-02-23"), LocalDate.parse("2019-02-23"), LocalDate.parse("2017-02-23"));
		System.out.println(list);
		list.sort(LocalDate::compareTo);
		System.out.println(list);
		
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new BasicTest();
	}
}

