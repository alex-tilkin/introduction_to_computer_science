package exam.question_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DraftContest {
	public final int NUMBER_OF_PLAYERS = 200;
	private FootballPlayer[] footballPlayers;
	
	public DraftContest() {
		footballPlayers = new FootballPlayer[NUMBER_OF_PLAYERS];
	}
	
	public FootballPlayer nextPlayer() {
		return null;
	}
	
	public void load(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		for(int index = 0; index < NUMBER_OF_PLAYERS; index++) {
			loadFootballPlayer(scanner);
			
			scanner.nextLine(); // reading the delimiter line
			scanner.nextLine(); // escaping scanner
		}
		
		scanner.close();
	}

	private FootballPlayer loadFootballPlayer(Scanner scanner) {
		String name = scanner.nextLine();
		String id = scanner.nextLine();
		FootballPlayer.Position position = FootballPlayer.Position.valueOf(scanner.nextLine());
		FootballPlayer.GameTalentLevel gameTalentLevel = FootballPlayer.GameTalentLevel.valueOf(scanner.nextLine());
		loadAthleticAbilities(scanner);
		
		return null;
	}

	private AthleticAbilities loadAthleticAbilities(Scanner scanner) {
		float speed = scanner.nextFloat();
		float verticalJump = scanner.nextFloat();
		float horizontalJump = scanner.nextFloat();
		
		return null;
	}
}