package unit_9;

public class CoachTeamExample {

	public static void main(String[] args) {
		Team team = new Team("New England Patriots", 6);
		Coach coach = new Coach("Bill Belicheck", 6);
		
		team.setCoach(coach);
	}
}