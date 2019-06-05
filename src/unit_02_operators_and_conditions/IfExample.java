package unit_02_operators_and_conditions;

public class IfExample {

	public static void main(String[] args) {
		int julianEdelmanRank = 90;
		int jamesWhiteRank = 80;
		String targetedWideReciever = "Jame White";

		if (julianEdelmanRank > jamesWhiteRank) {
			targetedWideReciever = "Julian Edelman";
		}

		System.out.println("Tom brady passes to " + targetedWideReciever);
	}
}