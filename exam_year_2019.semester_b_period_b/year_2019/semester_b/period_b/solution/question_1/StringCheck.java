package year_2019.semester_b.period_b.solution.question_1;

public class StringCheck {
	public static final int CHAR_NOT_FOUND=-1;

	public static boolean onlyLetters(String str) {
		for (int i = 0; i < str.length(); i++) {
			if(!Character.isLetter(str.charAt(i))){
				return false;
			}
		}
		return true;
	}
	public static int findChar(String str,char findMe) {
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==findMe) {
				return i;
			}
		}
		return CHAR_NOT_FOUND;
	}
	public static boolean isStartWithCapital(String str) {
		String cap=str.toUpperCase();
		char first=cap.charAt(0);
		if(first<'A'||first>'Z') {
			//not a letter
			return false;
		}
		return(first==str.charAt(0));
		
	}
	public static void main(String[] args) {
		System.out.println(onlyLetters("rtrtFFr"));
	}

}
