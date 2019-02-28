package period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

	public PeriodTest() {
		
		LocalDate start = LocalDate.of(0, 1, 1);
		LocalDate now = LocalDate.now();
		
		Period between = Period.between(start, now);
		System.out.println(between);
		System.out.println(between.toTotalMonths());
		
		
		System.out.println("\n\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new PeriodTest();
	}
}
