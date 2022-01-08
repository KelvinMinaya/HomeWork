package arrays;

import java.util.ArrayList;

public class ArrayGeneric {
	// When you make a Generic Array List only the chosen type is acceptable
	// ex. 41 versus someone writing "forty one". In this instance on integer 41 is
	// accepted
	// Inetger must be spelled out for generic
	public static void main(String[] args) {
		ArrayList<Integer> intArray = new ArrayList();
		intArray.add(1);
		intArray.add(15);
		intArray.add(16);
		intArray.add(123);

		ArrayList<String> sArray = new ArrayList<>();
		sArray.add("");// null is an empty string and accepted as a value
		sArray.add("Kelvin");
		sArray.add("Marsha");
		sArray.add("Adaya");
		sArray.add("Charlie");

		// for each loop (:)<--- colon separates each Object-->sArray<-- contains all 5
		// objects for the loop
		// The Array list is splitting elements to one at a time
		for (String name : sArray) {
			System.out.println(name);
		}

	}

}
