package conversions;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class AddingTimeToDate {
	
	public AddingTimeToDate() {
		
		long now = LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);
		long nowPlusTenMinutes = LocalDateTime.now().plusMinutes(10).toEpochSecond(ZoneOffset.UTC);
		
		System.out.println(now);
		System.out.println(nowPlusTenMinutes);
		System.out.println("Difference: " + ((nowPlusTenMinutes - now) / 60) + " min");
		
		LocalDateTime now2 = LocalDateTime.now();
		LocalDateTime nowPlusTenMinutes2 = LocalDateTime.now().plusMinutes(11);
		System.out.println("Difference: " + Duration.between(now2, nowPlusTenMinutes2).toMinutes() + " min");
		
		
		Instant nowInst = Instant.ofEpochSecond(System.currentTimeMillis());
		Date date2 = Date.from(nowInst);
		Date date3 = Date.from(nowInst.plusSeconds(60 * 10));
		System.out.println("\n" + date2);
		System.out.println(date3);
		
	}
	
	public static void main(String... args) {
		new AddingTimeToDate();
	}
	
}