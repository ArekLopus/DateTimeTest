package conversions.legacy;

import java.sql.Time;
import java.time.LocalTime;

public class TimeSqlAndLocalDate {

	public TimeSqlAndLocalDate() {
		
		Time sqlTime = Time.valueOf(LocalTime.now());
		LocalTime localTime = sqlTime.toLocalTime();
		
		System.out.println(sqlTime);
		System.out.println(localTime);
		
		
		System.out.println("\n\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new TimeSqlAndLocalDate();
	}
}
