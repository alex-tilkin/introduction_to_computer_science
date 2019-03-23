package unit_8;

public class ArrayOfObjects {
	public static void main(String[] args) {
		FootballPlayerFinalVersion[] footballTeam = new FootballPlayerFinalVersion[3];
		
		for (int index = 0; index < footballTeam.length; index++) {
			footballTeam[index] = new FootballPlayerFinalVersion();
		}
	}
}