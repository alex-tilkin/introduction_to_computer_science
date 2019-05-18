package unit_12;

import java.io.FileNotFoundException;
import java.util.Arrays;
import unit_12.FootballPlayer.Position;
import unit_12.FootballPlayer.Team;

public class WritingArrayOfObjectsToFileUsingSaveUri {

	public static void main(String[] args) throws FileNotFoundException {
		FootballPlayer[] footballPlayers = new FootballPlayer[2];
		
		FootballPlayer tomBrady = new FootballPlayer("Tom Brady", 12, Team.Patriots, Position.Quarterback);
		FootballPlayer julianEdelman = new FootballPlayer("Julian Edelman", 11, Team.Patriots, Position.WideReciever);
		
		footballPlayers[0] = tomBrady;
		footballPlayers[1] = julianEdelman;
		
		System.out.println(Arrays.toString(footballPlayers));
		
		String filePath = "src/unit_12/storage/football_players.txt";
		for (FootballPlayer footballPlayer : footballPlayers) {
			footballPlayer.save(filePath);
		}
	}
}