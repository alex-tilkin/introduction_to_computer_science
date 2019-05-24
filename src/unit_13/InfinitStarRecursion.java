package unit_13;

public class InfinitStarRecursion {
	public static void main(String[] args) {
		star();
	}
	
	public static void star() {
		System.out.println("*");
		
		star();
	}
}