package lec11_java;

public class CompareAge {

	public static void main(String[] args) {
		int ageOfAlex = 21;
		int ageOfJenifer = 21;
		
		if (ageOfAlex % 2 == 0 && (ageOfAlex < ageOfJenifer)) {
			System.out.println("Alex is" + ageOfAlex + ",which is an even number and he is younger than Jenifer" + ",the age of Jenifer");
		}
			
			else if (ageOfAlex % 2 == 0 && (ageOfAlex < ageOfJenifer)) {
				System.out.println("Alex is" + ageOfAlex + ",which is an even number and he is younger than Jenifer" + ",the age of Jenifer");
			}	
			else if (ageOfAlex % 2 == 1 && (ageOfAlex > ageOfJenifer)) {
				System.out.println("Alex is" + ageOfAlex + ",which is an odd number and he is older than Jenifer" + ",the age of Jenifer");
			}		
			else if (ageOfAlex % 2 == 0 && (ageOfAlex == ageOfJenifer)) {
				System.out.println("Alex is" + ageOfAlex + ",which is an even number and they are not the same age" + ",the age of Jenifer");
			}	
			else if (ageOfAlex % 2 == 0 && (ageOfAlex == ageOfJenifer)) {
				System.out.println("Alex is" + ageOfAlex + ",which is an even number and they are the same age" + ",the age of Jenifer");
			}	
			else if (ageOfAlex % 2 == 1 && (ageOfAlex == ageOfJenifer)) {
				System.out.println("Alex is" + ageOfAlex + ",which is an even number and the are not the same age" + ",the age of Jenifer");
			}	
			else if (ageOfAlex % 2 == 0 && (ageOfAlex < ageOfJenifer)) {
				System.out.println("Alex is" + ageOfAlex + ",which is an even number and he is younger than Jenifer" + ",the age of Jenifer");
			}
			else if (!(ageOfAlex % 2 == 0 && ageOfAlex >= ageOfJenifer)) {
				System.out.println("Alex is" + ageOfAlex + ",which is an even number or Alex may be older" + ",the age of Jenifer");
			}	
			else if (ageOfAlex % 2 == 0 && (ageOfAlex <= ageOfJenifer)) {
				System.out.println("Alex is" + ageOfAlex + ",which is an even number or Alex may be younger" + ",the age of Jenifer");
			}	
			else {
				System.out.println("Alex is" + ageOfAlex + ",which is an odd number and they are the same  age" + ",the age of Jenifer");
			}	
		
		
		
		
		
	}

}
