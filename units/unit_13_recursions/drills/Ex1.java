package unit_13_recursions.drills;


public class Ex1 {

	public static void main(String[] args) {
		System.out.println(sum(1234));
	}
	
	public static final int sum(final int number){
		if(number == 0){
			return 0;
		}
		
		return sum(number / 10) + number % 10;
	}
}