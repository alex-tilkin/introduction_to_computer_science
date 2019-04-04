package unit_9;

public class Coach {
	private String name;
	private int yearsOfExperience;
	private Team team;
	
	public Coach(String name, int yearsOfExperience, Team team) {
		this.name = name;
		this.yearsOfExperience = yearsOfExperience;
		this.setTeam(team);
	}
	
	public Coach(String name, int yearsOfExperience) {
		this(name, yearsOfExperience, null);
	}
	
	public String getName() {
		return name;
	}
	
	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}
}
