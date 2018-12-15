package unit_6;

public class MethodsOverload {

	public static void main(String[] args) {
		int parameter1 = 1;
		int parameter2 = 2;
		int parameter3 = 3;
		
		int result = add(parameter1, parameter2);
		System.out.println(result);
		
		result = add(parameter1, parameter2, parameter3);
		System.out.println(result);
		
		double resultInDouble = add((double)parameter1, (double)parameter2);
		System.out.println(resultInDouble);
	}
	
	public static int add(int parameter1, int parameter2){
		System.out.println("in int add(int parameter1, int parameter2)");

		int result = parameter1 + parameter2;
			
		return result;
	}
	
	public static int add(int parameter1, int parameter2, int parameter3){
		System.out.println("in int add(int parameter1, int parameter2, int parameter3)");

		int result = parameter1 + parameter2 + parameter3;
				
		return result;
	}
	
	public static double add(double parameter1, double parameter2){
		System.out.println("in double add(double parameter1, double parameter2)");

		double result = parameter1 + parameter2;
			
		return result;
	}
}