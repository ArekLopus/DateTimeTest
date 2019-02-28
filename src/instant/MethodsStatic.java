package instant;

import java.time.Instant;
import java.time.OffsetDateTime;
import java.time.ZonedDateTime;

public class MethodsStatic {

	public MethodsStatic() {
		
		// from()
		Instant.from(ZonedDateTime.now());
		Instant.from(OffsetDateTime.now());
		//Instant.from(LocalDateTime.now());	//The rest dont work
		//Instant.from(LocalDate.now());
		//Instant.from(LocalTime.now());
		
		
		// ofEpochXXX()
		Instant ofEpochMillis = Instant.ofEpochMilli(System.currentTimeMillis());
		System.out.println(ofEpochMillis);
		
		Instant ofEpochSeconds = Instant.ofEpochSecond(System.currentTimeMillis() / 1000);
		System.out.println(ofEpochSeconds);
		
		
		// parse();		- fromat: '2018-02-22T17:18:06.408Z'
		Instant parsed = Instant.parse("2018-02-22T17:18:06.408Z");
		System.out.println(parsed);
		
		
		System.out.println("\n--- Main Thread Finished! ---");
	}

	public static void main(String[] args) {
		new MethodsStatic();
	}
}

