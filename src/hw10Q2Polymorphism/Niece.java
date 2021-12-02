package hw10Q2Polymorphism;

public class Niece extends Sister {

	// return type method with multiplication by 4
	public int sister(int age1, int age2, int age3) {
		int total1 = age1 + age2 + age3 * 4;
		System.out.println("The total of sister is:" + total1);
		return total1;
	}

	// static type method with override (+7) different syntax
	public static int sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		int total2 = age1 + age2 + age3 + Integer.parseInt(age4) + age5 + age6 + 7;
		System.out.println("The total of static sister is:" + total2);

		return total2;

	}

	// different parameter and multiplication by 18
	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5) {
		int total = age1 + age2 + age3 + Integer.parseInt(age4) + age5 * 18;
		System.out.println("The total of void sister is:" + total);
	}

	// void type method also using same method name
	public void sister() {
		System.out.println("This is the sister void type method");
	}

	/*
	 * final type method can't be overriden public final int sister(int age1, int
	 * age2, int age3, String age4) { int total3 = age1 + age2 + age3 +
	 * Integer.parseInt(age4);
	 * System.out.println("This return is from the final method"); return total3; }
	 */

}
