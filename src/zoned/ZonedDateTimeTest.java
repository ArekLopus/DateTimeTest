package zoned;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ZonedDateTimeTest {

	public ZonedDateTimeTest() {
		
		Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
		List<String> collected = availableZoneIds.stream().filter( e ->  e.contains("wa") ).collect(Collectors.toList());
		//System.out.println(availableZoneIds);
		System.out.println(collected);
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		ZonedDateTime atZone = now.atZone(ZoneId.of("US/Hawaii"));
		System.out.println(atZone);
		
		System.out.println("Offset from UTC: " + atZone.getOffset());
		
		
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new ZonedDateTimeTest();
	}
}
