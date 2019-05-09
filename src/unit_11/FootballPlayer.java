package unit_11;

public class FootballPlayer {
	public enum Position {Quarterback, TightEnd, WideReciever, CorenerBack};
	public enum Team {Patriots, Seahawks, Rams, Raiders};
	
	private Position position;
	private Team team;
	
	public FootballPlayer(Team team, Position position) {
		this.team = team;
		this.position = position;
	}
	
	public String toString() {
		return "Playing as " + position + " for the " + team;
	}
}