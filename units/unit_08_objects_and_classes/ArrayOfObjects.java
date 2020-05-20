package unit_08_objects_and_classes;

public class ArrayOfObjects {
	public static void main(String[] args) {
		FootballPlayerFinalVersion footballPlayer;
		
		FootballPlayerFinalVersion[] footballTeam = new FootballPlayerFinalVersion[3];
		
		for (int index = 0; index < footballTeam.length; index++) {
			footballTeam[index] = new FootballPlayerFinalVersion();
		}
	}
}