package year_2019.semester_b.period_b.solution.question_2;


public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumDigitsPower(68));//100
		System.out.println(isHappyNumber(68, 8));//true
		print3ConsecutiveHappyNumbers(100, 3);//1880,1881,1882
	}

	public static void print3ConsecutiveHappyNumbers(int fromNum, int numOfConsecutivesToFind) {
		final int NUM_OF_CONSECUTIVES = 3;
		if (numOfConsecutivesToFind > 0) {
			if (isHappyNumber(fromNum, 8)) {
				numOfConsecutivesToFind--;
			} else {
				numOfConsecutivesToFind = NUM_OF_CONSECUTIVES;
			}
			fromNum++;
			print3ConsecutiveHappyNumbers(fromNum, numOfConsecutivesToFind);
		} else {
			System.out.println((fromNum-3) + "," + (fromNum-2) + "," + (fromNum-1));	
		}
	}

	public static boolean isHappyNumber(int num, int numRetries) {
		int tempResult = 0;
		if (num > 1 && numRetries != 0) {
			tempResult = sumDigitsPower(num);
			numRetries--;
			return isHappyNumber(tempResult, numRetries);
		} else if (num == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static int sumDigitsPower(int num) {
		int result = 0;
		int modulo;
		if (num > 0) {
			modulo = num % 10;
			num = num / 10;
			result = (int) Math.pow(modulo, 2);
			return result + sumDigitsPower(num);
		} else {
			return result;
		}
	}

}
