package year_2020.semester_b.period_a.exam.question_2;

public class Question2a {

	public static void main(String[] args) {

	}
	
	public static void what(int a, int b) {
		if (b == 0) {
			System.out.print(1 + " ");
			return;
		}
		
		what(a, b-1);
		System.out.print(what2(a,  b) + " ");
	}

	public static int what2(int x, int y) {
		if (y == 0)
			return 1;
		
		return x*what2(x, y-1);
	}
}
