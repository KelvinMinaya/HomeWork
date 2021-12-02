package hw10Q2Polymorphism;

public class Sister {

	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3;
		System.out.println("The total of sister is:" + total1);
		return total1;
	}

	public static int sister(int age1, int age2, int age3,String age4,int age5,int age6) {
		int total2= age1+ age2 + age3 +Integer.parseInt(age4) + age5 + age6 + 7; 
		System.out.println("The total of static sister is:" + total2);
	
		return total2;
	
	}
	

	// parameterized void type method
	public void sister(int age1, int age2, int age3,String age4,int age5) {
		int total= age1+ age2 + age3 + Integer.parseInt(age4) + age5;
		System.out.println("The total of void sister is:"+ total);
	}
	
	// void type method
	public void sister() {
		System.out.println("This is the sister void type method");
	}
	
	public final int sister(int age1, int age2, int age3,String age4) {
		int total3 = age1 + age2 + age3 +Integer.parseInt(age4);
				System.out.println("This return is from the final method");
				return total3;
	}
	
	
	
}		


	
	
	
	
	
	
	
	
	
	

