package year_2019.semester_b.period_b.solution.question_3;

public class Question3 {
	public static void main(String[] args) {
		int[][] mat= {{3,4,5,6}, {4,4,4,4} ,{5,3,-1,5},{5,6,7,8}};
		int[] list={6,7,52,8};
		testMat(mat, list);
	}
	
	public static void testMat(int[][] mat,int[] list ) {
		boolean found=true;
		
		for (int i = 0; i < mat.length; i++) {
			found=true;
			for (int j = 0; j < mat[i].length; j++) {
				if(!numberInLine(mat[i][j], list)) {
					found=false;
					break;
				}
			}
			if(found) {
				System.out.println("found in line "+(i+1));
				break;
			}
		}
		
		if(!found) {
			System.out.println("not found");
		}
	}
	
	private static boolean numberInLine(int num,int[] list) {
		for (int i = 0; i < list.length; i++) {
			if(list[i] == num) {
				return true;
			}
		}
		
		return false;
	}
}