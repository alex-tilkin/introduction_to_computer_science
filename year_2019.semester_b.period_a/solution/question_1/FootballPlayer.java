package solution.question_1;

import java.io.PrintWriter;

public class FootballPlayer {
	public enum Behavior {TeamPlayer, LoneWolf, CoOperative, TotalMess}
	
	public enum GameTalentLevel {Low, Average, Good, Talent, Star}
	
	public enum Position {Quarterback, RunningBack, WideReceiver, TightEnd, OffensiveLine, Center, Guard, OffensiveTackle, 
		DefensiveEnd, DefensiveTackle, Linebacker, Cornerback, Safety}
	
	private String name;
	private String id;
	private String college;
	private Behavior behavior;
	private Position position;
	private AthleticAbilities athleticAbilities;
	private GameTalentLevel gameTalentLevel;
	
	public FootballPlayer(String name, String id, String college, Behavior behavior, Position position, GameTalentLevel gameTalentLevel, AthleticAbilities athleticAbilities) {
		this.name = name;
		this.id = id;
		this.college = college;
		this.behavior = behavior;
		this.position = position;
		this.athleticAbilities = athleticAbilities;
		this.gameTalentLevel = gameTalentLevel;
	}
	
	public float calculateScore() {
		float athleticAbilitiesAverageScore = athleticAbilities.calculateAverageScore();
		float score = behavior.ordinal() + athleticAbilitiesAverageScore + gameTalentLevel.ordinal();
		
		return score;
	}

	public Position getPosition() {
		return position;
	}

	public String getId() {
		return id;
	}

	public void printDetails() {
		System.out.println(name);
		System.out.println(id);
		System.out.println(college);
		System.out.println(behavior.toString());
		System.out.println(position.toString());
		System.out.println(gameTalentLevel.toString());
		athleticAbilities.printDetails();
	}
	
	public void save(PrintWriter printWritter) {
		printWritter.println(name);
		printWritter.println(id);
		printWritter.println(college);
		printWritter.println(behavior.toString());
		printWritter.println(position.toString());
		printWritter.println(gameTalentLevel.toString());
		athleticAbilities.save(printWritter);
	}
}