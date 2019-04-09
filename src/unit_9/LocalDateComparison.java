package unit_9;

import java.time.LocalDate;

public class LocalDateComparison {

	public static void main(String[] args) {
		LocalDate localDate2019 = LocalDate.of(2019, 4, 9);
		LocalDate localDate2020 = LocalDate.of(2020, 4, 9);
		
		System.out.println("localDate2019 before localDate2020? " + localDate2019.isBefore(localDate2020));
		System.out.println("localDate2019 after localDate2020? " + localDate2019.isAfter(localDate2020));
		System.out.println("localDate2019 compared to localDate2020: " + localDate2019.compareTo(localDate2020));		
	}
}