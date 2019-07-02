package unit_02_operators_and_conditions;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What day is today? (enter a number)");
		int day = scanner.nextInt();
		scanner.close();
		String dayStr = "";
		String SUNDAY = "Sunday";
		String MONDAY = "Monday";
		String TUESDAY = "Tuesday";
		String WEDNESDAY = "Wednesday";
		String THURSDAY = "Thursday";
		String FRIDAY = "Friday";
		String SATURDAY = "Saturday";
		String UNKNOWN_DAY = "Unknown day";
		
		switch (day) {
		case 1:
			dayStr = SUNDAY;
			break;
		case 2:
			dayStr = MONDAY;
			break;
		case 3:
			dayStr = TUESDAY;
			break;
		case 4:
			dayStr = WEDNESDAY;
			break;
		case 5:
			dayStr = THURSDAY;
			break;
		case 6:
			dayStr = FRIDAY;
			break;
		case 7:
			dayStr = SATURDAY;
			break;
		default:
			dayStr = UNKNOWN_DAY;
			break;
		}

		System.out.println("You have selected " + dayStr);
	}
}