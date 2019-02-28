package formatter_parser;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class FormatterBuilderTime {

	public FormatterBuilderTime() {
		
	    DateTimeFormatter timeFormatter = new DateTimeFormatterBuilder()
	    		.appendValue(ChronoField.HOUR_OF_DAY, 2)
	    		.appendLiteral('-')
	    		.appendValue(ChronoField.MINUTE_OF_HOUR, 2)
	    		.appendLiteral('-')
	    		.appendValue(ChronoField.SECOND_OF_MINUTE, 2)
	    		.toFormatter();
		
	    String formatted = LocalTime.now().format(timeFormatter);
		System.out.println(formatted);
		
		LocalTime parsed = LocalTime.parse(formatted, timeFormatter);
		System.out.println(parsed);
		
		
		System.out.println("\n--- Done ---");
	}

	public static void main(String[] args) {
		new FormatterBuilderTime();
	}

}
