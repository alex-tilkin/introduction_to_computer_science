package unit_9;

public class Team {
	private String name;
	private int numOfChampionships;
	private Coach coach;
	
	public Team(String name, int numOfChampionships) {
		this.name = name;
		this.numOfChampionships = numOfChampionships;
		coach = null;
	}
}
