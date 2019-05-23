package unit_13;

public class StarRecursion {
	public static void main(String[] args) {
		star();
	}
	
	public static int count = 1;
	public static void star() {
		System.out.println(count++);
		
		star();
	}
}