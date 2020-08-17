package year_2020.semester_b.period_b.solution.question_2;

public class Question2B {

	private static final String OPEN_BRACKET = "{";
	private static final String CLOSED_BRACKET = "} ";
	private static final String EMPTY_STRING = "";

	public static void main(String[] args) {
		final String s = "ABCD";

		int startIndex = 0;
		breakIntoSubStringsWithoutOverlaps(s, startIndex, EMPTY_STRING);
	}
	
	public static void breakIntoSubStringsWithoutOverlaps(String str, int i, String out) {
		if (i == str.length()) {
			System.out.println(out);
			return;
		}

		// consider each substring S[i, j]
		for (int j = str.length() - 1; j >= i; j--) {
			String subStr = OPEN_BRACKET + str.substring(i, j + 1) + CLOSED_BRACKET;

			// append the substring to the result and recur with 
			// index of the next character to be processed and 
			// result string so far
			breakIntoSubStringsWithoutOverlaps(str, j+1, out+subStr);
		}
	}
}
