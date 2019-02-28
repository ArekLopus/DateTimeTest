package conversions;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class EpochTimeToDate {

	public EpochTimeToDate() {
		
		long epoch = 1550393018;
		long time = TimeUnit.MILLISECONDS.convert(epoch, TimeUnit.SECONDS);
		System.out.println(time);
		
		System.out.println(epoch * 1000);
		
		System.out.println(new Date(time));
		System.out.println(new Date(epoch * 1000));
	}

	public static void main(String[] args) {
		new EpochTimeToDate();

	}

}
