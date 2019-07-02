package unit_12_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingObjectsFromFile {

	public static void main(String[] args) throws FileNotFoundException {
		String filePath = "src/unit_12/storage/football_players.txt";
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		int numberOfFootballPlayers = scanner.nextInt();
		FootballPlayer[] footballPlayers = new FootballPlayer[numberOfFootballPlayers];
		for (int index = 0; index < footballPlayers.length; index++) {
			FootballPlayer footballPlayer = new FootballPlayer(filePath);
		}
		
		scanner.close();
		
		System.out.println(Arrays.toString(footballPlayers));
	}
}