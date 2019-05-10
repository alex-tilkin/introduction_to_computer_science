package unit_11.drills;

import java.io.PrintWriter;


public class Clubber {
	public enum Gender{
		MALE{
//			@Override
//			public String toString() {
//				return "Male";
//			}
		},		
		FEMALE{
//			@Override
//			public String toString() {
//				return "Female";
//			}
		};		
		
		//public abstract String toString();
	}
	private String name;
	private Gender gender;
	private static int clubbersCounter;
	
	public Clubber(final String name, final Gender gender){
		this.name = name;
		this.gender = gender;
		clubbersCounter++;
		System.out.println(this.name + " joined the club");
	}
	
	public void save(PrintWriter printWriter){
		printWriter.println(name + ";" + gender.toString() + ";" + clubbersCounter);
	}
}
