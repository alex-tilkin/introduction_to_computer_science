package unit_7;

import java.util.Scanner;

public class DrillSortAndSearch {

	public static void main(String[] args) {
		int[][] matrix = {	{13, 99, 6, 18, 5},
							{71, 49, 74, 15, 47},
							{93, 73, 22, 61, 38},
							{72, 42, 19, 54, 34},
							{26, 55, 84, 71, 25}};
		
		System.out.println("Matrix before sort:");
		printMatrix(matrix);
		System.out.println();
		
		sortMatrix(matrix);
		
		System.out.println("Matrix after sort:");
		printMatrix(matrix);
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to search for in the matrix:");
		int number = scanner.nextInt();
		scanner.close();
		System.out.println("Searching for " + number + "...");
		int[] coordinates = searchInMatrix(matrix, number);
		if(coordinates[0] == -1) {
			System.out.println(number + " doesn't exist in the matrix");	
		}
		else {
			System.out.println(number + " is in coordinate [" + coordinates[0] + "][" + coordinates[1] + "]");
		}
	}

	private static int[] searchInMatrix(int[][] matrix, int number) {
		int[] coordinates = {-1, -1};
		int column;
		
		for (int row = 0; row < matrix.length; row++) {
			column = binarySearch(matrix[row], number);
			if(column != -1) {
				coordinates[0] = row;
				coordinates[1] = column;
				
				return coordinates;
			}
		}
		
		return coordinates;
	}

	private static void sortMatrix(int[][] matrix) {
		boolean isSorted;
		
		do{
			isSorted = true;
			for(int index = 0; index < matrix.length; index++){
				isSorted = bubblesort(matrix[index]);
				//isSorted = selectionsort(matrix[index]);
				//isSorted = insertionsort(matrix[index]);
			}
			
			for (int row = 0; row < matrix.length - 1; row++) {
				if(matrix[row][matrix.length - 1] < matrix[row + 1][0]){
					continue;
				}
				
				int temp = matrix[row][matrix.length - 1];
				matrix[row][matrix.length - 1] = matrix[row + 1][0];
				matrix[row + 1][0] = temp;
				isSorted = false;
			}
		}while(!isSorted);
	}
	
	private static boolean bubblesort(int[] array) {
		boolean isSorted = true;
		
	    for (int i = 0; i < array.length; i++) {
	        for(int j = 0; j < array.length - 1; j++) {
	            if(array[j] > array[j+1]) {
	                swap(j, j+1, array);
	                isSorted = false;
	            }
	        }
	    }
	    
	    return isSorted;
	}
	
	private static boolean selectionsort(int array[]) {
		boolean isSorted = true;
		int length = array.length;

		for (int index = 0; index < length - 1; index++) {
			int min_idx = index;
			for (int indexB = index + 1; indexB < length; indexB++){
				if (array[indexB] < array[min_idx]) {
					min_idx = indexB;
					isSorted = false;
				}
			}

			int temp = array[min_idx];
			array[min_idx] = array[index];
			array[index] = temp;
		}
		
		return isSorted;
	}
	
	private static boolean insertionsort(int arr[]) {
		boolean isSorted = true;
		int n = arr.length;
		
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
				isSorted = false;
			}
			
			arr[j + 1] = key;
		}
		
		return isSorted;
	}
	
	static int binarySearch(int arr[], int x) {
		int lowBoundry = 0;
		int highBoundry = arr.length - 1;
		
		while (lowBoundry <= highBoundry) {
			int m = lowBoundry + (highBoundry - lowBoundry) / 2;
			if (arr[m] == x){
				return m;
			}
			
			if (arr[m] < x){
				lowBoundry = m + 1;
			}
				
			else{
				highBoundry = m - 1;	
			}
		}
		
		return -1;
	}
	
	private static void swap(int index1, int index2, int[] array) {
	    int temp = array[index2];
	    array[index2] = array[index1];
	    array[index1] = temp;
	}
	
	private static void printMatrix(int[][] matrix) {
		for (int indexA = 0; indexA < matrix.length; indexA++) {
			for (int indexB = 0; indexB < matrix.length; indexB++) {
				System.out.print(matrix[indexA][indexB] + "\t");
			}
			
			System.out.println();
		}
		System.out.println();
	}
}