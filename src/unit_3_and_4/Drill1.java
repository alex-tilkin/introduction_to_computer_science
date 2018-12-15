package unit_3_and_4;

public class Drill1 {

	public static void main(String[] args) {
        int a = 3;
        int b = 1;
        int c = 2;
        int t;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("sorting...");

        if (a > b) {
            t = b;
            b = a;
            a = t;
        }
        
        if (a > c) {
            t = c;
            c = a;
            a = t;
        }
        
        if (b > c) {
            t = c;
            c = b;
            b = t;
        }
        
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
	}

}
