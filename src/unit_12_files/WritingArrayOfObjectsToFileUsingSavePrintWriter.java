package unit_12_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;

import unit_12_files.FootballPlayer.Position;
import unit_12_files.FootballPlayer.Team;

public class WritingArrayOfObjectsToFileUsingSavePrintWriter {

	public static void main(String[] args) throws FileNotFoundException {
		FootballPlayer[] footballPlayers = new FootballPlayer[2];
		
		FootballPlayer tomBrady = new FootballPlayer("Tom Brady", 12, Team.Patriots, Position.Quarterback);
		FootballPlayer julianEdelman = new FootballPlayer("Julian Edelman", 11, Team.Patriots, Position.WideReciever);
		
		footballPlayers[0] = tomBrady;
		footballPlayers[1] = julianEdelman;
		
		System.out.println(Arrays.toString(footballPlayers));
		
		String filePath = "src/unit_12/storage/football_players.txt";
		File file = new File(filePath);
		PrintWriter printWriter = new PrintWriter(file);
		printWriter.println(footballPlayers.length);
		for (FootballPlayer footballPlayer : footballPlayers) {
			footballPlayer.save(printWriter);
		}
		
		printWriter.close();
	}
}