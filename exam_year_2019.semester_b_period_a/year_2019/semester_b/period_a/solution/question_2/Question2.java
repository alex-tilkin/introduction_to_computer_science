package year_2019.semester_b.period_a.solution.question_2;

public class Question2 {

	public static void main(String[] args) {
		System.out.println(isElfish("whiteleaf"));
		System.out.println(isXish("whiteleaf", "whiteleaf"));
	}
	
	public static boolean isElfish(String word) {
		return isContainsChars(word, "elf");
	}

	private static boolean isContainsChars(String word, String checker) {
		if(checker.length() == 0) {
			return true;
		} else if(word.length() == 0) {
			return false;
		}
		
		if(checker.contains(word.charAt(0) + "")) {
			return isContainsChars(word.substring(1), checker.replace(word.charAt(0) + "", ""));
		}
		
		return isContainsChars(word.substring(1), checker);
	}
	
	public static boolean isXish(String origin, String compare) {
		return isElfish(origin) && isContainsChars(compare, origin);
	}
}