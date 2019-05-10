package unit_11.drills;

import java.io.FileNotFoundException;


public class Ex1 {

	public static void main(String[] args) throws FileNotFoundException {
		NightClub nightClub = new NightClub();
		
		Clubber bar = new Clubber("Bar Refaeli", Clubber.Gender.FEMALE);
		Clubber oz = new Clubber("Oz Zehavi", Clubber.Gender.MALE);
		Clubber matthew = new Clubber("Matthew Mcconaughey", Clubber.Gender.MALE);
		Clubber alexandera = new Clubber("Alexandra Daddario", Clubber.Gender.FEMALE);
		
		nightClub.addClubber(bar);
		nightClub.addClubber(oz);
		nightClub.addClubber(matthew);
		nightClub.addClubber(alexandera);
		
		nightClub.save("clubbers.txt");
	}
}