package collectionFrameWork;

import java.util.Arrays;

public class ArraysMethods {

	public static void main(String[] args) {
		int[] array1 = new int[3];
		array1[0] = 50;
		array1[1] = 400;
		array1[2] = 26;

		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		// toString method from Arrays class
		System.out.println(array1);// only gives array ID
		System.out.println(Arrays.toString(array1));

		// to sort the value--finding the smallest number
		Arrays.sort(array1);
		for (int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}

		// put copy of old argument index size and then = new index size
		int[] b = Arrays.copyOf(array1, 6);
		b[3] = 292;
		b[4] = 249;
		b[5] = 295;
		b[6] = 293;
		System.out.println(b[0]);

		// Hash code(unique id)
		System.out.println(Arrays.hashCode(array1));
		System.out.println(Arrays.hashCode(b));

	}

}
