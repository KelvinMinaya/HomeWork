package arrays;

public class Array_Declared {

	public static void main(String[] args) {
		// declare array

		int[] a = new int[5]; // Integer type
		a[0] = 5;
		a[1] = 15;
		a[2] = 25;
		a[3] = 35;
		a[4] = 3;
		// a[5]=7; ---This is an out of bounds(container count) index exception
		System.out.println(a[2]);
		System.out.println(a.length);// -- See the size of the array

		String[] b = new String[2]; // --String type
		b[0] = "Ryhan";
		b[1] = "Susan";

		System.out.println(b[1]);

		// literal presentation of array-declaring array
		int[] c = { 2, 3, 100 };// --at once declaring and putting values in the index
		System.out.println(c.length);// --size of the array
		System.out.println(c[2]);// --value inside container

	}

}
