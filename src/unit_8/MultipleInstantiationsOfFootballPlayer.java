package unit_8;

public class MultipleInstantiationsOfFootballPlayer {

	public static void main(String[] args) {
		FootballPlayer jaredGoff = new FootballPlayer();
		
		jaredGoff.name = "Jared Goff";
		jaredGoff.superbowlWins = 0;
		jaredGoff.team = "Los Angeles Rams";
		jaredGoff.yearOfBirth = 1996;

		FootballPlayer tomBrady = new FootballPlayer();
		
		tomBrady.name = "Tom Brady";
		tomBrady.superbowlWins = 6;
		tomBrady.team = "New England Patriots";
		tomBrady.yearOfBirth = 1977;
		
		System.out.println("Information about Jared Goff:");
		jaredGoff.printInfo();
		System.out.println("");
		System.out.println("Information about Tome Brady:");
		tomBrady.printInfo();
	}
}