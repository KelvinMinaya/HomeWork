package collectionFrameWork;

public class Array_PrintArray {

	public static void main(String[] args) {
		String students[] = new String[5];
		students[0] = "Sohag";
		students[1] = "Sohan";
		students[2] = "Sam";
		students[3] = "Sherry";
		students[4] = "Super";

		// by index number print
		System.out.println(students[0]);

		// print the entire array-Use For Loop
		for (int i = 0; i < 5; i++) {
			System.out.println(students[i]);// -i prints the whole loop/array(all container values)

		}
		
		// printing with each individual/advanced loop
		for(String s: students) {
			System.out.println(s);
		}
		
		//while loop
		int j=0;
		while(j<5) {
			System.out.println(students[j]);
			j++;
		}
		
		//difference between while and do loop. While checks condition first. Do loop checks condition after print
		int k=0;
		do {System.out.println(students[k]);
		k++;
		}
		while(k<5); 
			
		
		
	}
}