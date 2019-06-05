package unit_02_operators_and_conditions;

public class IfElseExample {

	public static void main(String[] args) {
		int julianEdelmanRank = 90;
		int jamesWhiteRank = 80;
		int robGronkowskiRank = 91;
		String julianEdelman = "Julian Edelman";
		String jamesWhite = "James White";
		String robGronkowski = "Rob Gronkowski";
		String targetedWideReciever = jamesWhite;

		if (julianEdelmanRank > jamesWhiteRank && julianEdelmanRank > robGronkowskiRank) {
			targetedWideReciever = julianEdelman;
		} else {
			targetedWideReciever = robGronkowski + " or " + jamesWhite;
		}

		System.out.println("Tom brady passes to " + targetedWideReciever);
	}
}