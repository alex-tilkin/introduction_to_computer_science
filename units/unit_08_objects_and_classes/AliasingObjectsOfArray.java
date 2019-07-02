package unit_08_objects_and_classes;

public class AliasingObjectsOfArray {

	public static void main(String[] args) {
		FootballPlayerFinalVersion[] footballTeam = new FootballPlayerFinalVersion[3];
		
		for (int index = 0; index < footballTeam.length; index++) {
			footballTeam[index] = new FootballPlayerFinalVersion();
		}
		
		footballTeam[0].setName("Tom Brady");
		footballTeam[1].setName("Julian Edelman");
		
		System.out.println("Before aliasing.");
		footballTeam[1].printInfo();
		
		footballTeam[1] = footballTeam[0];
		
		System.out.println("After aliasing.");
		footballTeam[1].printInfo();
	}
}