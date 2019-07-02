package unit_08_objects_and_classes;

public class ArrayOfObjects {
	public static void main(String[] args) {
		String name  = "Tzach";
		name = "Michael";
		name = "Michael the Student";
		name += " went home";
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("Tzach");
		stringBuffer.append(", Michale");
		stringBuffer.append(", Bar");
		stringBuffer.append(", and Assaf");
		System.out.println(stringBuffer);
		
		FootballPlayerFinalVersion footballPlayer;
		
		FootballPlayerFinalVersion[] footballTeam = new FootballPlayerFinalVersion[3];
		
		for (int index = 0; index < footballTeam.length; index++) {
			footballTeam[index] = new FootballPlayerFinalVersion();
		}
	}
}