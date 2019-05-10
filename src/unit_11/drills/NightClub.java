package unit_11.drills;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class NightClub {
	private final int MAX_NUMBER_OF_CLUBBERS = 50;
	private Clubber[] clubbers;
	
	public NightClub(){
		clubbers = new Clubber[MAX_NUMBER_OF_CLUBBERS];
	}
	
	public void addClubber(final Clubber clubber){
		for (int index = 0; index < clubbers.length; index++) {
			if(clubbers[index] == null){
				clubbers[index] = clubber;
				break;
			}
		}
	}
	
	public void save(final String fileName) throws FileNotFoundException{
		File file = new File(fileName);
		PrintWriter printWriter = new PrintWriter(file);
		for (int index = 0; index < clubbers.length; index++) {
			if(clubbers[index] != null){
				clubbers[index].save(printWriter);
			}
		}
		printWriter.close();
	}
}