package formatter_parser;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;

public class FormatterBuilderComplex {

	public FormatterBuilderComplex() {
		
		DateTimeFormatter customFormatter = new DateTimeFormatterBuilder()
		        .appendLiteral("New Year in ")
		        .appendValue(ChronoField.YEAR)
		        .appendLiteral(" is on ")
		        .appendText(ChronoField.DAY_OF_WEEK, TextStyle.FULL_STANDALONE)
		        .toFormatter();
		
		LocalDate ld1  = LocalDate.now();
		String formatted = ld1.format(customFormatter); 
		System.out.println(formatted);
		
		System.out.println("\n--- Done ---");
	}

	public static void main(String[] args) {
		new FormatterBuilderComplex();
	}

}
