package unit_11_static_and_enum;

import java.util.Scanner;

public class ReceivingEnumFromUsed {
	public enum FootballPosition {Quarterback, TightEnd, WideReciever, CorenerBack};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your favorite position on in the game of Football?");
		FootballPosition footballPosition = FootballPosition.valueOf(scanner.next());
		System.out.println("Your favorite position in the game of football is " + footballPosition + " (" + footballPosition.ordinal() + ")");
	}
}