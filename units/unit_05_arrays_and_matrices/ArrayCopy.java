package unit_05_arrays_and_matrices;

public class ArrayCopy {

	public static void main(String[] args) {
		int[] array = {100, 200, 300};
		int[] array2 = new int[array.length];
		
		for (int index = 0; index < array2.length; index++) {
			array2[index] = array[index];
		}
		
		System.out.println("Before change");
		String out = "";
		for (int index = 0; index < array.length; index++) {
			out += array[index] + ",";
		}
		
		String out2 = "";	
		for (int index = 0; index < array2.length; index++) {
			out2 += array2[index] + ",";
		}
		
		System.out.println(out);
		System.out.println(out2);
		
		array2[1] = -1;
		
		System.out.println("After change");
		out = "";
		for (int index = 0; index < array.length; index++) {
			out += array[index] + ",";
		}
		
		out2 = "";	
		for (int index = 0; index < array2.length; index++) {
			out2 += array2[index] + ",";
		}
		
		System.out.println(out);
		System.out.println(out2);
	}
}