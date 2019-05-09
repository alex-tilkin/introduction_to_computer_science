package unit_11;

import java.util.Arrays;

public class EnumsSimpleExample {
	public enum FootballPosition {Quarterback, TightEnd, WideReciever, CorenerBack};
	public static void main(String[] args) {
		FootballPosition footballPosition = FootballPosition.Quarterback;
		
		System.out.println(footballPosition.ordinal() + " is " + footballPosition.name());
		System.out.println("All the values:" + Arrays.toString(FootballPosition.values()));
	}
}