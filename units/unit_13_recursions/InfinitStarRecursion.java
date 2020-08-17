package unit_13_recursions;

public class InfinitStarRecursion {
	public static void main(String[] args) {
		star();
	}
	
	public static void star() {
		System.out.print("*");
		
		star();
	}
}