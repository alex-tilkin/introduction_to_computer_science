package unit_08_objects_and_classes;

public class UsingGettersAndSettersWithValidation {

	public static void main(String[] args) {
		FootballPlayerWithAcceessRights footballPlayer = new FootballPlayerWithAcceessRights();
		
		footballPlayer.setNameWithValidation(null);
		footballPlayer.superbowlWins = 0;
		footballPlayer.team = "Los Angeles Rams";
		footballPlayer.setYearOfBirthWithValidation(-123);
		
		String name = footballPlayer.getName();
		int yearOfBirth = footballPlayer.getYearOfBirth();
		
		System.out.println("Name: " + name + ", Year of Birth: " + yearOfBirth);
	}
}