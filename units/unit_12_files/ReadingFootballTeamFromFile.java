package unit_12_files;

import java.io.FileNotFoundException;

public class ReadingFootballTeamFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		FootballTeam patriots = new FootballTeam("src/unit_12/storage/patriots.txt");
		
		System.out.println(patriots);
	}
}