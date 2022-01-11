package collectionFrameWork;

public class MutiDimensionalArray {

	public static void main(String[] args) {
		// regular array
		int[] a = new int[3];
		a[0] = 5;// regular value declared

		// Dimensional array
		int[][] a1 = new int[2][3];// first container is the row-second container is column
									// declare values
		a1[1][0] = 20;// 1 is the row and 3 is the column making the value 20 for that selection
		a1[1][1] = 21;
		a1[0][2] = 12;
		// to run the complete array(print all values) use a nested loop(loop within a loop)
		//
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(a1[i][j]);
			}
		}

	}

}
