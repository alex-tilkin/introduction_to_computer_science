package unit_9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class InitializingDate {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2019, 4, 9);
		Date date = calendar.getTime();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ssZ");
		System.out.println(simpleDateFormat.format(date));
	}
}