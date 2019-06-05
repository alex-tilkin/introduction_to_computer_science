package unit_10_composition.nfl;

import java.util.Scanner;

public class NflExample {
	static Scanner scanner = new Scanner(System.in);
 
	public static void main(String[] args) {
		NFL nfl = CreateNfl();
		runMainMenu(nfl);
		scanner.close();
	}

	private static void runMainMenu(NFL nfl) {
		int answer = 0;
		final int EXIT = -1;
		
		do {
			System.out.println();
			System.out.println("1. Add football teams");
			System.out.println("2. Add football players");
			System.out.println("3. Print all data");
			System.out.println("4. Change player's rank");
			System.out.println(EXIT + "\t" + " to exit");
			answer = scanner.nextInt();
			scanner.nextLine();
			
			switch (answer) {
				case 1: {
					addFootallTeams(nfl);
				}
				break;
				case 2:{
					addFootballPlayers(nfl);
				}
				break;
				case 3:{
					System.out.println(nfl.toString());
				}
				break;
				case 4:{
					changeFootballPlayerRank(nfl);
				}
				break;
				case EXIT:{
					System.out.println("Bye");
				}
				break;
				default:{
					System.out.println("Invalid option");
				}
				break;
			}
		}while(answer != EXIT);		
	}

	private static void changeFootballPlayerRank(NFL nfl) {
		String name;
		int rank;
		
		System.out.println("What is the name of the player?");
		name = scanner.nextLine();
		
		FootballPlayer footballPlayer = nfl.getFootballPlayerByName(name);
		if(footballPlayer == null) {
			System.out.println("No football player was found");
			
			return;
		}
		
		System.out.println("What is the new rank?");
		rank = scanner.nextInt();
		footballPlayer.setRank(rank);
		
		System.out.println("The rank was changed");
	}

	private static void addFootballPlayers(NFL nfl) {
		boolean isContinue = true;
		String name;
		int salary;
		int rank;
		String targetTeam;
		
		do{
			System.out.println("What is the name of the player?");
			name = scanner.nextLine();
			System.out.println("What is the salary of the player?");
			salary = scanner.nextInt();
			System.out.println("What is the rank of the player?");
			rank = scanner.nextInt();
			System.out.println("To which team is this player headed?");
			scanner.nextLine();
			targetTeam = scanner.nextLine();
			
			FootballPlayer footballPlayer = new FootballPlayer(name, salary, rank);
			boolean result = nfl.addFootballPlayerToFootballTeam(footballPlayer, targetTeam);
			if(result) {
				System.out.println("Would you like to add another player? (Y/n)");
				char answer = scanner.next().charAt(0);
				scanner.nextLine();
				if(answer == 'n' || answer == 'N') {
					isContinue = false;
				} else if(answer != 'Y' && answer != 'y') {
					System.out.println("Invalid answer");
				}
			}
			else {
				System.out.println("Can't add anymore player, full capacity or football team name doesn't exist");
				isContinue = false;
			}
			
		} while(isContinue);
	}

	private static void addFootallTeams(NFL nfl) {
		boolean isContinue = true;
		String footballTeamName;
		int maxNumberOfPlayers;
		
		do{
			System.out.println("What is the name of the team?");
			footballTeamName = scanner.nextLine();
			System.out.println("What is the maximum number of players?");
			maxNumberOfPlayers = scanner.nextInt();
			
			boolean result = nfl.addFootballTeam(footballTeamName, maxNumberOfPlayers);
			if(result) {
				System.out.println("Would you like to add another team? (Y/n)");
				char answer = scanner.next().charAt(0);
				scanner.nextLine();
				if(answer == 'n' || answer == 'N') {
					isContinue = false;
				} else if(answer != 'Y' && answer != 'y') {
					System.out.println("Invalid answer");
				}
			}
			else {
				System.out.println("Can't add anymore football teams");
				isContinue = false;
			}
			
		} while(isContinue);
	}

	private static NFL CreateNfl() {
		int maxPlayers;
		int maxTeams;
		
		System.out.println("Enter maximum number of players:");
		maxPlayers = scanner.nextInt();
		System.out.println("Enter maximum number of teams:");
		maxTeams = scanner.nextInt();
		NFL nfl = new NFL(maxPlayers, maxTeams);
		
		return nfl;
	}
}