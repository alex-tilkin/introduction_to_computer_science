package unit_3_and_4;

public class NestedLoopsTriangle {

	public static void main(String[] args) {
		
		final int HEIGHT = 5;
		int width = 1;
		for (int indexA = 0; indexA < HEIGHT; indexA++) {
			for (int indexB = 0; indexB < width; indexB++) {
				System.out.print("*");
			}
			
			width++;
			System.out.println();
		}
	}
}