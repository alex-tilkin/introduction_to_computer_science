package unit_9;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class ComparingDates {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2019, 4, 9, 13, 35, 00);
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm:ssZ");
		Date date2019 = calendar.getTime();
		
		calendar.set(2020, 4, 9, 13, 35, 00);
		Date date2020 = calendar.getTime();
		
		System.out.println("date2019: " + simpleDateFormat.format(date2019));
		System.out.println("date2020: " + simpleDateFormat.format(date2020));
		
		System.out.println("date2019.before(date2020) ? " + date2019.before(date2020));
		System.out.println("date2019.after(date2020) ? " + date2019.after(date2020));
		System.out.println("date2019.compareTo(date2020) ? " + date2019.compareTo(date2020));
		System.out.println("date2020.before(date2019) ? " + date2020.compareTo(date2019));
	}
}