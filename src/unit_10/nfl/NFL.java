package unit_10.nfl;

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
		for (int index = 0; index < numberOfFootballTeams; index++) {
			if(allFootballTeams[index].getName().equals(footballTeamName)) {
				return allFootballTeams[index];
			}
		}
		
		return null;
	}
	
	public FootballPlayer getFootballPlayerByName(String footballPlayerName) {
		for (int index = 0; index < numberOfFootballPlayers; index++) {
			if(allFootballPlayers[index].getName() == footballPlayerName) {
				return allFootballPlayers[index];
			}
		}
		
		return null;
	}

	public boolean addFootballPlayerToFootballTeam(FootballPlayer footballPlayer, String footballTeamName) {
		if(numberOfFootballPlayers == allFootballPlayers.length) {
			return false;
		}
		
		FootballTeam footballTeam = getFootballTeamByName(footballTeamName);
		if(footballTeam == null) {
			return false;
		}
		
		allFootballPlayers[numberOfFootballPlayers] = new FootballPlayer(footballPlayer);
		footballTeam.addFootballPlayer(footballPlayer);
		numberOfFootballPlayers++;
		
		return true;
	}
	
	public boolean addFootballTeam(String footballTeamName, int maxNumberOfFootballPlayers) {
		if(numberOfFootballTeams == allFootballTeams.length) {
			return false;
		}
		
		FootballTeam footballTeam = new FootballTeam(footballTeamName, maxNumberOfFootballPlayers);
		allFootballTeams[numberOfFootballTeams] = footballTeam;
		numberOfFootballTeams++;
		
		return true;
	}
	
	public String toString() {
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append(String.format("NFL has %d teams:\n", numberOfFootballTeams));
		for (int index = 0; index < numberOfFootballTeams; index++) {
			stringBuffer.append(String.format("%s\n\n", allFootballTeams[index].toString()));
		}
		
		return stringBuffer.toString();
	}
}