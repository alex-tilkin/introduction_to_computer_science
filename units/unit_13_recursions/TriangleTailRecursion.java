package unit_13_recursions;

public class TriangleTailRecursion {

	public static void main(String[] args) {
		triangle(1, 3);
	}

	private static void triangle(int currentLength, int size) {
		if(currentLength > size) {
			return;
		}
		
		for (int index = 0; index < currentLength; index++) {
			System.out.print("*");
		}
		
		System.out.println();
		
		triangle(currentLength + 1, size);
	}
}
