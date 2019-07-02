package unit_12_files;

import java.io.FileNotFoundException;

import unit_12_files.FootballPlayer.Position;
import unit_12_files.FootballPlayer.Team;

public class SavingFootballTeamToFile {

	public static void main(String[] args) throws FileNotFoundException {
		FootballPlayer tomBrady = new FootballPlayer("Tom Brady", 12, Team.Patriots, Position.Quarterback);
		FootballPlayer julianEdelman = new FootballPlayer("Julian Edelman", 11, Team.Patriots, Position.WideReciever);
		FootballTeam patriots = new FootballTeam("Patriots", 45);
		
		patriots.addFootballPlayer(tomBrady);
		patriots.addFootballPlayer(julianEdelman);
		
		patriots.save("src/unit_12/storage/patriots.txt");
	}
}