package conversions.legacy;

import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

//-toFormat() - The returned Format instance will format ANY TemporalAccessorand parses to a resolved TemporalAccessor. 
public class DateFormatFromDateTimeFormatter {

	public DateFormatFromDateTimeFormatter() {
		
		//DateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
		DateFormat df = new SimpleDateFormat("dd-MMM-yyyy kk-mm-ss", Locale.FRANCE);
		System.out.println(df.format(new Date()));
		
		
		//Format dateFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy kk-mm-ss").toFormat();
		Format dateFormat = DateTimeFormatter.ofPattern("dd-MMM-yyyy kk-mm-ss").withLocale(Locale.FRANCE).toFormat();
		Date date = new Date();
		ZonedDateTime zoned = date.toInstant().atZone(ZoneId.of("Europe/Paris"));
		System.out.println(dateFormat.format(zoned));
		
		
		System.out.println("\n\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new DateFormatFromDateTimeFormatter();
	}
}
