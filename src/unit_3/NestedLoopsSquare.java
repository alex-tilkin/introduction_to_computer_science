package unit_3;

public class NestedLoopsSquare {

	public static void main(String[] args) {
		final int HEIGHT = 3;
		final int WIDTH = 3;
		
		for (int indexA = 0; indexA < HEIGHT; indexA++) {
			for (int indexB = 0; indexB < WIDTH; indexB++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}