package unit_10.nfl;

public class FootballPlayer {
	private String name;
	private int salary;
	private int rank;
	
	public FootballPlayer(String name, int salary, int rank) {
		setName(name);
		setSalary(salary);
		setRank(rank);
	}

	public FootballPlayer(FootballPlayer otherFootballPlayer) {
		this(otherFootballPlayer.name, otherFootballPlayer.salary, otherFootballPlayer.rank);
	}
	
	public String toString() {
		return String.format("Name = %s, Salary = %d, Rank = %d", name, salary, rank);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
}