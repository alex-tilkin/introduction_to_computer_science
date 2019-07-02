package unit_01_simple_building_blocks;

public class Drill4 {

	public static void main(String[] args) {
		double startingPrice = 10.2;
		double priceForKm = 1.3;
		double priceForBriefcase = 2.0;
		
		double totalPrice = startingPrice + priceForKm + priceForBriefcase;
		
		System.out.println("The total price is " + totalPrice);
	}
}