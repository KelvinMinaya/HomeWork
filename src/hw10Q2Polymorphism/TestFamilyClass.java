package hw10Q2Polymorphism;

public class TestFamilyClass {

	public static void main(String[] args) {
		Sister sis = new Sister();
		Sister.sister(21, 30, 77, "8", 18, 19);// static method with override
		sis.sister(10, 63, 23, "6", 8);// parameterized void type method
		sis.sister(55, 62, 17);// return type method
		sis.sister();// void type method
		sis.sister(1, 2, 3, "4");// final type method

		System.out.println("\n");

		Niece nice = new Niece();
		Niece.sister(12, 55, 22, "8", 11, 22); // static method addition of 7 in the syntax
		nice.sister(7, 99, 3);// return method with multiplication of 4 added to syntax
		nice.sister(33, 14, 29, "56", 84);// parameterized method with multiplication by 18
		nice.sister();// void type method

	}

}
