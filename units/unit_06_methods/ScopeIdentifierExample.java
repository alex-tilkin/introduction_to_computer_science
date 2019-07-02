package unit_06_methods;

public class ScopeIdentifierExample {

	public static void main(String[] args) {
		int x = 3;
		int y = doSomething(3);
		System.out.printf("The result of f(%d) is %d", x, y);
		
		{
			Boolean isIlligal = true;
		}
		
		//System.out.printf("This command won't compile, why? (%d)", illigal);
	}
	
	public static int doSomething(int input){
		int extraInput = input + 1;
		
		extraInput *= 2;
		
		return extraInput;
	}
}