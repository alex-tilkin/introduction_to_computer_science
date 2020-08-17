package year_2020.semester_b.period_b.solution.question_4;

public class Question4 {

	public static void main(String[] args) {
		int[][] matrix = {	{123, 357, 782},
							{3691, 123, 39217},
							{983, 39871, 13},
							{369, 9963, 31}};
		
		boolean result = isBrothersMatrix(matrix);
		
		System.out.println(result);
	}
	
	public static boolean isBrothersMatrix(int[][] mat) {
		for (int i=0 ; i < mat.length ; i++) {
			for (int j=0 ; j < mat[0].length-1; j++) {
				if (!areBrothers(mat[i][j], mat[i][j+1]))
					return false;
			}
		}
		
		for (int i=0 ; i < mat[0].length ; i++) {
			for (int j=1 ; j < mat.length; j++) {
				if (!areBrothers(mat[j][i], mat[j-1][i]))
					return false;
			}
		}
		
		return true;
	}
	
	private static boolean areBrothers(int num1, int num2) {
		while (num2 > 10) {
			num2 /= 10;
		}
		
		return num1%10 == num2;
	}
}