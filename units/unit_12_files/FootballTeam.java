package unit_12_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FootballTeam {
	private String name;
	private FootballPlayer[] footballPlayers;
	private int numberOfFootballPlayers;
	
	public FootballTeam(String name, int maxNumberOfFootballPlayers) {
		this.setName(name);
		setNumberOfFootballPlayers(0);
		footballPlayers = new FootballPlayer[maxNumberOfFootballPlayers];
	}

	public FootballTeam(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		
		name = scanner.nextLine();
		numberOfFootballPlayers = scanner.nextInt();
		footballPlayers = new FootballPlayer[45];
		for (int index = 0; index < numberOfFootballPlayers; index++) {
			scanner.nextLine();
			FootballPlayer footballPlayer = new FootballPlayer(scanner);
			footballPlayers[index] = footballPlayer;
		}
		
		scanner.close();
	}
	
	public void save(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		PrintWriter printWriter = new PrintWriter(file);
		
		printWriter.println(name);
		printWriter.println(numberOfFootballPlayers);
		for(int index = 0; index < numberOfFootballPlayers; index++) {
			footballPlayers[index].save(printWriter);
		}
		
		printWriter.close();
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfFootballPlayers() {
		return numberOfFootballPlayers;
	}

	private void setNumberOfFootballPlayers(int numberOfFootballPlayers) {
		this.numberOfFootballPlayers = numberOfFootballPlayers;
	}

	public boolean addFootballPlayer(FootballPlayer footballPlayer) {
		if(numberOfFootballPlayers > footballPlayers.length) {
			return false;
		}
		
		footballPlayers[numberOfFootballPlayers] = footballPlayer;
		numberOfFootballPlayers++;
		
		return true;
	}

	public String toString() {
		StringBuffer stringBuffer = new StringBuffer(String.format("Name: %s, Number of Football Players: %d\n", name, numberOfFootballPlayers));
		
		for (int index = 0; index < numberOfFootballPlayers; index++) {
			stringBuffer.append((index + 1) + ")" + footballPlayers[index].toString() + "\n");
		}
		
		return stringBuffer.toString();
	}
}