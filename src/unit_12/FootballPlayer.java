package unit_12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FootballPlayer {
	public enum Position {Quarterback, TightEnd, WideReciever, CorenerBack};
	public enum Team {Patriots, Seahawks, Rams, Raiders};
	
	private Position position;
	private Team team;
	private String name;
	private int number;
	
	public FootballPlayer(String name, int number, Team team, Position position) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.position = position;
	}
	
	public FootballPlayer(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		name = scanner.nextLine();
		number = scanner.nextInt();
		position = Position.valueOf(scanner.next());
		team = Team.valueOf(scanner.next());
		
		scanner.close();
	}
	
	public FootballPlayer(Scanner scanner) {
		name = scanner.nextLine();
		number = scanner.nextInt();
		position = Position.valueOf(scanner.next());
		team = Team.valueOf(scanner.next());
	}
	
	public void save(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		PrintWriter printWriter = new PrintWriter(file);
		
		printWriter.println(name);
		printWriter.println(number);
		printWriter.println(position);
		printWriter.println(team);
		
		printWriter.close();
	}
	
	public void save(PrintWriter printWriter) {
		printWriter.println(name);
		printWriter.println(number);
		printWriter.println(position);
		printWriter.println(team);
	}
	
	public String toString() {
		return name + " is playing as " + position + " for the " + team + ", his number is " + number;
	}
}