package unit_05_arrays_and_matrices;

import javax.naming.SizeLimitExceededException;

public class SimpleArrayInitAndAccess {

	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);		
		}
	}

}
