package conversions.legacy;

import java.sql.Date;
import java.time.LocalDate;

public class DateSqlAndLocalDate {

	public DateSqlAndLocalDate() {
		
		Date dateFromLocalDate = Date.valueOf(LocalDate.now());
		LocalDate localDate = dateFromLocalDate.toLocalDate();
		
		System.out.println(dateFromLocalDate);
		System.out.println(localDate);
		
		
		System.out.println("\n\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new DateSqlAndLocalDate();
	}
}
