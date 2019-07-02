package unit_09_constructors_and_this;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		
		System.out.println("the day of the week is " + localDate.getDayOfWeek());
		System.out.println("Yesterday was " + localDate.minusDays(1).getDayOfWeek());
		System.out.println("Tomorrow will be " + localDate.plusDays(1).getDayOfWeek());
		
		LocalDate comingSaturday = localDate.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		
		System.out.println("Comping Saturday is the " + comingSaturday.toString());
	}
}