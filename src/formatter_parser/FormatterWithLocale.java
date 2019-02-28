package formatter_parser;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

//-To use FormatStyle with LocalizedTime() or LocalizedDateTime()
// we have to use ZonedDateTime instance, otherwise, a DateTimeException will be thrown.
public class FormatterWithLocale {

	public FormatterWithLocale() {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy kk-mm-ss");
		DateTimeFormatter formatterUS = DateTimeFormatter.ofPattern("dd-MMM-yyyy kk-mm-ss", Locale.US);
		DateTimeFormatter formatterFR = DateTimeFormatter.ofPattern("dd-MMM-yyyy kk-mm-ss", Locale.FRANCE);
		
		DateTimeFormatter withLocale = DateTimeFormatter.ofPattern("dd-MMM-yyyy").withLocale(Locale.FRANCE);
		DateTimeFormatter withLocale2 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.GERMAN);
		DateTimeFormatter withLocale3 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL).withLocale(Locale.GERMAN);
		DateTimeFormatter withLocale4 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL).withLocale(Locale.GERMAN);
		DateTimeFormatter withLocale5 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.SHORT).withLocale(Locale.GERMAN);
		
		LocalDateTime ldt  = LocalDateTime.now();
		ZonedDateTime zdt = ZonedDateTime.now();
		
		System.out.println(ldt);
		System.out.println(ldt.format(formatter));
		System.out.println(ldt.format(formatterUS));
		System.out.println(ldt.format(formatterFR));
		
		System.out.println(ldt.format(withLocale));
		System.out.println(ldt.format(withLocale2));
		System.out.println(zdt.format(withLocale3));
		System.out.println(zdt.format(withLocale4));
		System.out.println(zdt.format(withLocale5));
		
		System.out.println("\n--- Done ---");
	}

	public static void main(String[] args) {
		new FormatterWithLocale();
	}

}
