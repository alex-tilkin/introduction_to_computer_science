package unit_02_operators_and_conditions;

public class IfElseExampleMoreAccurate {

	public static void main(String[] args) {
		int julianEdelmanRank = 90;
		int jamesWhiteRank = 80;
		int robGronkowskiRank = 91;
		String julianEdelman = "Julian Edelman";
		String jamesWhite = "James White";
		String robGronkowski = "Rob Gronkowski";
		String targetedWideReciever = "";

		if (julianEdelmanRank > jamesWhiteRank && julianEdelmanRank > robGronkowskiRank) {
			targetedWideReciever = julianEdelman;
		} else {
			if (robGronkowskiRank > jamesWhiteRank) {
				targetedWideReciever = robGronkowski;
			} else {
				targetedWideReciever = jamesWhite;
			}
		}

		System.out.println("Tom Brady passes to " + targetedWideReciever);
	}
}