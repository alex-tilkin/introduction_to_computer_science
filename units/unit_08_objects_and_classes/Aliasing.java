package unit_08_objects_and_classes;

public class Aliasing {

	public static void main(String[] args) {
		int a;
		FootballPlayerFinalVersion emptyFoolballPlayer;
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