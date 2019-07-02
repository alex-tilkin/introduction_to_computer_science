package unit_08_objects_and_classes.practice;

public class Practice8 {

	public static void main(String[] args) {
		Politician deri = new Politician("Deri", 1960, 123456789);
		Politician bibi = new Politician("Bibi", 1965, 123456781);
		Politician gants = new Politician("Gants", 1966, 123456782);
		Politician bar = new Politician("Bar", 1997, 123456780);
		
		Party rightWing = new Party("Right Wing", "Some stuff that no one can understand");
		Party leftWing = new Party("Left Wing", "What the right wind said but the NOT");
		
		rightWing.addMember(deri);
		rightWing.addMember(bibi);
		
		leftWing.addMember(gants);
		leftWing.addMember(bar);
	}
}