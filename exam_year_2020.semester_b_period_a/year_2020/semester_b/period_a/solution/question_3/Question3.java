package year_2020.semester_b.period_a.solution.question_3;

public class Question3 {

	public static void main(String[] args) {
		int result = replaceOddDigitsWith0(2123456789);
		
		System.out.println("The result is " + result);
	}

	public static int replaceOddDigitsWith0(int number) {
		int newNumber = 0;
		int location = 1;
		
		while (number > 0) {
			int digit = number%10;
			if (digit%2 == 0) {
				digit *= location;
				newNumber += digit;
			}
			location *= 10;
			number /= 10;
		}
		
		return newNumber;
	}
}
