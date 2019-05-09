package unit_11;

import java.util.Arrays;

public class ArraysCopyExample {

	public static void main(String[] args) {
		int[] originalArray = new int[] {5, 3, 2, 8};
		int[] newArray = Arrays.copyOf(originalArray, originalArray.length);
		
		System.out.println("Printing arrays of value type before the change");
		System.out.println(Arrays.toString(originalArray));
		System.out.println(Arrays.toString(newArray));
		
		originalArray[3] = 300;
		
		System.out.println("Printing arrays of value type after the change");
		System.out.println(Arrays.toString(originalArray));
		System.out.println(Arrays.toString(newArray));
		
		Person[] peopleArray = new Person[2];
		peopleArray[0] = new Person("David", 38);
		peopleArray[1] = new Person("Yael", 29);
		
		Person[] newPeopleAray = Arrays.copyOf(peopleArray, peopleArray.length);
		
		System.out.println("Printing arrays of reference type before the change");
		System.out.println(Arrays.toString(peopleArray));
		System.out.println(Arrays.toString(newPeopleAray));
		newPeopleAray[0].setName("Tom");
		
		System.out.println("Printing arrays of reference type after the change");
		System.out.println(Arrays.toString(peopleArray));
		System.out.println(Arrays.toString(newPeopleAray));
	}
}