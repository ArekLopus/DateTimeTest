package formatter_parser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;

public class FormatterBuilderDate {

	public FormatterBuilderDate() {
		
	    DateTimeFormatter dateFormatter = new DateTimeFormatterBuilder()
	    		.appendValue(ChronoField.DAY_OF_MONTH, 2)
	    		.appendLiteral('~')
	    		.appendText(ChronoField.MONTH_OF_YEAR, TextStyle.FULL_STANDALONE)
	    		//.appendValue(ChronoField.MONTH_OF_YEAR, 2)
	    		.appendLiteral('~')
	    		.appendValue(ChronoField.YEAR, 4)
	    		.toFormatter();
		
	    String formatted = LocalDate.now().format(dateFormatter);
		System.out.println(formatted);
		
	    LocalDate parsed = LocalDate.parse(formatted, dateFormatter);
	    System.out.println(parsed);
		
	    
		System.out.println("\n--- Done ---");
	}

	public static void main(String[] args) {
		new FormatterBuilderDate();
	}

}
