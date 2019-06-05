package unit_11_static_and_enum;

import java.util.Arrays;

public class EnumsSimpleExample {
	public enum FootballPosition {Quarterback, TightEnd, WideReciever, CorenerBack};
	public static void main(String[] args) {
		FootballPosition footballPosition = FootballPosition.Quarterback;
		
		System.out.println(footballPosition.ordinal() + " is " + footballPosition.name());
		System.out.println("All the values:" + Arrays.toString(FootballPosition.values()));
	}
}