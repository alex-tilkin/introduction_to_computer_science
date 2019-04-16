package unit_10;

public class NFL {
	private FootballPlayer[] allFootballPlayers;
	private int numberOfFootballPlayers;
	private FootballTeam[] allFootballTeams;
	private int numberOfFootballTeams;
	
	public NFL(int maxFootballPlayers, int maxFootballTeams) {
		allFootballPlayers = new FootballPlayer[maxFootballPlayers];
		numberOfFootballPlayers = 0;
		
		allFootballTeams = new FootballTeam[maxFootballTeams];
		numberOfFootballTeams = 0;
	}
	
	public FootballTeam getFootballTeamByName(String footballTeamName) {
		for (int index = 0; index < allFootballTeams.length; index++) {
			if(allFootballTeams[index].getName() == footballTeamName) {
				return allFootballTeams[index];
			}
		}
		
		return null;
	}
	
	public FootballPlayer getFootballPlayerByName(String footballPlayerName) {
		for (int index = 0; index < allFootballPlayers.length; index++) {
			if(allFootballPlayers[index].getName() == footballPlayerName) {
				return allFootballPlayers[index];
			}
		}
		
		return null;
	}

	
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append(String.format("NFL has %d teams:\n", numberOfFootballTeams));
		for (int index = 0; index < allFootballPlayers.length; index++) {
			stringBuffer.append(String.format("%s\n\n", allFootballTeams[index].toString()));
		}
		
		return stringBuffer.toString();
	}
}