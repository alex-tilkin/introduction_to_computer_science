package unit_1;

import java.util.Scanner;

public class Constants {
	public static void main(String[] args) {
		final double VAT = 1.17;
		System.out.println("Please provide the price for the piece");
		Scanner scanner = new Scanner(System.in);
		double price = scanner.nextDouble();
		double priceIncludingVat = price * VAT;
		System.out.println("Price including VAT is " + priceIncludingVat);
	}
}