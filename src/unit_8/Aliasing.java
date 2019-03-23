package unit_8;

public class Aliasing {

	public static void main(String[] args) {
		FootballPlayerFinalVersion tomBrady = new FootballPlayerFinalVersion();
		FootballPlayerFinalVersion jaredGoff = new FootballPlayerFinalVersion();
		
		tomBrady.setName("tom");
		tomBrady.setYearOfBirth(1977);
		
		jaredGoff.setName("Jared");
		jaredGoff.setYearOfBirth(1994);
		
		tomBrady.printInfo();
		jaredGoff.printInfo();
		
		jaredGoff = tomBrady;
		
		jaredGoff.printInfo();
	}
}