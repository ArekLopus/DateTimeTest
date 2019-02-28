package temporals;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest {

	public TemporalAdjustersTest() {
		
		LocalDate firstMonday = LocalDate.of(2019, 2, 25).with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY));
		System.out.println(firstMonday);
		
		
		LocalDate firstMonday2 = LocalDate.of(2019, 2, 25).with(TemporalAdjusters. next(DayOfWeek.MONDAY));
		System.out.println(firstMonday2);
		
		
		TemporalAdjuster NEXT_WORKDAY = w -> {
		    LocalDate result = (LocalDate) w;
		        do {
		            result = result.plusDays(1);
		        } while (result.getDayOfWeek().getValue() >= 6);
		        return result;
		};
		System.out.println(LocalDate.of(2019, 3, 1).with(NEXT_WORKDAY));
		
		
		TemporalAdjuster NEXT_WORKDAY2 = TemporalAdjusters.ofDateAdjuster(w -> {
		    LocalDate result = w; // No cast
		    do {
		        result = result.plusDays(1);
		    } while (result.getDayOfWeek().getValue() >= 6);
		    return result;
		});
		System.out.println(LocalDate.of(2019, 3, 1).with(NEXT_WORKDAY2));
		
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new TemporalAdjustersTest();
	}
}
