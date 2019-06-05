package unit_13_recursions.drills;


public class Ex4 {

	public static void main(String[] args) {
		System.out.println(isRepeated("aaa"));
	}
	
	public static Boolean isRepeated(final String string){
		if(string.equals("")){
			return true;
		}
		return isRepeated(string.substring(0, string.length() - 2)) && 
				(string.toCharArray()[string.length() - 1] == string.toCharArray()[string.length() - 2] ? true : false);
	}
}
