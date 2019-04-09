package unit_9;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;

public class LocalDateContinuedExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();

		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println("Better print for Israel: " + localDate.format(dateTimeFormatter));
		
		LocalDate nextSalaryDate = localDate.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("Next salary enters on " + nextSalaryDate.format(dateTimeFormatter));
	}
}