package unit_06_methods;

public class FirstProgramWithMethod {

	public static void main(String[] args) {
		int x = 3;
		int y = f(3);
		System.out.printf("The result of f(%d) is %d", x, y);
	}

	public static int f(int x){
		return x + 1;
	}
}