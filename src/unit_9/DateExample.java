package unit_9;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date.toGMTString());
		System.out.println(date.toLocaleString());
		System.out.println(date.toString());
	}
}