package unit_06_methods;

import java.util.Arrays;

public class MultiplicationOfLargeNumbers {

	public static void main(String[] args) {
		// int[] num1 = new int[] {1, 2, 3,5, 4, 2, 1, 4, 1, 5, 4, 5, 4, 5, 4, 5, 4, 5,
		// 4, 5, 4, 5, 4, 5, 4, 5 ,4 ,4};
		// int[] num2 = new int[] {1, 7, 1, 4, 5, 4, 6, 5, 4, 6, 5, 4, 6, 5, 4, 5, 4, 5,
		// 4, 5, 4, 4, 5, 4, 8, 5, 4, 4, 5, 4, 4, 5, 4, 5};

		int[] num1 = new int[] { 1, 2, 3 };
		int[] num2 = new int[] { 3, 2, 3 };
		int[] result = multiplyNumbers(num1, num2);

		System.out.println(Arrays.toString(result));
	}

	static int[] multiplyNumbers(int[] s1, int[] s2) {
		int len1 = s1.length;
		int len2 = s2.length;

		int[] res = new int[len1 + len2]; // stores result
		int[] top = new int[Math.max(len1, len2)]; // top of multiplaction table
		int[] bottom = new int[Math.min(len1, len2)]; // lower number of multiplication table;
		int[] tops = len1 >= len2 ? s1 : s2;
		int[] bottoms = len1 >= len2 ? s2 : s1;

		// reverse and store both numbers
		for (int i = 0; i < top.length; i++) {
			top[i] = tops[tops.length - i - 1];
		}

		for (int i = 0; i < bottom.length; i++) {
			bottom[i] = bottoms[bottoms.length - i - 1];
		}

		int start = -1;
		int end = 0;

		for (int i = 0; i < bottom.length; i++) {
			start++; // counter to shift the result for each iteration
			int carry = 0;
			int counter = start;
			for (int j = 0; j < top.length; j++) {
				int x = res[counter] + top[j] * bottom[i] + carry;
				int update = x % 10;
				carry = x / 10;
				res[counter++] = update;
			}
			if (carry != 0) {
				res[counter++] = carry;
			}

			end = counter;
		}

		int[] realResult = new int[res.length];
		for (int i = end - 1; i >= 0; i--) {
			realResult[end - i] = res[i];
		}

		return realResult;
	}
}