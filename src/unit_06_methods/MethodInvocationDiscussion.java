package unit_06_methods;

public class MethodInvocationDiscussion {

	public static void main(String[] args) {
		int x = 5;
		
		x(x);
		System.out.println("x = " + x);
		
		x = x(x);
		System.out.println("x = " + x);
	}
	
	public static int x(int x){
		int y = x;
		
		y++;
		x--;
		
		return y;
	}
}