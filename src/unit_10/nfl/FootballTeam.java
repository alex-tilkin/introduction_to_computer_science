package unit_10.nfl;

public class FootballTeam {
	private String name;
	private FootballPlayer[] footballPlayers;
	private int numberOfFootballPlayers;
	
	public FootballTeam(String name, int maxNumberOfFootballPlayers) {
		this.setName(name);
		setNumberOfFootballPlayers(0);
		footballPlayers = new FootballPlayer[maxNumberOfFootballPlayers];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfFootballPlayers() {
		return numberOfFootballPlayers;
	}

	private void setNumberOfFootballPlayers(int numberOfFootballPlayers) {
		this.numberOfFootballPlayers = numberOfFootballPlayers;
	}

	public boolean addFootballPlayer(FootballPlayer footballPlayer) {
		if(numberOfFootballPlayers > footballPlayers.length) {
			return false;
		}
		
		footballPlayers[numberOfFootballPlayers] = footballPlayer;
		numberOfFootballPlayers++;
		
		return true;
	}

	public String toString() {
		StringBuffer stringBuffer = new StringBuffer(String.format("Name: %s, Number of Football Players: %d", name, numberOfFootballPlayers));
		
		for (int index = 0; index < numberOfFootballPlayers; index++) {
			stringBuffer.append("\t" + (index + 1) + ")" + footballPlayers[index].toString() + "\n");
		}
		
		return stringBuffer.toString();
	}
}