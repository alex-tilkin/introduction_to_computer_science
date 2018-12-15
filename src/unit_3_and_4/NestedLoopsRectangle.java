package unit_3_and_4;

public class NestedLoopsRectangle {

	public static void main(String[] args) {
		final int HEIGHT = 3;
		final int WIDTH = 7;
		
		for (int indexA = 0; indexA < HEIGHT; indexA++) {
			for (int indexB = 0; indexB < WIDTH; indexB++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}