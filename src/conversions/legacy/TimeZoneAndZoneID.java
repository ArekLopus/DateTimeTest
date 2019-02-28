package conversions.legacy;

import java.time.ZoneId;
import java.util.TimeZone;

public class TimeZoneAndZoneID {

	public TimeZoneAndZoneID() {
		
		TimeZone timeZone = TimeZone.getTimeZone(ZoneId.of("Z"));		// • If the zone ID equals 'Z', the result is ZoneOffset.UTC. 
		ZoneId zoneId = timeZone.toZoneId();
		
		System.out.println(timeZone);
		System.out.println(zoneId);
		
		
		System.out.println("\n\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new TimeZoneAndZoneID();
	}
}
