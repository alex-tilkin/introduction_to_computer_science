package unit_09_constructors_and_this;

public class Team {
	private String name;
	private int numOfChampionships;
	private Coach coach;
	
	public Team(String name, int numOfChampionships) {
		this.name = name;
		this.numOfChampionships = numOfChampionships;
		setCoach(null);
	}

	public String getName() {
		return name;
	}

	public Coach getCoach() {
		return coach;
	}

	public void setCoach(Coach newCoach) {
		if (coach != newCoach && coach != null) {
			coach.setTeam(null);
		}
		
		coach = newCoach;
		if(coach != null) {
			coach.setTeam(this);
		}
	}

	public void addChampionship() {
		numOfChampionships++;
	}
	
	public int getNumOfChampionships() {
		return numOfChampionships;
	}
	
	public void show() {
		System.out.println("The team " + name + " won " + numOfChampionships + " championships" + 
				(coach != null ? ", coach is " + coach.getName() : ""));
	}
}