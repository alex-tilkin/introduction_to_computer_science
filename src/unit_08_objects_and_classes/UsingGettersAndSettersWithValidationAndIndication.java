package unit_08_objects_and_classes;

import java.util.Scanner;

public class UsingGettersAndSettersWithValidationAndIndication {

	public static void main(String[] args) {
		FootballPlayerWithAcceessRights footballPlayer = new FootballPlayerWithAcceessRights();
		Scanner scanner = new Scanner(System.in);
		
		String name;
		boolean isNameSet;
		do{
			System.out.print("Enter your name: ");
			name = scanner.nextLine();
			isNameSet = footballPlayer.setNameWithValidationAndIndication(name);	
		} while(!isNameSet);
		
		int yearOfBirth;
		boolean isYearOfBirthSet;
		do {
			System.out.print("Enter your year of birth: ");
			yearOfBirth = scanner.nextInt();
			isYearOfBirthSet = footballPlayer.setYearOfBirthWithValidationAndIndication(yearOfBirth);	
		} while (!isYearOfBirthSet);
		
		footballPlayer.superbowlWins = 0;
		footballPlayer.team = "Los Angeles Rams";
		
		footballPlayer.printInfo();
	}
}