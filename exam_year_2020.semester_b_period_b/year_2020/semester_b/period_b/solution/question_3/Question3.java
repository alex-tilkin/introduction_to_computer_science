package year_2020.semester_b.period_b.solution.question_3;

public class Question3 {
	
	public static void main(String[] args) {
		boolean result = isPerfect(123456789);
		
		System.out.println(result);
	}
	
	public static boolean isPerfect(int num) {
		int[] factors = getFactors(num);
		int sum = 0;
		for (int i=0 ; i < factors.length ; i++)
			sum += factors[i];
		
		return sum == num;
	}
	
	private static int countFactors(int num) {
		int count = 0; 
		
		for (int i=1 ; i <= num/2 ; i++) {
			if (num%i == 0)
				count++;
		}
		return count;
	}
	
	public static int[] getFactors(int num) {
		int[] res = new int[countFactors(num)];
		
		int index = 0;
		for (int i=1 ; i <= num/2 ; i++) {
			if (num%i == 0) {
				res[index] = i;
				index++;
			}
		}
		return res;
	}
}