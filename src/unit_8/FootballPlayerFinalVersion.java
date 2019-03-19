package unit_8;

public class FootballPlayerFinalVersion {
	private int yearOfBirth;
	private String name;
	String team;
	int superbowlWins;

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public boolean setYearOfBirth(int yearOfBirth) {
		if(yearOfBirth < 0){
			System.out.println("Invalid yearOfBirth, cant be negative");
			
			return false;
		}
		
		this.yearOfBirth = yearOfBirth;
		
		return true;
	}
	
	public String getName() {
		return name;
	}

	public boolean setName(String name) {
		if(name == null || name.equals("")){
			System.out.println("Invalid name, can't be NULL or empty string");
			
			return false;
		}
		
		this.name = name;
		
		return true;
	}
	
	void throwBall() {
		System.out.println(name + " is throwing the ball");
	}

	void jump() {
		System.out.println(name + " is jumping");
	}

	void run() {
		System.out.println(name + " running");
	}

	void printInfo() {
		System.out.println("Name: " + name);
		System.out.println("Team: " + team);
		System.out.println("Year of Birth: " + yearOfBirth);
		System.out.println("Superbowl Wins: " + superbowlWins);
	}
}
