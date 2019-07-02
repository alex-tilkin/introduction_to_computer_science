package unit_09_constructors_and_this;

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

	public void setTeam(Team newTeam) {
		if(team != newTeam) {
			team = newTeam;
			if(team != null) {
				team.setCoach(this);
			}
		}
	}
	
	public void show() {
		System.out.print(name + "'s experience is " + 
				yearsOfExperience + " years, and he " + 
				(team == null ? "doesn't coach any team now" : "coaches the team " + team.getName()));
	}
}