package unit_08_objects_and_classes;

public class StringBufferExample {

	public static void main(String[] args) {
		String name  = "Tzach";
		name = "Michael";
		name = "Michael the Student";
		name += " went home";
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer = new StringBuffer();
		stringBuffer.append("Tzach");
		stringBuffer.append(", Michale");
		stringBuffer.append(", Bar");
		stringBuffer.append(", and Assaf");
		System.out.println(stringBuffer);
	}
}