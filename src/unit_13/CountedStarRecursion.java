package unit_13;

public class CountedStarRecursion {

	public static void main(String[] args) {
		star(3);
	}
	
	public static void star(int starCounter) {
		if(starCounter == 0) {
			return;
		}
		
		System.out.println("*");
		
		star(starCounter - 1);
	}
}