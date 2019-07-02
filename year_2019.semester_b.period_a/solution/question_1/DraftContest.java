package solution.question_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import solution.question_1.AthleticAbilities;
import solution.question_1.FootballPlayer;

public class DraftContest {
	public final int NUMBER_OF_PLAYERS = 200;
	private FootballPlayer[] footballPlayers;
	private int nextPlayer = 0;
	
	public DraftContest() {
		footballPlayers = new FootballPlayer[NUMBER_OF_PLAYERS];
	}
	
	public void load(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		for(int index = 0; index < NUMBER_OF_PLAYERS; index++) {
			FootballPlayer footballPlayer = loadFootballPlayer(scanner);
			footballPlayers[index] = footballPlayer;
			
			scanner.nextLine(); // reading the delimiter line
			scanner.nextLine(); // escaping scanner
		}
		
		scanner.close();
	}
	
	public FootballPlayer nextPlayer() {
		return footballPlayers[nextPlayer++];
	}
	
	private FootballPlayer loadFootballPlayer(Scanner scanner) {
		String name = scanner.nextLine();
		String id = scanner.nextLine();
		String college = scanner.nextLine();
		FootballPlayer.Behavior behavior = FootballPlayer.Behavior.valueOf(scanner.nextLine());
		FootballPlayer.Position position = FootballPlayer.Position.valueOf(scanner.nextLine());
		FootballPlayer.GameTalentLevel gameTalentLevel = FootballPlayer.GameTalentLevel.valueOf(scanner.nextLine());
		AthleticAbilities athleticAbilities = loadAthleticAbilities(scanner);
		
		FootballPlayer footballPlayer = new FootballPlayer(name, id, college, behavior, position, gameTalentLevel, athleticAbilities);
		
		return footballPlayer;
	}


	private AthleticAbilities loadAthleticAbilities(Scanner scanner) {
		float speed = scanner.nextFloat();
		float verticalJump = scanner.nextFloat();
		float horizontalJump = scanner.nextFloat();
		int numberOfBenchPresses = scanner.nextInt();
		
		AthleticAbilities athleticAbilities = new AthleticAbilities(speed, verticalJump, horizontalJump, numberOfBenchPresses);
		
		return athleticAbilities;
	}
}