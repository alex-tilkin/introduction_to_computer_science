package unit_13_recursions;

public class Triangle {

	public static void main(String[] args) {
		triangle(3);
	}

	private static void triangle(int size) {
		if(size == 0) {
			return;
		}
		
		triangle(size - 1);
		
		for (int index = 0; index < size; index++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
}
