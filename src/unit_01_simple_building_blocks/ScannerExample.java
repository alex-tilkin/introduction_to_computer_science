package unit_01_simple_building_blocks;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String[] args) {
		System.out.println("Please provide the price for the piece");
		Scanner scanner = new Scanner(System.in);
		double price = scanner.nextDouble();
		double priceIncludingVat = price * 1.17;
		System.out.println("Price including VAT is " + priceIncludingVat);
	}
}