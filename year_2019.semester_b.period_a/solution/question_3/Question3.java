package solution.question_3;

public class Question3 {

	public static void main(String[] args) {
		
		int[][] matrix = { 
				{ 1, 2, 3, 4 ,1}, 
				{ 0, 2, 2, 2 ,1}, 
				{ 1, 2, 9, 0 ,1}, 
				{ 2, 0, 2, 4 ,1},
				{ 1, 2, 1, 1 ,1}};
		
		findDigitsInRowOrColumn(matrix, 3);

	}
	public static void findDigitsInRowOrColumn(int[][] mat, int size){

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				//check to right
				for (int k = 1; k <= size && j + k < mat.length; k++) {
					if(mat[i][j] == mat[i][j+k]) {
						if (k == size-1) {
							System.out.println("point : " + i + "," + j);
							break;
						}							
					}else {
						break;
					}	
				}
				//check to bottom
				for (int k = 1; k <= size && i + k < mat.length; k++) {
					if(mat[i][j] == mat[i+k][j]) {
						if (k == size-1) {
							System.out.println("point : " + i + "," + j);
							break;
						}							
					}else {
						break;
					}	
				}
			}
		}
	}
}


