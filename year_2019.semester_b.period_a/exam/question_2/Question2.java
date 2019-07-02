package exam.question_2;

public class Question2 {

	public static void main(String[] args) {
		System.out.println(isElfish("whiteleaf"));
		System.out.println(isXish("whiteleaf", "whiteleafness"));
	}
	
	public static boolean isElfish(String word) {
		return isContainsChars(word, "elf");
	}

	private static boolean isContainsChars(String word, String checker) {
		return false;
	}
	
	public static boolean isXish(String origin, String compare) {
		return false;
	}
}
