package unit_6;

public class ReturnMatrixArray {

	public static void main(String[] args) {
		int[][] matrix = newMatrx();
		printMatrix(matrix);
		int[] array = newArray();
		printArray(array);
	}

	private static void printArray(int[] array) {
		System.out.println("Printign array:");
		for (int i : array) {
			System.out.print(i + "\t");
		}
		
		System.out.println();
	}

	private static int[] newArray() {
		int[] array = new int[]{1, 2, 3};
		
		return array;
	}

	private static void printMatrix(int[][] matrix) {
		System.out.println("Printign matrix:");
		for (int[] line : matrix) {
			for (int index = 0; index < line.length; index++) {
				System.out.print(line[index] + "\t");
			}
			
			System.out.println();
		}
	}

	private static int[][] newMatrx() {
		int[][] matrix = new int[][]{{1, 2}, {3, 4}};
		
		return matrix;
	}
}