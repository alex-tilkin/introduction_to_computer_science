package year_2020.semester_b.period_a.solution.question_4;

public class Question4 {

	public static void main(String[] args) {
		int[][] matrix = {	{5, 8, 3, 0, 9},
							{2, 1, 2, 7, 4},
							{3, 5, 2, 8, 2},
							{7, 7, 6, 2, 8}};
		
		replaceBorderWith0(matrix, 1, 1);
		
		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column]);
			}
			
			System.out.println();
		}
	}

	public static void replaceBorderWith0(int[][] mat, int row, int col) {
		if (row > 0) { // top row
			mat[row-1][col] = mat[row-1][col+1] = 0;
		}
		
		if (col > 0) { // left col
			mat[row][col-1] = mat[row+1][col-1] = 0;
		}
		
		if (row < mat.length-2) { // buttom row
			mat[row+2][col] = mat[row+2][col+1] = 0;
		}
		
		if (col < mat[0].length-2) { // right col
			mat[row][col+2] = mat[row+1][col+2] = 0;
		}
		
		// the corners
		if (row > 0 && col > 0) // top-left
			mat[row-1][col-1] = 0;
		
		if (row > 0 && col < mat[0].length-2) // top-right
			mat[row-1][col+2] = 0;
		
		if (row < mat.length-2 && col > 0) // buttom-left
			mat[row+2][col-1] = 0;
		
		if (row < mat.length-2 && col < mat[0].length-2) // buttom-right
			mat[row+2][col+2] = 0;
	}
	
	public static boolean hasSquareWithSum(int[][] mat, int sum) {
		for (int i=0 ; i < mat.length-1 ; i++ ) {
			for (int j=0 ; j < mat[i].length-1 ; j++) {
				if (mat[i][j] + mat[i][j+1] + mat[i+1][j] + mat[i+1][j+1] == sum) {
					System.out.println(sum + " starts  at [" + i + "][" + j + "]");
					replaceBorderWith0(mat, i, j);
					return true;
				}
			}
		}
		return false;
	}
}
