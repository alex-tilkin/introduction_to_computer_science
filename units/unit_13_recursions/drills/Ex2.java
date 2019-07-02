package unit_13_recursions.drills;


public class Ex2 {

	public static void main(String[] args) {
		System.out.println(isAscending(12345));

	}
	
	public static final Boolean isAscending(final int number){
		if(number == 0){
			return true;
		}
		
		if(number % 10 < (number / 10) % 10){
			return false;
		}
		
		return isAscending(number / 10);
	}
}