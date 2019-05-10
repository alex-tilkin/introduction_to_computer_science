package unit_11;

public class FootballPlayerEnumExmple {

	public static void main(String[] args) {
		FootballPlayer footballPlayer = new FootballPlayer(FootballPlayer.Team.Patriots, FootballPlayer.Position.Quarterback);
		
		System.out.println(footballPlayer.toString());
	}
}