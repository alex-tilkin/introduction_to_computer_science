package unit_08_objects_and_classes;

public class UsingGettersAndSetters {

	public static void main(String[] args) {
		FootballPlayerWithAcceessRights footballPlayer = new FootballPlayerWithAcceessRights();
		
		footballPlayer.setName("Jared Goff");
		footballPlayer.superbowlWins = 0;
		footballPlayer.team = "Los Angeles Rams";
		footballPlayer.setYearOfBirth(1996);
		
		String name = footballPlayer.getName();
		int yearOfBirth = footballPlayer.getYearOfBirth();
		
		System.out.println("Name: " + name + ", Year of Birth: " + yearOfBirth);
	}
}