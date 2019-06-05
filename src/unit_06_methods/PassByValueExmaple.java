package unit_06_methods;

public class PassByValueExmaple {
	
	public static void main(String[] args) {
		int x = 5;
		
		print(x);
		nullify(x);
		print(x);
	}
	
	public static void nullify(int x){
		if(x < 0){
			return;
		}
		
	}
	
	public static void print(int x){
		System.out.println("The value is " + x);		
	}
}