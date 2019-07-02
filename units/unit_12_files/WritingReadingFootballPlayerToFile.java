package unit_12_files;

import java.io.FileNotFoundException;

public class WritingReadingFootballPlayerToFile {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "src/unit_12/storage/football_player.txt";

		FootballPlayer footballPlayer = new FootballPlayer("Tom Brady", 12, FootballPlayer.Team.Patriots, FootballPlayer.Position.Quarterback);		
		footballPlayer.save(filePath);
		FootballPlayer footballPlayerFromFile = new FootballPlayer(filePath);
	}
}